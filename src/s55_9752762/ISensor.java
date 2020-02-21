package s55_9752762;

public interface ISensor {
    void setCommand(ICommand command);
    void execute();
    void addListener(IListener listener);
    void removeListener(IListener listener);
}
