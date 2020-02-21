package s55_9752762;

public class FaceReader extends Reader {
    private String decodedMagnetStripe;

    void setDecodedMagnetStripe(String decodedMagnetStripe) {
        this.decodedMagnetStripe = decodedMagnetStripe;
    }

    boolean validatePerson(Person person) {
        boolean isValid = true;
        MatrixItem[][] face = person.getFace();
        String[] onePositions = decodedMagnetStripe.substring(1).split("\\|")[3].split(";");
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
