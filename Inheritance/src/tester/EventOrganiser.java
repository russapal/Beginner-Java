package tester;
import inheritence.student;
import inheritence.faculty;
import inheritence.person;
import java.util.Scanner;

public class EventOrganiser 
{
	public static void main(String[] args) {
		// sc instance
		Scanner sc = new Scanner(System.in);
		// Prompt user for max no of participants (Student n Faculty)
		System.out.println("Enter max no of participants");// 10
		// Create suitable data structure(array) , to hold participant details.
		person[] participants = new person[sc.nextInt()];// 1 obj : array obj :
		// array of Person type of refs , which can DIRECTLY refer to Student / Faculty
		// obj.
		boolean exit = false;
		int counter = 0;
		while (!exit) {
			System.out.println("1. Register Student 2. Faculty Registration 3. Display all participant details "
					+ "4. Display specific participant details  5.Display participant's profession related info. 100.Exit");
			System.out.println("Choose option");
			switch (sc.nextInt()) {
			case 1:
				if (counter < participants.length) {
					System.out.println("Enter student details :  fn,  ln,  yr,  course,  fees,  marks");
					participants[counter++] = new student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt(),
							sc.nextInt()); // up casting
				} else
					System.out.println("Sorry ! Event Full!!!!!!!!!!!!!!!");
				break;
			case 2:
				if (counter < participants.length) {
					System.out.println("Enter faculty details :  fn,  ln, exp in yrs sme");
					participants[counter++] = new faculty(sc.next(), sc.next(), sc.nextInt(), sc.next()); // up casting
				} else
					System.out.println("Sorry ! Event Full!!!!!!!!!!!!!!!");
				break;
			case 3:
				System.out.println("Participant Details");
				// {s1,s2,s3,f1,f2,s4,null,null,null,null}
				for (person p : participants) // p=participants[0],p=participants[1]
					if (p != null)
						System.out.println(p); // run time poly.
				break;
			case 4:
				System.out.println("Enter seat no");
				int index = sc.nextInt() - 1;
				if (index >= 0 && index < counter) // validated index
					System.out.println(participants[index]);// run time poly.
				else
					System.out.println("Invalid Seat NO !!!!!!!!!!!!!!!!!!");
				break;
				
			case 5 : System.out.println("Enter seat no");
			// {s1,s2,s3,f1,f2,s4,null,null,null,null}
				index=sc.nextInt()-1;
				if (index >= 0 && index < counter) // validated index
				{
					person p=participants[index];
					//chk if p --> Student if yes --downcast Person --> Student , invoke study()
					if(p instanceof student)
						((student)p).study();
					else //must be a Faculty , if there are other types than Student n Faculty : else if
						((faculty)p).teach();					
				}
				break;

			case 100:
				exit = true;
				break;
			}
		}

		// close sc
		sc.close();

	}

}


