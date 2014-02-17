package book.message;

public abstract class MessageShower {

    private final IOnStringInput onStringInput;
    private final String message;

    public MessageShower(String message, IOnStringInput onStringInput) {
        this.message = message;
        this.onStringInput = onStringInput;
    }

    public abstract void show();

    public String getMessage() {
        return message;
    }

    public IOnStringInput getOnStringInput() {
        return onStringInput;
    }


}
