package ZoomCars.Payments;

public class ApplePay implements PaymentMethods {
    PaymentStrategy paymentStrategy;

    public ApplePay(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    @Override
    public void pay() {
        paymentStrategy.getPaymentStrategy();
    }
}
