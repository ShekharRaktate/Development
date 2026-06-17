public class CmdInputDemo {
    public static void main(String[] args) {
        System.out.println("Before Conversion");
        System.out.println(args[0]+args[1]);
        float a=Float.parseFloat(args[0]);
        float b=Float.parseFloat(args[1]);
        // int a=Integer.parseInt(args[0]);
        // int b=Integer.parseInt(args[1]);
        System.out.println("after Conversion");
        System.out.println(a+b);
        
    }
}
