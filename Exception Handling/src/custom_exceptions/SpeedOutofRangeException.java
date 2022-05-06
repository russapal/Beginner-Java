package custom_exceptions;

	@SuppressWarnings("serial")
	public class SpeedOutofRangeException extends Exception {
		public SpeedOutofRangeException(String mesg) {
			super(mesg);
		}
	}

