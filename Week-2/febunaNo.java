public class febunaNo {
    public static void main(String[] args) {
        int n=10;
        int f1=0;
        int f2=1;
        int f3=0;
        System.out.println(f1);
        System.out.println(f2);

        for (int i = 0; i < n; i++) {
            f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        }
    }
    
}
