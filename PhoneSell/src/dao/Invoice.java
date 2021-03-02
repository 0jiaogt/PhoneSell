package dao;

import java.sql.Date;

public class Invoice 
{
	private int userID;
	private int phoneID;
	private int number;
	private String address;
	private Date time;
	private boolean finish;
	public Invoice(int userID, int phoneID, int number, String address, Date time, boolean finish) {
		super();
		this.userID = userID;
		this.phoneID = phoneID;
		this.number = number;
		this.address = address;
		this.time = time;
		this.finish = finish;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getPhoneID() {
		return phoneID;
	}
	public void setPhoneID(int phoneID) {
		this.phoneID = phoneID;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
	
}
