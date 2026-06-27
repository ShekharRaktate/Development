public class StaticClassEx {
    static class InnerStaticClassEx {
    
        public static void main(String[] args) {
            System.out.println("Static nested main method");
        }
    }
    public static void main(String[] args) {
        System.out.println("Outer class main method");
        InnerStaticClassEx.main(args);
    }
}
