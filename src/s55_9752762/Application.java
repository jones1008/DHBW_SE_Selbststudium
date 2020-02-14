package s55_9752762;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application {
    public static void main(String[] args) {
//        IStrategy mountainPrime = new MountainPrime();
//        Person person1 = new Person(
//                mountainPrime,
//                "Manuel",
//                "Mountain",
//                new GregorianCalendar(2001, Calendar.DECEMBER, 1).getTime()
//        );

        IStrategy strobogrammaticPrime = new StrobogrammaticPrime();
        Person person2 = new Person(
                strobogrammaticPrime,
                "Stefan",
                "Strobo",
                new GregorianCalendar(1999, Calendar.FEBRUARY, 11).getTime()
        );

        IStrategy fibonacciPrime = new FibonacciPrime();
        Person person3 = new Person(
                fibonacciPrime,
                "Fabian",
                "Fibo",
                new GregorianCalendar(1987, Calendar.JANUARY, 28).getTime()
        );

    }
}
