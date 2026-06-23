import java.io.BufferedReader;
import java.io.InputStreamReader;
public class StringBuffers {
    public static void main(String[] args) throws Exception{
        InputStreamReader ob=new InputStreamReader(System.in);
        BufferedReader bd=new BufferedReader(ob);
        System.out.println("Enter your name:->");
        String name=bd.readLine();
        System.out.println("Enter yor Id:->");
        int id=Integer.parseInt(bd.readLine());
        System.out.println("Enter yor Marks:->");
        float marks=Float.parseFloat(bd.readLine());
        System.out.println(name);
        System.out.println(id);
        System.out.println(marks);
    }
}
