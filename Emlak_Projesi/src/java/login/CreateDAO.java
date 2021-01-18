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
public class CreateDAO {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;
	
	public CreateDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}

    CreateDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
	
	public boolean insertUser(User user) throws SQLException {
		String sql = "INSERT INTO user (email,password,fullname) VALUES (?, ?, ?)";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
                statement.setString(2, user.getEmail());
                statement.setString(3, user.getPassword());
		statement.setString(1, user.getFullname());
		
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowInserted;
	}
	
	public List<User> listAllUser() throws SQLException {
		List<User> listUser = new ArrayList<>();
		
		String sql = "SELECT * FROM user";
		
		connect();
		
		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String email = resultSet.getString("email");
			String password = resultSet.getString("password");
			String fullname = resultSet.getString("fullname");
			
			User user = new User(id, email, password, fullname);
			listUser.add(user);
		}
		
		resultSet.close();
		statement.close();
		
		disconnect();
		
		return listUser;
	}
	

	

	
	public User getCreate(int id) throws SQLException {
		User user = null;
		String sql = "SELECT * FROM user WHERE id = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setInt(1, id);
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
                        String email = resultSet.getString("email");
			String password = resultSet.getString("password");
			String fullname = resultSet.getString("fullname");
			
			user = new User(id, email, password, fullname);
		}
		
		resultSet.close();
		statement.close();
		
		return user;
	}

    User checkLogin(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
