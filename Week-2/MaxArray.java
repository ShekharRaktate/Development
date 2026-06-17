public class MaxArray {
    public static void main(String[] args) {
        int nums[]={10,2,13,44,6};
        int max=nums[0];
        for (int i:nums) {
            if (max<i) {
                max=i;
            }
        }
        System.out.println(max);
    }
}
