package s55_9752762;

public class ExitSensor extends Sensor {
    public void personDetected() {
        for (IListener listener : this.listeners) {
            // send close door Command
            listener.personDetected(new CloseEntryDoorsCommand());
        }
    }
}
