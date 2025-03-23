public class Payment implements Payable {
    private final double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public final void processPayment(double amount) {
        System.out.println("Process payment of $" + amount);
    }
}
