package Exercice2;

class WrongLoginException extends Exception {
	private static final long serialVersionUID = 1L;

	public WrongLoginException(String message) {
        super(message);
    }
}
