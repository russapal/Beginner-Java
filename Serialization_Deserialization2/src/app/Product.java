package app;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;

public class Product implements Serializable
{

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private Category productCatgeory;
	private LocalDate manufactureDate;
	private double price;

	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}


	public Product(int id, String name, Category productcategory, LocalDate manufactureDate, double price) {
		super();
		this.id = id;
		this.name = name;
		this.productCatgeory = productcategory;
		this.manufactureDate = manufactureDate;
		this.price = price;
	}

	
	public Product (String name)
	{
		this.name=name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", productCatgeory=" + productCatgeory + ", manufactureDate="
				+ manufactureDate + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Category getProductCatgeory() {
		return productCatgeory;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
