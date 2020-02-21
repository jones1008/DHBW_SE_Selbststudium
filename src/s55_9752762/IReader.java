package s55_9752762;

public interface IReader {
    void openDoorsCommand();
    void setCommand(ICommand command);
    void setCurrentPassport(Passport currentPassport);
    Passport getCurrentPassport();
}
