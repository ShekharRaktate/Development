package Assignment;

public class TestAnimal {
    public static void main(String[] args) {
        Bird bd=new Bird();
        bd.move();
        bd.makeSound();
        Panthera pn=new Panthera();
        pn.move();
        pn.makeSound();
    }
}
class Bird extends Animal{
    public void move(){

        System.out.println("Bird is flying");
    }
    public void makeSound(){
        System.out.println("chiv chiv");
    }
}
class Panthera extends Animal{
    public void move(){

        System.out.println("Panthrea is walking");
    }
    public void makeSound(){
        System.out.println("roar roar");
    }
}
class Animal{
    public void move(){
        System.out.println("The animal is moving");
    }
    public void makeSound(){

    }
}