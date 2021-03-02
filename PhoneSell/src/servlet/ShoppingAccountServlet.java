package servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


import dao.ShoppingDaoImpl;

@WebServlet("/ShoppingAccount")
public class ShoppingAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8"); 
		response.setContentType("text/html; charset=UTF-8");
		String phoneNumber =request.getParameter("phoneNumber");
		ShoppingDaoImpl sdi = new ShoppingDaoImpl();
		float accounts=sdi.closeAccounts(phoneNumber);
		Gson gson = new Gson();
		String info = gson.toJson(accounts);
		PrintWriter out = response.getWriter();
		out.write(info);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
