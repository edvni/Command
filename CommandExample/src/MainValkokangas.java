// Client
public class MainValkokangas {
    public static void main(String[] args) throws InterruptedException {
        // Create receiver
        Valkokangas valkokangas = new Valkokangas();

        // Create commands flip up and flip down
        // and associate with receiver
        Command switchUp = new FlipUpCommand(valkokangas);
        Command switchDown = new FlipDownCommand(valkokangas);

        // Create invoker and associate with commands
        WallButton button1 = new WallButton(switchUp);
        WallButton button2 = new WallButton(switchDown);

        // Push invoker button and execute associated commands
        button1.push();
        button2.push();
    }
}