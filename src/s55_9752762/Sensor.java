package s55_9752762;

import java.util.ArrayList;
import java.util.List;

public abstract class Sensor {
    protected List<IListener> listeners;
    protected ICommand command;

    public Sensor() {
        listeners = new ArrayList<>();
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }

    public void addListener(IListener listener) {
        listeners.add(listener);
    }

    public void removeListener(IListener listener) {
        listeners.remove(listener);
    }
}
