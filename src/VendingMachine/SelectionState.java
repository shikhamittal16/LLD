package VendingMachine;

public class SelectionState implements States{
    @Override
    public void pressInsertCoinButton() throws Exception{
        throw new Exception("operation not allowed here");
    }

    @Override
    public void insertCoin() throws Exception{
        throw new Exception("operation not allowed here");
    }

    @Override
    public void pressSelectProductButton() throws Exception{
        throw new Exception("operation not allowed here");
    }

    @Override
    public void chooseProduct() {

    }

    @Override
    public void cancelProduct() {

    }

    @Override
    public void returnChange() {

    }

    @Override
    public void dispenseProduct() throws Exception{
        throw new Exception("operation not allowed here");
    }
}
