package s55_9752762;

public class Door implements IListener{
    private boolean isOpen;

    public Door() {
        isOpen = false;
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    public void personDetected(ICommand command) {
        command.execute();
    }
}
