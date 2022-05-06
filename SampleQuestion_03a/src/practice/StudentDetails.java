package practice;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.io.Serializable;


import java.util.Date;

public class StudentDetails implements Comparable<StudentDetails>
{
	private static final long serialVersionUID = 1L;

		private int id;
		static int autoin;
		private String name;
		private int age;
		private Date registrationdate;
		private String course;
		
			public static SimpleDateFormat sdf;
			static {
				sdf = new SimpleDateFormat("dd-MM-yyyy");
			}

		//ctor to init COMPLETE state of the vehicle
			public StudentDetails(int id, String name , int age ,Date registrationdate, String course ) {
				super();
				this.id = id;
				id=++autoin;
				this.name = name;
				this.age = age;
				this.registrationdate = registrationdate;
				this.course = course;
			}
			
			public StudentDetails(String name , int age , Date registrationdate , String course ) {
				super();
				
				this.name = name;
				this.age = age;
				this.registrationdate = registrationdate;
				this.course = course;
			}

			// add overloaded ctor , to init chasisNo : PK (primary key => Unique ID)
			public StudentDetails(String name) {
				super();
				this.name = name;
			}

			@Override
			public String toString() {			
				return "Emp Details \n ID=" + id + "\n Name" + name + "\n Age" + age +" \n Registration Date="
						+ sdf.format(registrationdate)+ "\n Course" +course;
			}

		
		/*	@Override
			public boolean equals(Object anotherEmployee) {
				if (anotherEmployee instanceof StudentDetails)
					return this.id.equals(((StudentDetails) anotherEmployee).id);
				return false;

			}*/
			
			//implement compareTo method to supply sorting criteria
			@Override
			public int compareTo(StudentDetails o) {
				return registrationdate.compareTo(o.registrationdate);
			}

			public String getname() {
				return name;
			}
			
			public String getcourse() {
				return course;
			}

			public int getid() {
				return id;
			}

			public int getage() {
				return age;
			}

			public void setage(int age) {
				this.age = age;
			}
			
			public Date getRegistrationDate() {
				return registrationdate;
			
		}
}