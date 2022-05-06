package inheritence;

public class faculty extends person {
	private int expInYears;
	private String sme;

	public faculty(String fn1, String ln1, int expInYears, String sme) {
		super(fn1, ln1);
		System.out.println("3");//got inherited from person class to faculty class
		this.expInYears = expInYears;
		this.sme = sme;//subject matter expert
	}
	
	//add overrding form of the toString method , to ret COMPLETE details of a faculty
	@Override
	public String toString()
	{
		//objects will collect tostring from here to print the info
		return "Faculty "+super.toString()+" training for "+expInYears+" expert in "+sme;
	}
	
	public void teach()
	{
		System.out.println(getLastName()+" is teaching for last "+expInYears);
	}
	
}
