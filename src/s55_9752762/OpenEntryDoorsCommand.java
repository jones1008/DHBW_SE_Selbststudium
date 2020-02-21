package s55_9752762;

import java.util.List;

public class OpenEntryDoorsCommand extends OpenDoorCommand {
    public OpenEntryDoorsCommand() {
        this.currentDoors = AutomaticPassportControl.instance.getEntry().getDoors();
    }
}
