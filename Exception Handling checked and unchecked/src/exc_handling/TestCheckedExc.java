package exc_handling;

public class TestCheckedExc
{
	public static void main(String[] args) {
		System.out.println("Before sleep");
		// sleep --throws InterruptedExc --chked exc
		// Javac forces handling of the exc to the caller.
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After sleep");

	}


}
