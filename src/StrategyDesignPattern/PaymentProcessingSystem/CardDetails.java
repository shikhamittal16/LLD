package StrategyDesignPattern.PaymentProcessingSystem;

public class CardDetails implements PaymentStrategies{
    @Override
    public void paymentStrategy() {
        System.out.println(" in this strategy we need your card details and validation through CVV to complete the payment");
    }
}
