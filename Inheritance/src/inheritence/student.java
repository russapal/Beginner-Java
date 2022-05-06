package inheritence;

	public class student extends person {
		// additional state :
		private int gradYear;
		private String course;
		private int fees;
		private int marks;

		/*
		 * javac impl adds def ctor public Student() { super(); }
		 */
		public student(String fn, String ln, int yr, String course, int fees, int marks) {
			super(fn, ln);
			System.out.println("2 ");//Got inherited from person class(fn and ln) to student class(yr ,course, fees , marks)
			gradYear = yr;
			this.course = course;
			this.fees = fees;
			this.marks = marks;

		}

		// add overiding form of toString , to replace hashCode version by actual
		// details of the student
		// rules : same method name , same return type , same method args , modified method
		// def.
		// access specifier : same or wider
		@Override
		public String toString() {
			//objects will from student class
			return "Student " + super.toString() + " passed in " + gradYear + " enrolled in " + course + " Fees paid  "
					+ fees + " marks in last exam " + marks;
		}
		
		public void study()
		{
			System.out.println(getFirstName()+" studying in Course "+course);
		}

	}


