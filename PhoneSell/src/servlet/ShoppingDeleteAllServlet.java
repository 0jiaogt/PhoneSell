package servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PhoneDaoImpl;
import dao.Shopping;
import dao.ShoppingDaoImpl;

@WebServlet("/ShoppingDeleteAll")
public class ShoppingDeleteAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8"); 
		response.setContentType("text/html; charset=UTF-8");
		String phoneNumber = request.getParameter("phoneNumber");
		Shopping shop;
		ShoppingDaoImpl sdi = new ShoppingDaoImpl();
		List<Shopping> list=sdi.queryAll(phoneNumber);
		ListIterator<Shopping> iterator=list.listIterator();
		PhoneDaoImpl pdi=new PhoneDaoImpl();
		while(iterator.hasNext())
		{
			shop=(Shopping) iterator.next();
			int number = shop.getNumber();
			int phoneID = shop.getPhoneNumber();
			pdi.update(phoneID,number);
		}
		sdi.deleteByAll(phoneNumber);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
