import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    private double deposit = 0;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    //setting customer number

    public void setCustomerNumber(int CustomerNumber){
        
        this.customerNumber = CustomerNumber;
    }

    // getting the customer number

    public int getCustomerNumber(){

        return customerNumber;
    }

    //setting the pin
    public void setPinNumber(int pinNumber){

        this.pinNumber = pinNumber;
    }

    //getting the pin
    public int getPinNumber(){

        return pinNumber;
    }

    public void getCheckingDepositInput() {
        double amount;
        int y;
        do{
            try {
                System.out.println("Please Enter the Amount you wish to deposit: ");
                amount = input.nextDouble();

                deposit = (deposit + amount);
                System.out.println("You have deposited: " +deposit);

            }catch (Exception e ){

                System.out.println("Invalid Entry!!! please enter amount in Numbers.");
                 y = 2;
            }
            for(amount = 1; amount>=1; amount++ ){
                if(amount <= 0 ){
                    getSavingDepositInput();
                }
            }

            return;

        }while(y == 1);




    }


    //get checking account balance

    public double getCheckingBalance(){

        return checkingBalance;
    }

    //get saving account balance

    public double getSavingBalance(){


        return savingBalance;
    }

    // calculating and checking the balance

    public void calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
    }

    //calculate saving account withdrawal

    public void calcSavingWithdraw(double amount){

        savingBalance = (savingBalance - amount);

    }

    public void calcSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
    }
// customer checking account withdraw input

    public void getCheckingWithdrawalInput(){
        System.out.println("Checking Account balance: " +moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from checking Account: ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balance: " +moneyFormat.format(checkingBalance));

        }else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    // customer saving account withdraw input

    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account: ");
        double amount = input.nextDouble();

        if ((savingBalance - amount) >= 0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account balance: " + savingBalance + "\n");

        }else{
            System.out.println("Balance cannot be negative." + "\n");

        }
    }
    //customer saving account deposit input
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit from saving Account: ");
        double amount = input.nextDouble();

        if((savingBalance + amount) >= 0){
            calcSavingDeposit(amount);
            System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));

        }else{

            System.out.println("Balance cannot be negative." + "\n");

        }
    }


}


// make three sets of words to choose from. Add your own!

        //string []  wordListOne =
        //    string []  wordListTwo =
       // string []  wordListThree =

// find out how many words are in each list
    //   int  oneLength = wordListOne.length;
      //  int twoLength = wordListTwo.length;
      //  int threeLength = wordListThree.length;
// generate three random numbers
   // int rand1 = (int) (Math.random() * oneLength);
    //    int rand2 = (int) (Math.random() * oneLength);
        //        int rand3=  (int) (Math.random() * oneLength);
// now build a phrase
    //String phrase =wordListOne[rand1] + " " +wordListTwo[rand2] +" "+ worldListThree[rand3];


// print out the phrase
//System.out.println(" what we need is " +phrase);