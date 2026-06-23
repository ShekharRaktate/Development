public class ArrayDemo {
    public static void main(String[] args) {
        int arr[]={12,4,3,5,7};
        int min=arr[0];
        int max=arr[arr.length-1];
        for(int i:arr){//arry pro max syntax
            System.out.println(i);
            if (min>i) {
                min=i;//minnimum number from array
            }
            if (max<i) {
                max=i;//maximum number from array

            }
        }
        
        System.out.println("---------------print statement--------------");
        System.out.println(max);
        System.out.println(min);
        System.out.println("-----------------------------");

        for (int i = 0; i < arr.length; i++) {//Basic array syntax
            System.out.println(arr[i]);
        }
    }
}
