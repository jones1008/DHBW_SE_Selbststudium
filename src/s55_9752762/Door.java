package s55_9752762;

public class Door implements IListener {
    private boolean isOpen;
    private String name;

    public Door(String name) {
        isOpen = false;
        this.name = name;
    }

    public void open() {
        isOpen = true;
        System.out.println("INFO: door (" + name + ") opened");
    }

    public void close() {
        isOpen = false;
        System.out.println("INFO: door (" + name + ") closed");
    }

    public void personDetected(ICommand command) {
        command.execute();
    }
}
