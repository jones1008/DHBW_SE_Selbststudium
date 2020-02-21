package s55_9752762;

public abstract class Reader implements IReader {
    protected ICommand command;
    protected Passport currentPassport;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void setCurrentPassport(Passport currentPassport) {
        this.currentPassport = currentPassport;
    }

    public Passport getCurrentPassport() {
        return currentPassport;
    }
}
