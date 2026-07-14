public class DemoExFinally {
    public static void main(String[] args) {
        int [] n=new int[3];
        try {
            System.out.println("Add element at index 3: "+n[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Array index is out of bound : \n"+e);
        }
        finally{
            n[2]=10;
            System.out.println("Added element:"+n[2]);
            System.out.println("Finally block excuted!");
        }
    }
}
