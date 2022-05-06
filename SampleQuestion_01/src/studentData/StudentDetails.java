package studentData;

public class StudentDetails
{
	private String id;
	private String name;
	private int phoneNo;
	private String email;
	private String courseName;
	private double marks;

//ctor to init COMPLETE state of the vehicle
	public StudentDetails(String id,String name , int phoneNo , String email ,String courseName , double marks) 
	{
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.courseName=courseName;
		this.marks=marks;
	}

	// add overloaded ctor , to init chasisNo : PK (primary key => Unique ID)
	public StudentDetails(String courseName) {
		super();
		this.courseName = courseName;	
	}

	@Override
	public String toString() {			
		return "\n ID \t" + id + " \n Name \t" + name + "\n Email \t" + email + "\n Course Name" +courseName+ "\n Phone No." +phoneNo+ "\n Marks" +marks;
	}
	
	@Override
	public boolean equals(Object anotherStudent) {
		if (anotherStudent instanceof StudentDetails)
			return this.id. equals(((StudentDetails) anotherStudent).id);
		return false;

	}
	
	public String getemail() 
	{
		return email;
	}

	public String getid() {
		return id;
	}

	public double getmarks() {
		return marks;
	}
	
	public int getphoneNo() {
		return phoneNo;
	}

	public void setmarks(double marks) {
		
		this.marks=marks;
		
	}
	
	public void setphoneno(int phoneNo) {
		
		this.phoneNo=phoneNo;
		
	}
	
}