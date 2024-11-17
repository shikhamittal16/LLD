package StrategyDesignPattern.PaymentProcessingSystem;

public class CreditCard implements PaymentTypes{

    PaymentStrategies paymentStrategies;
    public CreditCard(PaymentStrategies paymentStrategies) {
        this.paymentStrategies = paymentStrategies;
    }
    @Override
    public void pay() {
        System.out.println("paying using CreditCard...");
        paymentStrategies.paymentStrategy();
    }
}
