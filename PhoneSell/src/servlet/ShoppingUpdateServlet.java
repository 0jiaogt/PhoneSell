package servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.ShoppingDaoImpl;



@WebServlet("/ShoppingUpdate")
public class ShoppingUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8"); 
		response.setContentType("text/html; charset=UTF-8");
		int number = Integer.parseInt(request.getParameter("number"));
		int phoneID = Integer.parseInt(request.getParameter("phoneID"));
		String phoneNumber =request.getParameter("phoneNumber");
		ShoppingDaoImpl sdi = new ShoppingDaoImpl();
		sdi.update(phoneNumber, phoneID, number);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}