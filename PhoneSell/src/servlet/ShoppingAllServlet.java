package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.Shopping;
import dao.ShoppingDaoImpl;



@WebServlet("/ShoppingAll")
public class ShoppingAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8"); 
		response.setContentType("text/html; charset=UTF-8");
		String phoneNumber = request.getParameter("phoneNumber");
		ShoppingDaoImpl sdi = new ShoppingDaoImpl();
		
		List<Shopping> list =sdi.queryAll(phoneNumber);
		Gson gson = new Gson();
		String info = gson.toJson(list);
		PrintWriter out = response.getWriter();
		out.write(info);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}