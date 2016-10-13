import java.util.*;

/**
 * Created by Viscus on 9/14/16.
 */
public class ATM {
    static HashMap<String, UsersAccount> accounts = new HashMap<>();




    public static void main(String[] args) throws Exception {
        accounts.put("Xenos", new UsersAccount("Xenos", "Brox", 47));
        accounts.put("Darius", new UsersAccount("Darius", "Loyalty", 500));



        System.out.println("Welcome to ");
        System.out.println("please enter your name.");



        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Welcome, " + name);

        UsersAccount user = accounts.get(name);
        if (user == null) {
            user = new UsersAccount(name, "pass", 100);
            accounts.put(name, user);
        }


        boolean keepRunning = true;

        while (keepRunning) {
            System.out.println("Would you like to check your balance, withdrawal, deposit, or cancel?");
            String choice = scanner.nextLine();


            if (choice.equalsIgnoreCase("balance")) {
                System.out.println("Your balance is " + user.balance);
            } else if (choice.equalsIgnoreCase("cancel")) {
                System.out.println("Thank you. Please come again.");
                throw new Exception();
            } else if (choice.equalsIgnoreCase("withdrawal")) {
                System.out.println("How much would you like to withdraw?");
                String withdrawal = scanner.nextLine();
                double withdrawalNum = Double.valueOf(withdrawal);
                user.balance = user.balance - withdrawalNum;
            } else if (choice.equalsIgnoreCase("deposit")) {
                System.out.println("How much would you like to deposit?");
                String deposit = scanner.nextLine();
                double depositNum = Double.valueOf(deposit);
                user.balance = user.balance + depositNum;
            }

        }
    }

    }

