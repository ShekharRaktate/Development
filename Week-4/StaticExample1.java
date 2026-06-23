public class StaticExample1 {
    public static void main(String[] args) {
        StaticTeset st=new StaticTeset();
        st.display();
        StaticTeset.show();
    }
}
class StaticTeset{
    static int x=10;
    int y=12;
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
    static void show(){
        System.out.println(x);
        // System.out.println(y);

    }
}