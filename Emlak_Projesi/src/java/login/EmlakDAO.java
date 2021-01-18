/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * AbstractDAO.java
 * This DAO class provides CRUD database operations for the table book
 * in the database.
 * @author www.codejava.net
 *
 */
public class EmlakDAO {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;
	
	public EmlakDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}

 
	
	protected void connect() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			}
			jdbcConnection = DriverManager.getConnection(
										jdbcURL, jdbcUsername, jdbcPassword);
		}
	}
	
	protected void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}
	
	public boolean insert1Emlak(Emlak emlak) throws SQLException {
		String sql = "INSERT INTO emlak (il, ilce, fiyat, ozellik) VALUES (?, ?, ?, ?)";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, emlak.getIl());
		statement.setString(2, emlak.getIlce());
		statement.setFloat(3, emlak.getFiyat());
                statement.setString(4, emlak.getOzellik());
		
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowInserted;
	}
	
	public List<Emlak> listAllEmlak() throws SQLException {
		List<Emlak> listEmlak = new ArrayList<>();
		
		String sql = "SELECT * FROM emlak";
		
		connect();
		
		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			int id = resultSet.getInt("idemlak");
			String il = resultSet.getString("il");
			String ilce = resultSet.getString("ilce");
			float fiyat = resultSet.getFloat("fiyat");
			String ozellik = resultSet.getString("ozellik");
                        
			Emlak emlak = new Emlak(id, il, ilce, fiyat, ozellik);
			listEmlak.add(emlak);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return listEmlak;
	}
	
	public boolean delete1Emlak(Emlak emlak) throws SQLException {
		String sql = "DELETE FROM emlak where idemlak = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setInt(1, emlak.getId());
		
		boolean rowDeleted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowDeleted;		
	}
	
	public boolean update1Emlak(Emlak emlak) throws SQLException {
		String sql = "UPDATE emlak SET il = ?, ilce = ?, fiyat = ?, ozellik = ?";
		sql += " WHERE idemlak = ?";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, emlak.getIl());
		statement.setString(2, emlak.getIlce());
		statement.setFloat(3, emlak.getFiyat());
                statement.setString(4, emlak.getOzellik());
		statement.setInt(5, emlak.getId());
		
		boolean rowUpdated = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowUpdated;		
	}
	
	public Emlak getEmlak(int id) throws SQLException {
		Emlak emlak = null;
		String sql = "SELECT * FROM emlak WHERE idemlak = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setInt(1, id);
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
			String il = resultSet.getString("il");
			String ilce = resultSet.getString("ilce");
			float fiyat = resultSet.getFloat("fiyat");
                        String ozellik = resultSet.getString("ozellik");
			
			emlak = new Emlak(id , il, ilce, fiyat, ozellik);
		}
		
		resultSet.close();
		statement.close();
		
		return emlak;
	}


}
