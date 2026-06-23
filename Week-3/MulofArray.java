public class MulofArray {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6};
        int mul=1;
        // float avg;
        for (int i = 0; i < num.length; i++) {
            
            mul*=num[i];
        }
            
            System.out.println("Factorial of Natural Numbers:->"+mul);
        
    }
}
