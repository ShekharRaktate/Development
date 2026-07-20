import java.util.Optional;

public class Instagram  {
    
    public int sayHello(String a){
        System.out.println("Hello Guys ! "+a);
        return 1;
    }
    
    public Optional<String> search(String name){
        if (name.equals("Shekhar") ) {
            return Optional.of("Shekhar");
        } 
        return  Optional.of("Buddy");
    }

}
