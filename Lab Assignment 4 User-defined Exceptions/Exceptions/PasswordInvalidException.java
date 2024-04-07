package Exceptions;

public class PasswordInvalidException extends Exception{
    public PasswordInvalidException() {
        super();
    }

    public PasswordInvalidException(String m) {
        super(m);
    }

    public PasswordInvalidException(String m, Throwable t) { 
        super(m, t);
    }
}
