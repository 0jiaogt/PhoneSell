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

import dao.Phone;
import dao.PhoneDaoImpl;


@WebServlet("/PhoneSearch")
public class PhoneSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8"); 
		response.setContentType("text/html; charset=UTF-8");
		String name =request.getParameter("name");
		System.out.println(name);
		PhoneDaoImpl pdi = new PhoneDaoImpl();
		List<Phone> list =pdi.queryByString(name);
		Gson gson = new Gson();
		String info = gson.toJson(list);
		PrintWriter out = response.getWriter();
		out.write(info);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
