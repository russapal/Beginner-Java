package practice;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VolunteerDetails implements Comparable<VolunteerDetails>
{

		private int id;
		static int autoin;
		private String name;
		private Date dob;
		private String hobby;
		
			public static SimpleDateFormat sdf;
			static {
				sdf = new SimpleDateFormat("dd-MM-yyyy");
			}

		//ctor to init COMPLETE state of the vehicle
			public VolunteerDetails(int id, String name , Date dob , String hobby ) {
				super();
				this.id = id;
				id=++autoin;
				this.name = name;
				this.dob = dob;
				this.hobby = hobby;
			}

			// add overloaded ctor , to init chasisNo : PK (primary key => Unique ID)
			public VolunteerDetails(String name) {
				super();
				this.name = name;
			}

			@Override
			public String toString() {			
				return "Emp Details \n ID=" + id + "\n Name" + name +" \n Birth Date="
						+ sdf.format(dob)+ "\n hobby" +hobby;
			}

		
		/*	@Override
			public boolean equals(Object anotherEmployee) {
				if (anotherEmployee instanceof StudentDetails)
					return this.id.equals(((StudentDetails) anotherEmployee).id);
				return false;

			}*/
			
			//implement compareTo method to supply sorting criteria
			@Override
			public int compareTo(VolunteerDetails o) {
				return dob.compareTo(o.dob);
			}

			public String getname() {
				return name;
			}
			
			public String gethobby() {
				return hobby;
			}

			public int getid() {
				return id;
			}

			
			public Date getDob() {
				return dob;
			
		}
}