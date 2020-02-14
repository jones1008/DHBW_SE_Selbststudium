package s55_9752762;

public class PassportReader extends Reader {
    private Passport currentPassport;

    public void scanPassport() {
        // TODO: set current Passport of FaceReader to currentPassport (viel zu umständig?)
        AutomaticPassportControl.instance.getSluice().getFaceReader().setCurrentPassport(currentPassport);
        // Das Lesegerät im Bereich (i) sendet die verschlüsselten Informationen zwecks
        // Entschlüsselung an das Lesegerät im Bereich (ii)
    }

    public void setCurrentPassport(Passport currentPassport) {
        this.currentPassport = currentPassport;
    }
}
