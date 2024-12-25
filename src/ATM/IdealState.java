package ATM;

public class IdealState implements States{
    @Override
    public void insertCard() {
        System.out.println("** Press 1 to insert a card **");
    }

    @Override
    public Boolean readCard() {
        System.out.println("** operation not allowed **");
        return false;
    }

    @Override
    public void chooseOptions() {
        System.out.println("** operation not allowed **");
    }

    @Override
    public void exit() {
        System.out.println("** operation not allowed **");
    }
}
