package VendingMachine;

public class IdleState implements States{
    @Override
    public void pressInsertCoinButton() {
        System.out.println("----- insert coin button pressed ----- ");
    }

    @Override
    public void insertCoin() throws Exception {
        throw new Exception("operation not allowed here");
    }

    @Override
    public void pressSelectProductButton() throws Exception {
        throw new Exception("operation not allowed here");
    }

    @Override
    public void chooseProduct() throws Exception{
        throw new Exception("operation not allowed here");
    }

    @Override
    public void cancelProduct() throws Exception{
        throw new Exception("operation not allowed here");
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
