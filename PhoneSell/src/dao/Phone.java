package dao;

public class Phone 
{
	private int id;
	private String name;
	private String model;
	private String color;
	private float price;
	private String memory;
	private String info;
	private int stock;
	private String print;
	
	
	public Phone(int id, String name, String model, String color, float price, String memory, String info, int stock,
			String print) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.color = color;
		this.price = price;
		this.memory = memory;
		this.info = info;
		this.stock = stock;
		this.print = print;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getPrint() {
		return print;
	}
	public void setPrint(String print) {
		this.print = print;
	}

	
	
}
