package ATM;

public class TransactionOptions implements States{
    @Override
    public void insertCard() {
        System.out.println("** operation not allowed **");
    }

    @Override
    public Boolean readCard() {
        System.out.println("** operation not allowed **");
        return false;
    }

    @Override
    public void chooseOptions() {
        System.out.println("Press 1 to withdraw Money");
        System.out.println("Press 2 to deposit Money");
        System.out.println("Press 3 to transfer Money");
        System.out.println("Press 4 to balance Enquiry");
    }

    @Override
    public void exit() {

    }
}
