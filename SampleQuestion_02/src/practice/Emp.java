package practice;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Emp implements Comparable<Emp>
{

		private String id;
		private int prn;
		static int autoin;
		private String name;
		private Date dob;
		private Date hiringdate;
		private String dept;
		private double salary;
		
			public static SimpleDateFormat sdf;
			static {
				sdf = new SimpleDateFormat("dd-MM-yyyy");
			}

		
			public Emp( String id, int prn , String name , Date dob , Date hiringdate , String dept, double salary ) {
				super();
				this.id = id;
				this.prn=prn;
				prn=++autoin;
				this.name = name;
				this.dob = dob;
				this.hiringdate = hiringdate;
				this.dept = dept;
				this.salary = salary;
			}
			
			public Emp( String id, String name , Date dob , Date hiringdate , String dept, double salary ) {
				super();
				this.id = id;
				this.name = name;
				this.dob = dob;
				this.hiringdate = hiringdate;
				this.dept = dept;
				this.salary = salary;
			}

			
			public Emp(String id) {
				super();
				this.id = id;
			}

			@Override
			public String toString() {			
				return "Emp Details \n ID=" + id + "\n PRN" +prn+"\n Name" + name + "\n Dob" + sdf.format(dob) +" \n Hiring Date="
						+ sdf.format(hiringdate)+ "\n Department" +dept+ "\n Salary =" +salary;
			}

		
			@Override
			public boolean equals(Object anotherEmployee) {
				if (anotherEmployee instanceof Emp)
					return this.id.equals(((Emp) anotherEmployee).id);
				return false;

			}
			
			//implement compareTo method to supply sorting criteria
			@Override
			public int compareTo(Emp o) {
				return hiringdate.compareTo(o.hiringdate);
			}

			public String getname() {
				return name;
			}
			
			public String getdept() {
				return dept;
			}

			public String getid() {
				return id;
			}

			public double getsalary() {
				return salary;
			}

			public void setsalary(double salary) {
				this.salary = salary;
			}

			public Date getdob() {
				return dob;
			}
			
			public Date getHiringDate() {
				return hiringdate;
			
		}
}