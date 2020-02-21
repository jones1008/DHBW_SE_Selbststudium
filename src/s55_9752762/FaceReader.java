package s55_9752762;

public class FaceReader extends Reader {
    private Passport currentPassport;
    private String decodedMagnetStripe;

    public void setCurrentPassport(Passport currentPassport) {
        this.currentPassport = currentPassport;
    }

    public Passport getCurrentPassport() {
        return currentPassport;
    }

    public void setDecodedMagnetStripe(String decodedMagnetStripe) {
        this.decodedMagnetStripe = decodedMagnetStripe;
    }

    public boolean validatePerson(Person person) {
        boolean isValid = true;
        MatrixItem[][] face = person.getFace();
//        char[][] passportMatrix = currentPassport.getMatrix();
//        String magnetStripe = currentPassport.getDecryptedMagnetStripe();
//        String[] onePositions = decodedMagnetStripe.split("\\|")[3].split(";");
//        String magnetStripe = decodedMagnetStripe.substring(0, decodedMagnetStripe.length() - 1);
        String magnetStripe = decodedMagnetStripe.substring(1);
        String[] positions = magnetStripe.split("\\|");
        String[] onePositions = positions[3].split(";");
        for (String position : onePositions) {
            // remove leading '(' and trailing ')'
            position = position.substring(0, position.length() - 1);
            position = position.substring(1);

            // get coordinates as integers
            String[] koord = position.split(",");
            int x = Integer.parseInt(koord[0]);
            int y = Integer.parseInt(koord[1]);

            if (face[x][y].getValue() != 1) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    public void openDoorsCommand() {
        command.execute();
    }
}
