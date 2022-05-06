package Tester;
import com.cdac.core.Animal;
import com.cdac.core.Cat;
import com.cdac.core.Dog;
import com.cdac.core.Horse;

public class TestVarArgs 
{
	public static void main(String... args) {
		System.out.println("var-args with no args");
		displayAnimalNames();
		System.out.println("var-args with Animal[]");
		Animal[] animals= {new Cat(),new Horse(),new Dog()};
		displayAnimalNames(animals);
		System.out.println("var-args with animals");
		displayAnimalNames(new Cat(),new Dog(),new Horse());
		

	}
	//add a static method to display names of all animals
	private static void displayAnimalNames(Animal...animals)
	{
		for(Animal a : animals)
			System.out.println(a.getName());
	}

}
