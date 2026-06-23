public class ArrayofsumNaturalNo {
    public static void main(String[] args) {
        int[] num={-2,9,0,4,7,44,3,-45,6,3};
        int sum=0;
        float avg;
        for (int i :num) {
            sum+=i;
            
        }
        avg=(sum/num.length);

        System.out.println("Sum of Natural Numbers:->"+sum);
        System.out.println("Average of Natural Numbers:->"+avg);
    }
}
