package custom_exceptions;

@SuppressWarnings("serial")
public class BankingException extends Exception {
		public BankingException(String errMesg) {
			super(errMesg);

}
}
