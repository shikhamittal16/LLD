package StrategyDesignPattern.PaymentProcessingSystem;

// Ques -> Payment System
// design a payment processing system where a user can pay using multiple payment methods (e.g., credit card, PayPal).
// The system should be able to add new payment methods without changing existing code.
// Requirements:
//  Implement different payment methods as separate strategies.
//  Ensure the system can switch between different payment methods dynamically.
//  Consider validation and confirmation for each payment method.
//  Follow-up: How would you add a new payment method, say Apple Pay, to this system? How does the Strategy Pattern help in maintaining and scaling this system?
public class PaymentMain {
    public static void main(String []arg) {
        CreditCard creditCard = new CreditCard(new CardDetails());
        creditCard.pay();

        Paypal paypal = new Paypal(new RedirectionToSite());
        paypal.pay();

        ApplePay applePay = new ApplePay(new CardDetails());
        applePay.pay();
    }
}
