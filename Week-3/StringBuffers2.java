import java.io.BufferedReader;
import java.io.InputStreamReader;
public class StringBuffers2 {
    public static void main(String[] args) throws Exception {
        InputStreamReader ob=new InputStreamReader(System.in);
        BufferedReader bd=new BufferedReader(ob);
        int m1,m2,m3,m4;

        System.out.println("Enter your name:->");
        String name=bd.readLine();
        System.out.println("Enter Physics marks:->");
        m1=Integer.parseInt(bd.readLine());
        System.out.println("Enter Computer marks:->");
        m2=Integer.parseInt(bd.readLine());
        System.out.println("Enter Chemistry marks:->");
        m3=Integer.parseInt(bd.readLine());
        System.out.println("Enter Html marks:->");
        m4=Integer.parseInt(bd.readLine());
        float total=m1+m2+m3+m4;
        
        System.out.println("-----Student Details-------");
        System.out.println("Student Name:->"+name);
        System.out.println("Physics"+m1);
        System.out.println("Computer"+m2);
        System.out.println("Chemistry"+m3);
        System.out.println("Html"+m4);
        
    }
}

