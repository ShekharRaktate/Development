public class ConstructorOverriding extends A{
    ConstructorOverriding(){
        System.out.println("hello iam B");
    }
    public static void main(String[] args) {
        ConstructorOverriding co=new ConstructorOverriding();
    }
}
class A{
    A(){
        System.out.println("Hello i am A");
    }
    
}
