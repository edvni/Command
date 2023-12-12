// Concrete Command 1
public class FlipUpCommand implements Command {
    private Valkokangas valkokangas;

    public FlipUpCommand(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }

    @Override
    public void execute() throws InterruptedException {
        valkokangas.turnOn();
    }
}
