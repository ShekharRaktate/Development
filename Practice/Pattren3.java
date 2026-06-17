public class Pattren3 {
    public static void main(String[] args) {
        pattren(5);
    }
        static void pattren(int n){

            for (int i=1; i<=n;i++) {
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(" "+"*");
                }
                System.out.println();
            }
        }
}
