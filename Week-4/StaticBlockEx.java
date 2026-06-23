public class StaticBlockEx {
    StaticBlockEx(){
    
       System.out.println("Construtor Block");
    }

     {
        System.out.println(" Non Static Block");
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
        StaticBlockEx a=new StaticBlockEx();

        
    }
    static{
        System.out.println("Static 1 Block");
    }
    
}

