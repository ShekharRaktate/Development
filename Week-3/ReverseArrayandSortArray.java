import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayandSortArray {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,6,4,-8};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        System.out.println("------sorting using arryas class file----");
        Arrays.sort(arr);
        System.out.println("Elements of array sorted in ascending order:->");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("------------decending orderr using collections framework--------------");
        String [] str={"A","F","C","D"};
        Arrays.sort(str, Collections.reverseOrder());
        System.out.println("Array elements in descending order:-"+Arrays.toString(str));
    }
}
