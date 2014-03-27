package retail_store;

public class TooManyBikesException extends Exception {

    public TooManyBikesException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Exception Msg";
    }

    public String getMessage(String message) {
        return message;
    }
}
