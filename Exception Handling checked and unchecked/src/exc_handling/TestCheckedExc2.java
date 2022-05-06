package exc_handling;

public class TestCheckedExc2 
{
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Before sleep");
		
		// sleep --throws InterruptedExc --chked exc
		// Javac forces handling of the exc to the caller.
		
			Thread.sleep(5000);
		
		System.out.println("After sleep");
	}
}
