package Controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.EntityImpDAO.UserImp;
import Dao.InterfaceClass.UserDao;

/**
 * Servlet implementation class ControllerForUser
 */
@WebServlet(urlPatterns = {"/user/login","/user/logout","/user/register","/user/changepass","user/updateaccount"})
public class ControllerForUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDao UserService = new UserImp();   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String path = request.getServletPath();
		if (path.equals("/user/login")) {
			System.out.println("aaa");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
