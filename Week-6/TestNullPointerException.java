public class TestNullPointerException {
    static void display(String name) throws NullPointerException{
        System.out.println(name.length());
    }
    public static void main(String[] args) {
        display(null);
    }
}
