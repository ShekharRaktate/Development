import java.util.StringJoiner;

public class TestString {
    public static void main(String[] args) {
        String s1="java";
        String s4="java";
        String s5=new String("java");
        char ch[]={'s','h','e','k','h','a','r'};
        String s2=new String(ch);
        String s3=new String("Java");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3==s5);//check only address
        System.out.println(s1==s4);//check only address
        System.out.println(s1==s3);
        System.out.println(s1.equals(s5));//checks the contains only
        System.out.println(s3.equals(s5));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s3));//true it's ignore case
        System.out.println(s1.compareTo(s4));//0   checks conditions and retrun ASCII value
        System.out.println(s1.compareTo(s3));//32(beacuse s1 > s3)
        System.out.println(s3.compareTo(s1));//-32(beacuse s1 < s3)
        //concatination 
        String s=50+30+"Sachin"+40+40;
        System.out.println(s);
        String fname="Shekhar ";
        String lname="Raktate";
        String name=fname.concat(lname);
        System.out.println(name);
        StringBuilder h=new StringBuilder("Hello ");
        StringBuilder j=new StringBuilder("Java");
        StringBuilder s6=h.append(j);
        System.out.println(s6.toString());
        String s7=String.format("%s%s",h,j);
        System.out.println(s7.toString());
        String s8=String.join("%",h,j);
        System.out.println(s8.toString());
        StringJoiner s9=new StringJoiner("@");
        s9.add("Hi ");
        s9.add(" Guys");
        System.out.println(s9.toString());
        String s10="Done are you ready";
        System.out.println("Orignal String:"+s10);
        System.out.println("Substring stsrting from index 6:"+s10.substring(3));
        System.out.println("Substring stsrting from index 0 to 6:"+s10.substring(10));
        System.out.println(s10.toUpperCase());
        System.out.println(s10.toLowerCase());
        System.out.println(s10.startsWith("Do"));
        System.out.println(s10.endsWith("dy"));

    }
}
