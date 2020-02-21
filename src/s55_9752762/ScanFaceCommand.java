package s55_9752762;

public class ScanFaceCommand implements ICommand {
    private Person currentPerson;

    public ScanFaceCommand(Person person) {
        this.currentPerson = person;
    }

    public void execute() {
        currentPerson.getFace();
    }
}
