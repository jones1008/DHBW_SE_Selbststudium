package s55_9752762;

public class ScanFaceCommand implements ICommand{
    private Sluice sluice;
    private Person currentPerson;

    public ScanFaceCommand(Person person) {
        this.currentPerson = person;
    }

    public void setCurrentPerson(Person currentPerson) {
        this.currentPerson = currentPerson;
    }

    public void execute() {
        currentPerson.getFace();
    }
}
