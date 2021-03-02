package dao;

import java.util.List;

public interface ShoppingDao 
{
	void save(Shopping shopping,String phoneNumber);
	void update(String phoneNumber,int id,int number);
	void deleteByOne(String phoneNumber,int id);
	void deleteByAll(String phoneNumber);
	List<Shopping> queryAll(String phoneNumber);
	float closeAccounts(String phoneNumber);
	Shopping queryByOne(String phoneNumber,int phoneID);
}
