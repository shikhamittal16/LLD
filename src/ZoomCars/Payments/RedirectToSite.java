package ZoomCars.Payments;

import StrategyDesignPattern.PaymentProcessingSystem.PaymentStrategies;

public class RedirectToSite implements PaymentStrategies {
    @Override
    public void paymentStrategy() {
        System.out.println("--- payment completed using redirect to site strategy --- ");
    }
}
