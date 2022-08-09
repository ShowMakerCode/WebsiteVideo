package Controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EntityImpDAO.VideoImp;
import Dao.InterfaceClass.VideoDao;
import Model.Video;

/**
 * Servlet implementation class HomePage
 */
@WebServlet("/index")
public class HomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	VideoDao videoService = new VideoImp();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Video> videos = videoService.findAll();
		request.setAttribute("videos", videos);
		request.getRequestDispatcher("/views/index.jsp").forward(request, response);
	}

	

}
