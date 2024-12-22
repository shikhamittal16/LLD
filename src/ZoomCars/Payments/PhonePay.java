package ZoomCars.Payments;

public class PhonePay implements PaymentMethods {
    PaymentStrategy paymentStrategy;

    public PhonePay(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    @Override
    public void pay() {
        paymentStrategy.getPaymentStrategy();

    }
}
