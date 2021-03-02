package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.UserDao;
import dao.UserDaoImpl;
import dao.User;

@WebServlet("/UserLogin")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8"); 
		response.setContentType("text/html; charset=UTF-8");
		//获取前端页面传过来账号和密码
		String account = request.getParameter("account");
		String password = request.getParameter("password");

		//根据账号与密码信息查询数据库
		UserDao userDao = new UserDaoImpl();
		User user = userDao.queryByAccountAndPwd(account,password);

		
		PrintWriter out = response.getWriter();

		if(user!=null) 
		{
			String info = "false";
			out.write(info);
		}
		else 
		{
			String info = "true";
			out.write(info);
		}
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
