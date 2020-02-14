package s55_9752762;

import java.util.List;

public abstract class Sensor {
    protected List<IListener> listeners;
    protected ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }
}
