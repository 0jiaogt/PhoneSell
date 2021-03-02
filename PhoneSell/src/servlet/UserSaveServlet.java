package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.google.gson.Gson;

import dao.UserDao;
import dao.UserDaoImpl;
import dao.User;

@WebServlet("/UserSave")
public class UserSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8"); 
		response.setContentType("text/html; charset=UTF-8");
			
		//获取用户的参数
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		//Gson gson = new Gson();
		UserDao userDao = new UserDaoImpl();
		User user =userDao.queryByPhone(phone);
		PrintWriter out = response.getWriter();
		if(user==null)
		{
			String info = "true";
			out.write(info);
			user=new User(name,password,phone);
			//保存到数据库里面
			userDao.save(user);
		}
		else
		{
			String info = "false";
			out.write(info);
		}
		

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
