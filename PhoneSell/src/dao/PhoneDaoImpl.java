package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.Phone;
import dao.JdbcUtils;

public class PhoneDaoImpl implements PhoneDao
{

	@Override
	public List<Phone> queryByString(String str) 
	{
		List<Phone> list = new ArrayList<Phone>();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		PreparedStatement prepareStatement1 = null;
		PreparedStatement prepareStatement2 = null;
		try {
			int number=0;

			connection = JdbcUtils.getConnection();
			String sql = "select * from phone where name like '%"+str+"%'";
			prepareStatement = connection.prepareStatement(sql);
			ResultSet resultset = prepareStatement.executeQuery();
			while(resultset.next()) 
			{
				int id = resultset.getInt("id");
				String name = resultset.getString("name");
				String model = resultset.getString("model");
				String color = resultset.getString("color");
				float price = resultset.getFloat("price");
				String memory = resultset.getString("memory");
				String info = resultset.getString("info");
				int stock = resultset.getInt("stock");
				String print = resultset.getString("print");
				Phone phone = new Phone(id, name, model,color,price,memory,info,stock,print);
				list.add(phone);
				number++;
			}
			
			sql = "select * from phone where color like '%"+str+"%'";
			prepareStatement1 = connection.prepareStatement(sql);
			resultset = prepareStatement1.executeQuery();
			while(resultset.next()) 
			{
				int id = resultset.getInt("id");
				String name = resultset.getString("name");
				String model = resultset.getString("model");
				String color = resultset.getString("color");
				float price = resultset.getFloat("price");
				String memory = resultset.getString("memory");
				String info = resultset.getString("info");
				int stock = resultset.getInt("stock");
				String print = resultset.getString("print");
				Phone phone = new Phone(id, name, model,color,price,memory,info,stock,print);
				list.add(phone);
				number++;
			}
			
			sql = "select * from phone where model like '%"+str+"%'";
			prepareStatement2 = connection.prepareStatement(sql);
			resultset = prepareStatement2.executeQuery();
			while(resultset.next()) 
			{
				int id = resultset.getInt("id");
				String name = resultset.getString("name");
				String model = resultset.getString("model");
				String color = resultset.getString("color");
				float price = resultset.getFloat("price");
				String memory = resultset.getString("memory");
				String info = resultset.getString("info");
				int stock = resultset.getInt("stock");
				String print = resultset.getString("print");
				Phone phone = new Phone(id, name, model,color,price,memory,info,stock,print);
				list.add(phone);
				number++;
			}
			if(number!=0)
			{
				return list;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
		return null;
	}

	@Override
	public List<Phone> queryAll() 
	{
		List<Phone> list = new ArrayList<Phone>();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "select * from phone";
			prepareStatement = connection.prepareStatement(sql);
			ResultSet resultset = prepareStatement.executeQuery();
			while(resultset.next()) 
			{
				int id = resultset.getInt("id");
				String name = resultset.getString("name");
				String model = resultset.getString("model");
				String color = resultset.getString("color");
				float price = resultset.getFloat("price");
				String memory = resultset.getString("memory");
				String info = resultset.getString("info");
				int stock = resultset.getInt("stock");
				String print = resultset.getString("print");
				Phone phone = new Phone(id, name, model,color,price,memory,info,stock,print);
				list.add(phone);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
		return list;
	}

	@Override
	public List<Phone> queryByPrice(float price, String maxOrMin) {
		List<Phone> list = new ArrayList<Phone>();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "select * from phone where price??";
			prepareStatement = connection.prepareStatement(sql);
			if(maxOrMin=="max")
			{
				prepareStatement.setString(1, "<");
			}
			else if(maxOrMin=="min")
			{
				prepareStatement.setString(1, ">");
			}
			
			prepareStatement.setFloat(2, price);
			ResultSet resultset = prepareStatement.executeQuery();
			while(resultset.next()) 
			{
				int id = resultset.getInt("id");
				String name1 = resultset.getString("name");
				String model = resultset.getString("model");
				String color = resultset.getString("color");
				float price1 = resultset.getFloat("price");
				String memory = resultset.getString("memory");
				String info = resultset.getString("info");
				int stock = resultset.getInt("stock");
				String print = resultset.getString("print");
				Phone phone = new Phone(id, name1, model,color,price1,memory,info,stock,print);
				list.add(phone);	
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
		return null;
	}

	@Override
	public List<Phone> queryByPrice(float min, float max) {
		List<Phone> list = new ArrayList<Phone>();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "select * from phone where price between ? and ?";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setFloat(1, min);
			prepareStatement.setFloat(1, max);
			ResultSet resultset = prepareStatement.executeQuery();
			while(resultset.next()) 
			{
				int id = resultset.getInt("id");
				String name1 = resultset.getString("name");
				String model = resultset.getString("model");
				String color = resultset.getString("color");
				float price = resultset.getFloat("price");
				String memory = resultset.getString("memory");
				String info = resultset.getString("info");
				int stock = resultset.getInt("stock");
				String print = resultset.getString("print");
				Phone phone = new Phone(id, name1, model,color,price,memory,info,stock,print);
				list.add(phone);			
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
		return null;
	}
	@Override
	public void update(int phoneID,int number) 
	{
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "update phone set stock=? where id=?";
			prepareStatement = connection.prepareStatement(sql);
			
			Phone phone= queryById(phoneID);
			
			prepareStatement.setInt(1, phone.getStock()-number);
			prepareStatement.setInt(2, phoneID);
			prepareStatement.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
	}
	
	@Override
	public Phone queryById(int id) {
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "select * from phone where id=?";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, id);
			ResultSet resultset = prepareStatement.executeQuery();
			if(resultset.next()) 
			{
				String name = resultset.getString("name");
				String model = resultset.getString("model");
				String color = resultset.getString("color");
				float price = resultset.getFloat("price");
				String memory = resultset.getString("memory");
				String info = resultset.getString("info");
				int stock = resultset.getInt("stock");
				String print = resultset.getString("print");
				Phone phone = new Phone(id, name, model,color,price,memory,info,stock,print);		
				return phone;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
		return null;
	}
	@Override
	public List<Phone> queryByModel(String model) 
	{
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		List<Phone> list = new ArrayList<Phone>();
		try {
			connection = JdbcUtils.getConnection();
			String sql = "select * from phone where model=?";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, model);
			ResultSet resultset = prepareStatement.executeQuery();
			while(resultset.next()) 
			{
				String name = resultset.getString("name");
				int id = resultset.getInt("id");
				String color = resultset.getString("color");
				float price = resultset.getFloat("price");
				String memory = resultset.getString("memory");
				String info = resultset.getString("info");
				int stock = resultset.getInt("stock");
				String print = resultset.getString("print");
				Phone phone = new Phone(id, name, model,color,price,memory,info,stock,print);
				list.add(phone);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
		return null;
	}
}
