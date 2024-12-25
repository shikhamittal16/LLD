package ATM;

public class TransactionImpl implements SubStates{

    @Override
    public Boolean withdrawMoney(double price, Account accountDetails) {
        return true;
    }
    @Override
    public Boolean depositMoney(double price , Account accountDetails, String depositMethod){
        return true;
    }
    @Override
    public Boolean transferMoney(double price , Account transferFrom , Account transferTo){
        return true;
    }
    @Override
    public void balanceEnquiry(Account accountDetails) {
        System.out.println(" ** your account balance is 50k");
    }
}
