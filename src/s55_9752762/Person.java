package s55_9752762;

import java.util.Date;

public class Person {
    private MatrixItem[][] face;
    private IStrategy strategy;
    private Passport passport;
    private String firstName;
    private String lastName;
    private Date birthdate;

    public Person(IStrategy strategy, String firstName, String lastName, Date birthdate) {
        this.strategy = strategy;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;

        face = new MatrixItem[250][500];
        int counter = 1;
        for (int i = 0; i < 250; i++) {
            for (int j = 0; j < 500; j++) {
                face[i][j] = new MatrixItem(counter, 0);
                counter++;
            }
        }
        face = this.strategy.fillMatrix(face);

        this.passport = new Passport(
                firstName,
                lastName,
                birthdate,
                face,
                new AESCryptoEngine()
        );
    }

    public Passport getPassport() {
        return passport;
    }

    public MatrixItem[][] getFace() {
        return face;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
