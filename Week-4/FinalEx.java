public class FinalEx extends Drinker{
        // final int limit=90;
        void drink(){
            System.out.println("Drink water only 2Ltr");
        }

    public static void main(String[] args) {
        FinalEx b=new FinalEx();
        b.drink();

    }
}
final class Drinker {
    void drink(){
            System.out.println("Drink Daily water 3Ltr");
        }

}