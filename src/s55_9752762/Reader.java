package s55_9752762;

public abstract class Reader implements IReader {
    protected ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }
}
