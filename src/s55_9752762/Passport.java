package s55_9752762;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Passport implements IPassport {
    private char[][] matrix;
    private int magnetStripeLength;
    private CryptoEngine cryptoEngine;

    public Passport(String firstName, String lastName, Date birthdate, MatrixItem[][] face, CryptoEngine cryptoEngine) {
        // initialize matrix
        matrix = new char[250][50];
        for (int i = 0; i < 250; i++) {
            for (int j = 0; j < 50; j++) {
                matrix[i][j] = (char) (new Random().nextInt(10) + 48);
            }
        }
        // get positions of 1s in the face
        String facePoints = "";
        for (int i = 0; i < face.length; i++) {
            for (int j = 0; j < face[i].length; j++) {
                if (face[i][j].getValue() == 1) {
                    facePoints += "("+i+","+j+")"+";";
                }
            }
        }

        // encrypt magnetStripe
        this.cryptoEngine = cryptoEngine;
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        String magnetStripe = this.cryptoEngine.encrypt("|" + firstName + "|" + lastName + "|" + dateFormat.format(birthdate) + "|" + facePoints + "|");
        magnetStripeLength = magnetStripe.length();

        // write encrypted magnetStripe to passport-matrix
        int counter = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 200; j++) {
                matrix[25 + j][45 + i] = magnetStripe.charAt(counter);
                counter++;
                if (counter >= magnetStripe.length()) {
                    break;
                }
            }
            if (counter >= magnetStripe.length()) {
                break;
            }
        }
    }

    public CryptoEngine getCryptoEngine() {
        return cryptoEngine;
    }

    public String getMagnetStripe() {
        char[][] magnetStripe = new char[200][2];
        String ret = "";
        int counter = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 200; j++) {
                ret += matrix[j + 25][i + 45];
                counter++;
                if (counter == magnetStripeLength) {
                    break;
                }
            }
            if (counter == magnetStripeLength) {
                break;
            }
        }
        return ret;
    }
}
