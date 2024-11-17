package StrategyDesignPattern.PaymentProcessingSystem;

public class ApplePay implements PaymentTypes{
    PaymentStrategies paymentStrategies;
    public ApplePay(PaymentStrategies paymentStrategies) {
        this.paymentStrategies = paymentStrategies;
    }
    @Override
    public void pay() {
        System.out.println("paying using apple pay...");
        paymentStrategies.paymentStrategy();
    }
}
