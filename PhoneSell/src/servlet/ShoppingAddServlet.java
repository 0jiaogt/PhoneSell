package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.Shopping;
import dao.ShoppingDaoImpl;



@WebServlet("/ShoppingAdd")
public class ShoppingAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8"); 
		response.setContentType("text/html; charset=UTF-8");
		
		int number = Integer.parseInt(request.getParameter("number"));
		int phoneID = Integer.parseInt(request.getParameter("phoneID"));
		String phoneNumber =request.getParameter("phoneNumber");
		
		ShoppingDaoImpl sdi = new ShoppingDaoImpl();
		Shopping shop=sdi.queryByOne(phoneNumber, phoneID);
		if(shop==null)
		{
			shop=new Shopping(number,phoneID);
			sdi.save(shop, phoneNumber);
		}
		else
		{
			number=number+shop.getNumber();
			sdi.update(phoneNumber,phoneID,number);
		}
		Gson gson = new Gson();
		String info = gson.toJson("true");
		PrintWriter out = response.getWriter();
		out.write(info);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
