public class TestException {
    public static void main(String[] args) {
        try {
            int data=100/0;
            System.out.println(data);
            System.out.println("Inside try Block");

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println("Inside Catch  Block");
        }
        System.out.println("Rest of the code");
    }
}
