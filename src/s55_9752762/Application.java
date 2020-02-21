package s55_9752762;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        IStrategy mountainPrime = new MountainPrime();
        persons.add(new Person(
                mountainPrime,
                "Manuel",
                "Mountain",
                new GregorianCalendar(2001, Calendar.DECEMBER, 1).getTime()
        ));

        IStrategy strobogrammaticPrime = new StrobogrammaticPrime();
        persons.add(new Person(
                strobogrammaticPrime,
                "Stefan",
                "Strobo",
                new GregorianCalendar(1999, Calendar.FEBRUARY, 11).getTime()
        ));

        IStrategy fibonacciPrime = new FibonacciPrime();
        persons.add(new Person(
                fibonacciPrime,
                "Fabian",
                "Fibo",
                new GregorianCalendar(1987, Calendar.JANUARY, 28).getTime()
        ));

        Entry entry = AutomaticPassportControl.instance.getEntry();
        PassportReader passportReader = entry.getPassportReader();
        ReaderSensor readerSensor = passportReader.getReaderSensor();

        Sluice sluice = AutomaticPassportControl.instance.getSluice();
        SluiceSensor sluiceSensor = sluice.getSensor();
        FaceReader faceReader = sluice.getFaceReader();

        Exit exit = AutomaticPassportControl.instance.getExit();
        ExitSensor exitSensor = exit.getSensor();

        // add Doors as listeners to correct sensor
        entry.getDoors().forEach(door -> sluiceSensor.addListener(door));
        exit.getDoors().forEach(door -> exitSensor.addListener(door));

        for (Person person : persons) {
            // scan passport
            System.out.println("INFO: passport from " + person.getFirstName() + " " + person.getLastName() + " put on passport scanner");
            passportReader.setCurrentPassport(person.getPassport());
            readerSensor.setCommand(new ScanPassportCommand(passportReader));
            System.out.println("INFO: scanning passport");
            readerSensor.scanPassportCommand();

            // open entry doors
            passportReader.setCommand(new OpenEntryDoorsCommand());
            System.out.println("INFO: opening entry doors");
            passportReader.openDoorsCommand();

            // Person detected in sluice
            System.out.println("INFO: person detected in sluice: closing entry doors");
            sluiceSensor.personDetected(person);

            System.out.println("INFO: scanning and validating face with passport");
            if (faceReader.validatePerson(person)) {
                System.out.println("GRANTED: Passport validated with face scan");
                faceReader.setCommand(new OpenExitDoorsCommand());
                System.out.println("INFO: opening exit doors");
                faceReader.openDoorsCommand();

                // Person detected in exit area -> close exit doors
                System.out.println("INFO: person detected in exit area: closing exit doors");
                exitSensor.personDetected();
            } else {
                System.out.println("DENIED: Face does not match with Passport information!");
            }

            System.out.println();
        }
    }
}
