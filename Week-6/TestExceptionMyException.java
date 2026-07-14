public class TestExceptionMyException {
    public static void main(String[] args) {
        try {
            int a=7;
            int b=10;
            int f=a/b;
            System.out.println(f);
            if (f==0) {
                throw new MyException("Hello Guys!");
            }
        } catch (MyException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
    
    
}
class MyException extends RuntimeException{
    MyException(String msg){
        super(msg);
    }
}