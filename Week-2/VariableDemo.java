
public class VariableDemo {
    public static void main(String... args) {
        VariableType tp=new VariableType();
        VariableType.m2();
        System.out.println("Name:->"+VariableType.name);
        tp.m1(7);
    }
}
class VariableType {
    static String name="Shekhar";//Static varable
    int age=21;//instance variable
    void m1(int x){
        System.out.println("name:->"+name);
        System.out.println("Age:->"+age);
        System.out.println("X:->"+x);
    }
    static void m2(){
        int y=90;//local variable
        System.out.println("Name:->"+name);
        System.out.println("Y:->"+y);
    }
}
