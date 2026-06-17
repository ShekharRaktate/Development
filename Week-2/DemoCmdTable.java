public class DemoCmdTable {
    public static void main(String[] args) {
        System.out.println("Table of:->"+args[0]);
        int a=Integer.parseInt(args[0]);
        for (int i = 1; i <=10 ; i++) {  
            System.out.println(a*i);
        }

    }
}
