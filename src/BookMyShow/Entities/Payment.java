package BookMyShow.Entities;

import BookMyShow.Enums.PaymentStatus;

import java.util.Date;

public class Payment {
    Double amount;
    Date payDate;
    Integer transactionId;
    PaymentStatus status;
}
