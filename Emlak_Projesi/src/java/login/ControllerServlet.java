package login;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ControllerServlet.java
 * This servlet acts as a page controller for the application, handling all
 * requests from the user.
 * @author www.codejava.net
 */
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CreateDAO createDAO;
        private EmlakDAO emlakDAO;

	public void init() {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");

		createDAO = new CreateDAO(jdbcURL, jdbcUsername, jdbcPassword);
                emlakDAO = new EmlakDAO(jdbcURL, jdbcUsername, jdbcPassword);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
                            
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertCreate(request, response);
				break;
                        case "/new1":
				showNew1Form(request, response);
				break;
			case "/insert1":
				insert1Emlak(request, response);
				break;
			case "/delete1":
				delete1Emlak(request, response);
				break;
			case "/edit1":
				showEdit1Form(request, response);
				break;
			case "/update1":
				update1Emlak(request, response);
				break;
			default:
				listEmlak(request, response);
				break;
                                
                                
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
                
	}

	private void listCreate(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<User> listUser = createDAO.listAllUser();
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
		dispatcher.forward(request, response);
	}



	private void insertCreate(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String fullname = request.getParameter("fullname");

		User newUser = new User(email, password, fullname);
		createDAO.insertUser(newUser);
		response.sendRedirect("welcome.jsp");
	}
        
        	private void listEmlak(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Emlak> listEmlak = emlakDAO.listAllEmlak();
		request.setAttribute("listEmlak", listEmlak);
		RequestDispatcher dispatcher = request.getRequestDispatcher("EmlakList.jsp");
		dispatcher.forward(request, response);
	}

	private void showNew1Form(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("EmlakForm.jsp");
		dispatcher.forward(request, response);
	}

	private void showEdit1Form(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Emlak existingEmlak = emlakDAO.getEmlak(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("EmlakForm.jsp");
		request.setAttribute("emlak", existingEmlak);
		dispatcher.forward(request, response);

	}

	private void insert1Emlak(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String il = request.getParameter("il");
		String ilce = request.getParameter("ilce");
		float fiyat = Float.parseFloat(request.getParameter("fiyat"));
                String ozellik = request.getParameter("ozellik");

		Emlak newEmlak = new Emlak(il, ilce, fiyat, ozellik);
		emlakDAO.insert1Emlak(newEmlak);
		response.sendRedirect("list");
	}

	private void update1Emlak(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String il = request.getParameter("il");
		String ilce = request.getParameter("ilce");
		float fiyat = Float.parseFloat(request.getParameter("fiyat"));
                String ozellik = request.getParameter("ozellik");

		Emlak emlak = new Emlak(id, il, ilce, fiyat, ozellik);
		emlakDAO.update1Emlak(emlak);
		response.sendRedirect("list");
	}

	private void delete1Emlak(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		Emlak emlak = new Emlak(id);
		emlakDAO.delete1Emlak(emlak);
		response.sendRedirect("list");

	}






}
