package dao;

public class Shopping 
{
	private int number;
	private int phoneID;
	private String name;
	private float price;
	private String print;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPhoneNumber() {
		return phoneID;
	}
	public void setPhoneNumber(int phoneID) {
		this.phoneID = phoneID;
	}
	public Shopping(int number, int phoneID) {
		this.number = number;
		this.phoneID = phoneID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Shopping(int number, int phoneID, String name, float price) {
		super();
		this.number = number;
		this.phoneID = phoneID;
		this.name = name;
		this.price = price;
	}
	public Shopping(int number, int phoneID, String name, float price, String print) {
		this.number = number;
		this.phoneID = phoneID;
		this.name = name;
		this.price = price;
		this.print = print;
	}
	public String getPrint() {
		return print;
	}
	public void setPrint(String print) {
		this.print = print;
	}
	
	
}
