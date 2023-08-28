package SingletonPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        // illegal construct
        // compile time error: The constructor SingleObject() is not visible
        // SingleObject object = new SingleObject();

        // get the only object available
        SingleObject object = SingleObject.getInstance();

        // show the message
        object.showMessage();
    }
}
