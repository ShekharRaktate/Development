import java.util.Arrays;
import java.util.Scanner;

public class TestPair {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Pair arr[]=new Pair[4];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at index: "+i);
            String a=sc.nextLine();
            arr[i]=sc.nextInt();
        }
        arr[0]=new Pair("Sai",2);
        arr[1]=new Pair("Ram",1);
        arr[2]=new Pair("Sai",3);
        arr[3]=new Pair("Sita",5);
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++) {
            
            System.out.println(arr[i]);
        }

    }
   
    
}
class Pair implements Comparable<Pair>{
    int y;
    String x;
    public Pair(String x,int y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(Pair p){
        if (this.x.compareTo(p.x) !=0) {
            return this.x.compareTo(p.x);
        }
        else{
            return this.y -p.y;
        }
    }
    public String toString(){
        return "Name: "+x+" Id: "+y;
    }
}


