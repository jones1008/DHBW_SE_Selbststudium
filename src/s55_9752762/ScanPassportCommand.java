package s55_9752762;

public class ScanPassportCommand implements ICommand {
    private PassportReader passportReader;

    public ScanPassportCommand(PassportReader passportReader) {
        this.passportReader = passportReader;
    }

    public void execute() {
        passportReader.scanPassportCommand();
    }
}
