package ATM;

public class TransactionImpl {
    Boolean withdrawMoney(double price , Account accountDetails) {
        return true;
    }
    Boolean depositMoney(double price , Account accountDetails, String depositMethod){
        return true;
    }
    Boolean transferMoney(double price , Account transferFrom , Account transferTo){
        return true;
    }
    void balanceEnquiry(Account accountDetails) {
        System.out.println(" ** your account balance is 50k");
    }
}
