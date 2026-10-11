package dependency_injection;

public class OrderService {
    private final Notifier notifier;

    OrderService(Notifier notifier) {
        this.notifier = notifier;
    }

    void placeOrdere() {
        notifier.send("Order placed");
    }
}