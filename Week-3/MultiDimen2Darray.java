public class MultiDimen2Darray {
    public static void main(String[] args) {
        MultiDemo md=new MultiDemo();
        md.arrays();
    }
}
class MultiDemo{
    
    int no[][]={{1,2,3},{4,5,6},{7,8,9}};
    public void array(){
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<3;j++){
                System.out.print(no[i][j]+" ");
            }
            System.out.println();
        }
    }
}