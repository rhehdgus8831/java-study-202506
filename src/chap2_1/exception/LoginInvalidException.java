package chap2_1.exception;

public class LoginInvalidException extends Exception{
    public LoginInvalidException(String message) {
        super(message);
    }
}
