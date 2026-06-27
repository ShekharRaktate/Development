package Assignment;

public class Testarea  {
    
    public static void main(String[] args) {
        Testarea ta=new Testarea();
        Triangle t=new Triangle();
        t.area(12, 10);
    }
}
interface Area {

    void area(int l,int b);
}
class  Rectangle implements Area{
    public void area(int l,int b){   
        System.out.println("Area of Rectangle"+(l*b));
    }
}
class  Triangle implements Area{
    public void area(int l,int b){  
        System.out.println("Area of Rectangle"+((l*b)/2));

    }
}