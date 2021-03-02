package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ShoppingDaoImpl;

@WebServlet("/ShoppingDelete")
public class ShoppingDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8"); 
		response.setContentType("text/html; charset=UTF-8");
		int phoneID = Integer.parseInt(request.getParameter("phoneID"));
		String phoneNumber = request.getParameter("phoneNumber");
		System.out.print(phoneID);
		ShoppingDaoImpl sdi = new ShoppingDaoImpl();
		sdi.deleteByOne(phoneNumber,phoneID);

		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
