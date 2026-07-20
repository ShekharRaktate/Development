import java.util.Optional;

public class Testlambda {
    public static void main(String[] args) {
        Instagram insta= new Instagram();
        Optional<String> name=insta.search("ram");
        insta.sayHello("Hi!"+name.get());
        // SocialMedia s=(String a)->{
        //     System.out.println("Send this msg to through any "+a);
        //     return 10;
        // };
        // int a=s.sayHello("Instagram");
        // System.out.println(a);
    }
}