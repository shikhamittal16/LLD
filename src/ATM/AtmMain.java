package ATM;


import java.util.Scanner;

public class AtmMain {
    public static void main(String []arg) {
        Scanner scanner = new Scanner(System.in);

        TransactionImpl transaction = new TransactionImpl();

        ATM atm = new ATM(new IdealState());
        States currentState = atm.currentState;

        if (currentState instanceof IdealState) {
            currentState.insertCard();
        }

        int userInput = scanner.nextInt();

        if (userInput == 1) {
            currentState = atm.setState(new CardReader());
            Boolean status = currentState.readCard();
            if (status) {
                currentState = atm.setState(new TransactionOptions());
                currentState.chooseOptions();
                userInput = scanner.nextInt();

                switch (userInput) {
                    case 1 :
                        System.out.println("** Enter amount to withdraw **");
                        userInput = scanner.nextInt();
                        Boolean subStatus = transaction.withdrawMoney(userInput , null);
                        if (subStatus) {
                            System.out.println("** amount withdraw successfully **");
                        } else {
                            System.out.println("** something went wrong **");
                        }
                        break;
                    case 2 :
                        System.out.println("press 1 to deposit via cash ");
                        System.out.println("press 2 to deposit via check ");

                        userInput = scanner.nextInt();
                        switch(userInput) {
                            case 1 :
                                subStatus = transaction.depositMoney(userInput , null, "cash");
                                break;
                            case 2 :
                                subStatus = transaction.depositMoney(userInput , null, "check");
                                break;
                            default:
                                System.out.println(" ** operation not allowed **");
                                subStatus = false;
                        }
                        if (subStatus) {
                            System.out.println("** amount deposit successfully **");
                        } else {
                            System.out.println("** something went wrong **");
                        }
                        break;
                    case 3 :
                        System.out.println("press 1 to enter beneficiary mobile no ");
                        System.out.println("press 2 to enter beneficiary account no ");

                        userInput = scanner.nextInt();
                        Account account = null;
                        switch(userInput) {
                            case 1 :
                                System.out.println("enter beneficiary mobile no ");
                                String phn = scanner.next();
                                account = new BankService().findAccountByMobileNo(phn);
                                break;
                            case 2 :
                                System.out.println("enter beneficiary account no ");
                                String accountNo = scanner.next();
                                account = new BankService().findAccountByAccountNo(accountNo);
                                break;
                            default:
                                System.out.println("** operation not allowed **");
                                break;
                        }

                        if(account != null) {
                            transaction.transferMoney(userInput, null, null);
                            System.out.println("** amount transfer successfully **");
                        }
                        else
                            System.out.println("Transaction declined: beneficiary account not found");
                        break;
                    case 4 :
                        transaction.balanceEnquiry(null);
                        break;
                    default:
                        System.out.println("** operation not allowed **");
                        break;
                }
            }

        } else {
            System.out.println(" ** operation not allowed ** ");
        }
    }
}
