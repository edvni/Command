// Receiver
public class Valkokangas {
    public void turnOn() throws InterruptedException {
        System.out.println("Valkokangas laskeutuu alas...");
        Thread.sleep(3000);
        System.out.println("Valkokangas on alhaalla.");
    }

    public void turnOff() throws InterruptedException {
        System.out.println("Valkokangas nousee ylös...");
        Thread.sleep(3000);
        System.out.println("Valkokangas on ylhäällä.");
    }
}
