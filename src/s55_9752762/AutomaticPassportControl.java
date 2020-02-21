package s55_9752762;

public enum AutomaticPassportControl implements IAutomaticPassportControl {
    instance;
    private Entry entry = new Entry();
    private Sluice sluice = new Sluice();
    private Exit exit = new Exit();

    public Sluice getSluice() {
        return sluice;
    }

    public Entry getEntry() {
        return entry;
    }

    public Exit getExit() {
        return exit;
    }
}
