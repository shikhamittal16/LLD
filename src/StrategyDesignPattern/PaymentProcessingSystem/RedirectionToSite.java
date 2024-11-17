package StrategyDesignPattern.PaymentProcessingSystem;

public class RedirectionToSite implements PaymentStrategies{
    @Override
    public void paymentStrategy() {
        System.out.println("in this strategy we need to redirect to the official website to complete the payment");
    }
}
