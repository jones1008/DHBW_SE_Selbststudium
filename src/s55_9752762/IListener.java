package s55_9752762;

public interface IListener {
    void personDetected(ICommand command);
    void open();
    void close();
}
