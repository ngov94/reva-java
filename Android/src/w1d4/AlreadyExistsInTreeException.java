package w1d4;

public class AlreadyExistsInTreeException extends Exception {
	public AlreadyExistsInTreeException(String errorMessage, Throwable err) {
		super(errorMessage,err);
	}
}
