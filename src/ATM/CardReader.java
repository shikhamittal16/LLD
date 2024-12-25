package ATM;

public class CardReader implements States{
    @Override
    public void insertCard() {
        System.out.println("** operation not allowed **");
    }

    @Override
    public Boolean readCard() {
        System.out.println("** reading card info **");
        return true;
    }

    @Override
    public void chooseOptions() {
        System.out.println("** operation not allowed **");
    }

    @Override
    public void exit() {

    }
}
