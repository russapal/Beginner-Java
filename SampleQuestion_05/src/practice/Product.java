package practice;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product implements Comparable<Product>
{

		private String id;
		private String name;
		private Date expirydate;
		private double price;
		
			public static SimpleDateFormat sdf;// def value=null
			static {
				sdf = new SimpleDateFormat("dd-MM-yyyy");
			}

		//ctor to init COMPLETE state of the vehicle
			public Product( String id, String name , Date expirydate ,  double price ) {
				super();
				this.id = id;
				this.name = name;
				this.expirydate = expirydate;
				this.price = price;
			}

			// add overloaded ctor , to init chasisNo : PK (primary key => Unique ID)
			public Product(String id) {
				super();
				this.id = id;
			}

			@Override
			public String toString() {			
				return "Product Details \n ID=" + id + "\n Name" + name + "\n Expiry Date" + sdf.format(expirydate) +"\n Price =" +price;
			}

		
			@Override
			public boolean equals(Object anotherProduct) {
				if (anotherProduct instanceof Product)
					return this.id.equals(((Product) anotherProduct).id);
				return false;

			}
			
			//implement compareTo method to supply sorting criteria
			@Override
			public int compareTo(Product o) {
				return expirydate.compareTo(o.expirydate);
			}

			public String getname() {
				return name;
			}
			

			public String getid() {
				return id;
			}

			public double getprice() {
				return price;
			}

			public Date getexpirydate() {
				return expirydate;
			}
			
}