package Assignment;

public class TestFly {
    public static void main(String[] args) {
        Spacecraft sc=new Spacecraft();
        Airplane ap=new Airplane();
        Helicopter hc=new Helicopter();
        sc.fly_obj();
        ap.fly_obj();
        hc.fly_obj();
    }
}
interface Flyable{
    void fly_obj();
}
class Spacecraft implements Flyable{
    public void fly_obj(){
        System.out.println("Two people can sit");
    }
}
class Airplane implements Flyable{
    public void fly_obj(){
        System.out.println("Hundred people can sit");

    }
}
class Helicopter implements Flyable{
    public void fly_obj(){
        System.out.println("Four people can sit");
    }
}