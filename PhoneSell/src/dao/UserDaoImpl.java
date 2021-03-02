package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
*/
//import org.gecedu.bean.PageInfo;
import dao.User;
import dao.JdbcUtils;

public class UserDaoImpl implements UserDao
{

	@Override
	public int save(User user) 
	{
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		PreparedStatement prepareStatement1 = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "insert into user (name,password,phone) value(?,?,?)";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, user.getName());
			prepareStatement.setString(2, user.getPassword());
			prepareStatement.setString(3, user.getPhone());
			prepareStatement.execute();

		/*	ResultSet resultset = prepareStatement.executeQuery();
			if(resultset.next()) 
			{
				return resultset.getInt("id");
			}*/
			sql = "create table phone"+user.getPhone()+"(phoneID int(11),number int(10))";
			prepareStatement1 = connection.prepareStatement(sql);
			prepareStatement1.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
		return 0;
	}
	
	/*
	@Override
	public void update(User user) {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "update user set name=?,password=? where id=?";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, user.getName());
			prepareStatement.setString(2, user.getPassword());
			prepareStatement.setInt(3, user.getId());
			
			prepareStatement.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
	}
	 */
	
	/*
	@Override
	public void deleteById(Integer id) {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "delete from user where id=?";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, id);
			prepareStatement.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
	}
	*/
	
	@Override
	public User queryByPhone(String phone) 
	{
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "select * from user where phone=?";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, phone);
			ResultSet resultset = prepareStatement.executeQuery();
			if(resultset.next()) 
			{
				String name = resultset.getString("name");
				String password = resultset.getString("password");
				String email = resultset.getString("email");
				String address = resultset.getString("address");
				int id = resultset.getInt("id");
				User user = new User(id, name, password,email,address,phone);
				return user;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
		return null;
	}
	/*
	@Override
	public List<User> queryAll()
	{
		List<User> list = new ArrayList<User>();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "select * from user";
			prepareStatement = connection.prepareStatement(sql);
			ResultSet resultset = prepareStatement.executeQuery();
			while(resultset.next()) {
				String name = resultset.getString("name");
				int age = resultset.getInt("age");
				int id = resultset.getInt("id");
				Time time = resultset.getTime("register_time");
				User user = new User(id, name, age,new Date(time.getTime()));
				list.add(user);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
		return list;
	}
	*/
	/*
	@Override
	public PageInfo queryByPages(Integer currentPage) {
		
		List<User> list = new ArrayList<User>();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "select * from user LIMIT ?,?";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, (currentPage-1)*8);
			prepareStatement.setInt(2, 8);
			ResultSet resultset = prepareStatement.executeQuery();
			while(resultset.next()) {
				String name = resultset.getString("name");
				int age = resultset.getInt("age");
				int id = resultset.getInt("id");
				Time time = resultset.getTime("register_time");
				User user = new User(id, name, age,);
				list.add(user);
			}
			
			String countSql = "select count(id) as totalRecord from user";
			PreparedStatement prepareStatement2 = connection.prepareStatement(countSql);
			ResultSet resultset2 = prepareStatement2.executeQuery();
			long total = 0L;
			if(resultset2.next()) {
				total = resultset2.getLong("totalRecord");
			}
			
			PageInfo pageInfo = new PageInfo(list, currentPage, total);
			return pageInfo;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
		return null;
		
	}
	 */
	@Override
	public User queryByAccountAndPwd(String phone, String password) {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "select * from user where phone=? and password=?";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, phone);
			prepareStatement.setString(2, password);
			ResultSet resultset = prepareStatement.executeQuery();

			if(resultset.next()) {
				String name = resultset.getString("name");
				String email = resultset.getString("email");
				String address = resultset.getString("address");
				int id = resultset.getInt("id");
				User user = new User(id, name, password,email,address,phone);
				return user;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
		return null;
	}
	
	
	


	
}
