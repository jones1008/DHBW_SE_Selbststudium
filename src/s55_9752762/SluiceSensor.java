package s55_9752762;

public class SluiceSensor extends Sensor {

    public void personDetected(Person person) {
        // send close commands to entry doors
        for (IListener listener : this.listeners) {
            listener.personDetected(new CloseEntryDoorsCommand());
        }
        // send decrypt and scanFace commands to FaceReader
        this.command = new DecryptPassportCommand();
        command.execute();
        this.command = new ScanFaceCommand(person);
        command.execute();
    }
}
