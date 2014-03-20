package retail_store;

public class TooManyBikesException extends Exception {
    public TooManyBikesException(String message) {

    }

    public TooManyBikesException(String message, Throwable cause) {

    }

    @Override
    public String getMessage() {
        return "Exception Msg";
    }
}
