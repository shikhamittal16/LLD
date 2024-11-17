package StrategyDesignPattern.PaymentProcessingSystem;

public class Paypal implements PaymentTypes{
    PaymentStrategies paymentStrategies;
    public Paypal(PaymentStrategies paymentStrategies) {
        this.paymentStrategies = paymentStrategies;
    }
    @Override
    public void pay() {
        System.out.println("paying using paypal...");
        paymentStrategies.paymentStrategy();
    }
}
