package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class InvoiceDaoImpl implements InvoiceDao
{
	@Override
	public void saveByOne(Invoice invoice) 
	{
		Connection connection = null;
		PreparedStatement prepareStatement = null;
		try {
			connection = JdbcUtils.getConnection();
			String sql = "insert into invoice (userID,phoneID,number,address,time) value(?,?,?,?,?)";
			prepareStatement = connection.prepareStatement(sql);
			prepareStatement.setInt(1, invoice.getUserID());
			prepareStatement.setInt(2, invoice.getPhoneID());
			prepareStatement.setInt(3, invoice.getNumber());
			prepareStatement.setString(4, invoice.getAddress());
			prepareStatement.setDate(5, invoice.getTime());
			prepareStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtils.close(connection, prepareStatement, null);
		}
	}

}
