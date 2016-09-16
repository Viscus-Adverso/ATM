import java.util.*;

/**
 * Created by Viscus on 9/14/16.
 */
public class ATM {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Heritage Trust");
        System.out.println("please enter your name.");

        int balance = 100;

        Scanner scanner =new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);


        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Would you like to check your balance, withdrawal, deposit, or cancel?");
            String choice = scanner.nextLine();


            if (choice.equalsIgnoreCase("balance")) {
                System.out.println("Your balance is " + balance);
            }
            else if (choice.equalsIgnoreCase("cancel")) {
                System.out.println("Thank you. Please come again.");
                throw new Exception();
            }
            else if (choice.equalsIgnoreCase("withdrawal")) {
                System.out.println("How much would you like to withdraw?");
                String withdrawal = scanner.nextLine();
                int withdrawalNum = Integer.valueOf(withdrawal);
                balance = balance - withdrawalNum;
            }

            else if (choice.equalsIgnoreCase("deposit")) {
                System.out.println("How much would you like to deposit?");
                String deposit = scanner.nextLine();
                int depositNum =  Integer.valueOf(deposit);
                balance = balance + depositNum;
            }

        }
    }

}
