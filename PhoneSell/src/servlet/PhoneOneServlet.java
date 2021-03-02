package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.Phone;
import dao.PhoneDaoImpl;


@WebServlet("/PhoneOne")
public class PhoneOneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8"); 
		response.setContentType("text/html; charset=UTF-8");
		int id = Integer.parseInt(request.getParameter("phoneId"),10);
		
		//String s = request.getParameter("phoneId");
		//System.out.println(s);
		PhoneDaoImpl pdi = new PhoneDaoImpl(); 
		Phone phone =pdi.queryById(id);
		Gson gson = new Gson();
		String info = gson.toJson(phone);
		PrintWriter out = response.getWriter();
		out.write(info);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
