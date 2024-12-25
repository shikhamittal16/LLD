package ATM;

public interface SubStates {
    Boolean withdrawMoney(double price , Account accountDetails);
    Boolean depositMoney(double price , Account accountDetails, String depositMethod);
    Boolean transferMoney(double price , Account transferFrom , Account transferTo);
    void balanceEnquiry(Account accountDetails);
}
