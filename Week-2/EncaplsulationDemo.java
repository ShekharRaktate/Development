public class EncaplsulationDemo {
    public static void main(String[] args) {
        
    }
}
class classElement{
    int a;
    static int pi;
    
    public classElement(){
        System.out.println("i am Constructor");
        a=20;
        System.out.println("i am Contructor a="+a);

    } 
    static{
        
        System.out.println("I am Static block");
    }
}