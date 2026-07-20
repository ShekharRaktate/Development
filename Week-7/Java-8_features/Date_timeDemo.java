import java.time.LocalDate;
import java.time.Month;

public class Date_timeDemo {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.now();
        System.out.println(ld);
        boolean ldt=ld.isLeapYear();
        System.out.println(ldt);
        int day =ld.getDayOfYear();
        System.out.println(day);
        Month month =ld.getMonth();
        System.out.println(month);

    }
}
