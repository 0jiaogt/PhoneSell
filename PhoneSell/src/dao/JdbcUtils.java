package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcUtils 
{
	
	private static String url = "jdbc:mysql://localhost:3306/phonedata";
	private static String username = "root";
	private static String password = "123456";
	
	static 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
			throw new RuntimeException("数据库连接失败");
		}
	}

	
	public static Connection getConnection() throws Exception 
	{
		return DriverManager.getConnection(url, username, password);
	}
	
	
	
	public static void close(Connection connection,PreparedStatement prepareStatement,ResultSet resultSet) 
	{
		if(resultSet!=null) 
		{
			try 
			{
				resultSet.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		if(prepareStatement!=null) 
		{
			try 
			{
				prepareStatement.close();
			} catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		if(connection!=null) 
		{
			try 
			{
				connection.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
