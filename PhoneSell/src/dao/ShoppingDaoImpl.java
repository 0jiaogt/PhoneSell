package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ShoppingDaoImpl implements ShoppingDao
{
	@Override
	public void save(Shopping shopping,String phoneNumber) 
	{
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "insert into phone"+phoneNumber+" (phoneID,number) value(?,?)";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, shopping.getPhoneNumber());
			prepareStatement.setInt(2, shopping.getNumber());
			prepareStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
	}
	
	@Override
	public void update(String phoneNumber,int phoneID,int number) 
	{
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "update phone"+phoneNumber+" set number=? where phoneID=?";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, number);
			prepareStatement.setInt(2, phoneID);		
			prepareStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
	}
	@Override
	public Shopping queryByOne(String phoneNumber,int phoneID) 
	{
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "select * from phone"+phoneNumber+" where phoneID=?";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, phoneID);
			ResultSet resultset = prepareStatement.executeQuery();
			if(resultset.next()) 
			{
				int number = resultset.getInt("number");
				Shopping shopping = new Shopping(number,phoneID);
				return shopping;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
		return null;
	}
	
	
	@Override
	public void deleteByOne(String phoneNumber,int id) 
	{
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "delete from phone"+phoneNumber+" where id=?";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, id);
			prepareStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
	}
	
	
	@Override
	public void deleteByAll(String phoneNumber) 
	{
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "delete from phone"+phoneNumber;
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.execute();
			/*sql = "insert into invoice(userID,phoneID,number) value(?,?,?)";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, shopping.getPhoneNumber());
			prepareStatement.setInt(2, shopping.getNumber());
			prepareStatement.execute();*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
	}
	
	@Override
	public List<Shopping> queryAll(String phoneNumber)
	{
		List<Shopping> list = new ArrayList<Shopping>();
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "select * from phone"+phoneNumber;
			prepareStatement = connection.prepareStatement(sql);
			ResultSet resultset = prepareStatement.executeQuery();
			while(resultset.next()) {
				int phoneID = resultset.getInt("phoneID");
				int number = resultset.getInt("number");
				PhoneDaoImpl pdi = new PhoneDaoImpl();
				Phone phone =pdi.queryById(phoneID);
				Shopping Shopping = new Shopping(number,phoneID,phone.getName(),phone.getPrice(),phone.getPrint());
				list.add(Shopping);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
		return list;
	}
	
	@Override
	public float closeAccounts(String phoneNumber)
	{
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		PhoneDaoImpl pdi =new PhoneDaoImpl();
		float account=0;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "select * from phone"+phoneNumber;
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setString(1, phoneNumber);
			ResultSet resultset = prepareStatement.executeQuery();
			while(resultset.next()) {
				int id = resultset.getInt("id");
				Phone phone=pdi.queryById(id);			
				account=account+phone.getPrice();
			}
			return account;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
		return 0;
	}
}
