import java.util.*;

public class atm_machine {
    public static void choose() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select option..");
        System.out.println("cash withdraw - press 1 :");
        System.out.println("Check Balance - press 2 :");
        System.out.println("Deposit - press 3 :");
        System.out.println("Exit -  press 4 :");
        int number = sc.nextInt();
        int Total_amount = 50000;
        int amount = 0;

        switch (number) {
            case 1:
                System.out.print("enter your 4 digit pin number: ");
                int x = sc.nextInt();
                System.out.print("Enter your amount:");
                amount = sc.nextInt();
                if (amount <= Total_amount) {
                    System.out.println("Please Wait while your transaction is being processed....");
                    System.out.println("Please collect your cash");
                    System.out.println("your transaction has been succesful....");
                } else {
                    System.out.println("you dont have sufficient balance");
                    System.out.println("your transaction has been declined....");
                }
                break;
            case 2:
                System.out.print("please enter your pin number:");
                x = sc.nextInt();
                Total_amount = Total_amount - amount;
                System.out.println("your avilable balance is : " + Total_amount);
                break;
            case 3:
                System.out.print("please enter your amount to deposited:");
                amount = sc.nextInt();
                System.out.print("please enter your pin number:");
                x = sc.nextInt();
                Total_amount = Total_amount + amount;
                System.out.println("Please Wait while your transaction is being processed....");
                System.out.println("Your amount has been successfully deposited");
                break;
            case 4:
                System.out.println("please remove your debit card:");
                break;
        }
        System.out.println();
        choose();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("!! WELCOME TO PNB ATM !!");
        System.out.println();
        System.out.println("Please Insert Your Debit card...");
        System.out.print("Please enter any two Random number....");
        int n = sc.nextInt();
        System.out.println("Please Wait while we are fetching your Details..... ");
        System.out.println();
        choose();

    }

}