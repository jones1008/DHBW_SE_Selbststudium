package s55_9752762;

public class DecryptPassportCommand implements ICommand {
    private FaceReader faceReader;

    public DecryptPassportCommand() {
        faceReader = AutomaticPassportControl.instance.getSluice().getFaceReader();
    }

    public void execute() {
        Passport passport = faceReader.getCurrentPassport();
        String decodedMagnetStripe = passport.getCryptoEngine().decrypt(passport.getMagnetStripe());
        faceReader.setDecodedMagnetStripe(decodedMagnetStripe);
    }
}
