package VendingMachine;

public class HasMoneyState implements States{
    @Override
    public void pressInsertCoinButton() throws Exception{
        throw new Exception("operation not allowed here");
    }

    @Override
    public void insertCoin() {
        System.out.println("----- now customer is inserting coins ----");
    }

    @Override
    public void pressSelectProductButton() {

    }

    @Override
    public void chooseProduct() throws Exception{
        throw new Exception("operation not allowed here");
    }

    @Override
    public void cancelProduct() {

    }

    @Override
    public void returnChange() throws Exception{
        throw new Exception("operation not allowed here");
    }

    @Override
    public void dispenseProduct() throws Exception{
        throw new Exception("operation not allowed here");
    }
}
