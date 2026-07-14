public class TestMyExample {
    public static void main(String[] args) {
        try {
            int[] n=new int[5];
            int div=0;
            for (int i = 0; i < n.length; i++) {
                int result=n[i]/div;
                System.out.println(result);
            }
        } catch (ArithmeticException e) {
            // TODO: handle exception
            throw new RuntimeException("Runtime Error: Divisor by zero",e);
        }
    }
}
