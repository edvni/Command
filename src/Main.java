public class Main {
    public static void main(String[] args) {
        // Create receiver
        Receiver receiver = new Receiver();

        // Create concrete command and associate it with receiver
        Command command = new ConcreteCommand(receiver);

        // Create invoker and associate it with command
        Invoker invoker = new Invoker();
        invoker.setCommand(command);

        // Invoke command
        invoker.executeCommand();
    }
}