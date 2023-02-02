public class HelloWorld {
    public native void print();

    static {
        System.loadLibrary("hello");
    }

    public static void main(String[] args) {
        new HelloWorld().print();
    }
}