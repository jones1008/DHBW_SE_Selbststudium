package s55_9752762;

public enum AutomaticPassportControl implements IListener {
    instance;
    private Entry entry;
    private Sluice sluice;
    private Exit exit;
    private ICommand command;

    public Sluice getSluice() {
        return sluice;
    }
}
