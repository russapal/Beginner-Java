package inheritence;

public class person {
	//state : tightly encapsulated.
		private String firstName,lastName;
		
		//parameterized constructor
		public person (String firstName, String lastName) {
			System.out.println("1. At person class will get fn and ln");
			//super() --> Object class constructor
			this.firstName=firstName;
			this.lastName=lastName;
		}
		
//		public Person() {
//			// TODO Auto-generated constructor stub
//		}
		
		//add overriding  form of the toString to replace hashCode by person details
		@Override
		public String toString()
		{
			return firstName+" "+lastName;
		}
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
	}


