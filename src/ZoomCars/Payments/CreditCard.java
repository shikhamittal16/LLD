package ZoomCars.Payments;

import StrategyDesignPattern.PaymentProcessingSystem.PaymentStrategies;

public class CreditCard implements PaymentStrategies {
    @Override
    public void paymentStrategy() {
        System.out.println("--- payment completed using credit card details --- ");
    }
}
