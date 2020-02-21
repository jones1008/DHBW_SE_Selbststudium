package s55_9752762;

public class PassportReader extends Reader {
    private ReaderSensor readerSensor;

    public PassportReader() {
        readerSensor = new ReaderSensor();
    }

    void scanPassportCommand() {
        // Das Lesegerät im Bereich (i) sendet die verschlüsselten Informationen zwecks
        // Entschlüsselung an das Lesegerät im Bereich (ii)
        AutomaticPassportControl.instance.getSluice().getFaceReader().setCurrentPassport(currentPassport);
    }

    ReaderSensor getReaderSensor() {
        return readerSensor;
    }

    public void openDoorsCommand() {
        command.execute();
    }
}
