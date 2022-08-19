
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account {

    int selection;

    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap<>();

    // validating login information
    //customer account number and pin

    public void getLogin() {
        int x = 1;

        do{
            try{
                data.put(704579940,1047);
                data.put(723245523,2580);
                data.put(712365478,9630);

                System.out.println("Welcome to the ATM Banking Machine! ");

                System.out.println("Enter your Account Number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter your pin: ");
                setPinNumber(menuInput.nextInt());

            } catch (Exception e){
                System.out.println("\n" + "Invalid character(s). Input Only Numbers!!!" + "\n");
                x = 2;
            }
            for (Map.Entry<Integer, Integer > entry : data.entrySet()){
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()){
                    getAccountType();
                }
        }
        System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");

    }
        while (x == 1);
}

// Display account Type Menu With selection

public void getAccountType(){
    System.out.println("Select the Account you want to access: ");
    System.out.println("Type 1 - Checking Account");
    System.out.println("Type 2 - Saving Account");
    System.out.println("Type 3 - Exit");
    System.out.println("Choice: ");

    selection = menuInput.nextInt();

    switch (selection) {
        case 1 -> getChecking();
        case 2 -> getSaving();
        case 3 -> System.out.println("Thank you for Banking with us Good Bye.");
        default -> {
            System.out.println("\n" + "Invalid Choice." + "\n");
            getAccountType();
        }
    }

}

// displaying checking account menu with selections

public void getChecking(){
    System.out.println("Checking Account: ");
    System.out.println("Type 1 - View Balance");
    System.out.println("Type 2 - Withdraw Funds");
    System.out.println("Type 3 - Deposit Funds");
    System.out.println("Type 4 - Exit");
    System.out.println("Choice: ");

    selection = menuInput.nextInt();

    switch(selection){
        case 1:
            System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()) +"\n");
            getAccountType();
            break;
        case 2:
            getCheckingWithdrawalInput();
            getAccountType();
            break;
        case 3:
            getCheckingDepositInput();
            getAccountType();
            break;
        case 4:
            System.out.println("Thank you for Banking with Us.");

        default:
            System.out.println("\n" + "Choice not Valid." + "\n");
            getChecking();
    }
}




//displaying savings account

public void getSaving(){
    System.out.println("Saving Account: ");
    System.out.println("Type 1 - View Balance");
    System.out.println("Type 2 - Withdraw Funds");
    System.out.println("Type 3 - Deposit Funds");
    System.out.println("Type 4 - Exit");
    System.out.println("Choice: ");

    selection = menuInput.nextInt();

    switch (selection) {
        case 1 -> {
            System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
            getAccountType();
        }
        case 2 -> {
            getSavingWithdrawInput();
            getAccountType();
        }
        case 3 -> {
            getSavingDepositInput();
            getAccountType();
        }
        case 4 -> System.out.println("Thank you for Banking with Us.");

        default -> {
            System.out.println("\n" + "choice is Invalid." + "\n");
            getSaving();
        }
    }
}

}