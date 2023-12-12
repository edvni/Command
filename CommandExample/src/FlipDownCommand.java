// Concrete Command 2
public class FlipDownCommand implements Command {
    private final Valkokangas valkokangas;

    public FlipDownCommand(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }

    @Override
    public void execute() throws InterruptedException {
        valkokangas.turnOff();
    }
}
