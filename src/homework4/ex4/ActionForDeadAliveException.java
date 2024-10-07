package homework4.ex4;

public class ActionForDeadAliveException extends RuntimeException {
    public ActionForDeadAliveException() {
    }

    public ActionForDeadAliveException(String message) {
        super(message);
    }

    public ActionForDeadAliveException(String message, Throwable cause) {
        super(message, cause);
    }

    public ActionForDeadAliveException(Throwable cause) {
        super(cause);
    }
}
