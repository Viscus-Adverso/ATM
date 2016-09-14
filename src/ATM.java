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
            System.out.println("Would you like to check your balance, withdrawl, or cancel?");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("balance")) {
                System.out.println("Your balance is " + balance);
            } else if (choice.equalsIgnoreCase("cancel")) {
                System.out.println("Thank you. Please come again.");
                throw new Exception();
            } else if (choice.equalsIgnoreCase("withdrawl")) {
                System.out.println("How much would you like to withdraw?");
                String withdrawl = scanner.nextLine();
                int withdrawlNum = Integer.valueOf(withdrawl);
                balance = balance - withdrawlNum;


            }


        }
    }

}
