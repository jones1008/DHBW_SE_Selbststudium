package s55_9752762;

public class PassportReader extends Reader {
    private Passport currentPassport;
    private ReaderSensor readerSensor;

    public PassportReader() {
        readerSensor = new ReaderSensor();

    }

    public void scanPassport() {
        // Das Lesegerät im Bereich (i) sendet die verschlüsselten Informationen zwecks
        // Entschlüsselung an das Lesegerät im Bereich (ii)
        AutomaticPassportControl.instance.getSluice().getFaceReader().setCurrentPassport(currentPassport);
    }

    public void setCurrentPassport(Passport currentPassport) {
        this.currentPassport = currentPassport;
    }

    public ReaderSensor getReaderSensor() {
        return readerSensor;
    }

    public void openDoorsCommand() {
        command.execute();
    }
}
