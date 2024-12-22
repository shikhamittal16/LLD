package BookMyShow.Enums;

public enum PaymentStatus {
    PAID,               // Payment was successfully completed
    UNPAID,             // Payment has not been made
    PENDING,            // Payment is in progress or awaiting confirmation
    FAILED,             // Payment attempt failed
    REFUNDED,           // Payment has been refunded successfully
    REFUND_PENDING,     // Refund process is pending
    CANCELLED,          // Payment was cancelled before completion
    DECLINED            // Payment was declined by the payment processor or bank
}
