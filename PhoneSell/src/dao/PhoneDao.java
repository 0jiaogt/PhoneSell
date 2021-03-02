package dao;

import java.util.List;

import dao.Phone;

public interface PhoneDao 
{
	List<Phone> queryAll();
	Phone queryById(int id);
	List<Phone> queryByString(String str);
	List<Phone> queryByPrice(float price,String maxOrMin);
	List<Phone> queryByPrice(float min,float max);
	List<Phone> queryByModel(String model);
	void update(int phoneNumber,int number);
}
