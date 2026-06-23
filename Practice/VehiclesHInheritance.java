public class VehiclesHInheritance {
    public static void main(String[] args) {
        Bike ob=new Bike();
        ob.start();
        Car obj=new Car();
        obj.start();
    }
}
class Bike extends Vehicles{
    void start(){

        super.start();
        System.out.println("Car Started");
    }

}
class Car extends Vehicles{
    void start(){

        super.start();
        System.out.println("Bike Started");
    }
}
class Vehicles{
    void start(){
        System.out.println("Engine Started....!");
    }
}