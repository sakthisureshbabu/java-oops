package dependency_injection;

public class Main {
    public static void main(String[] args) {
        OrderService emailService = new OrderService(new EmailNotifier());
        emailService.placeOrdere();

        OrderService smsService = new OrderService(new SMSNotifier());
        smsService.placeOrdere();
    }
}