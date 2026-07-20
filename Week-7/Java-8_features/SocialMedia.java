@FunctionalInterface
public interface SocialMedia{
    public int  sayHello(String a);
    default void chat(){
        System.out.println("I am chatting on Social Media.");
    }
}