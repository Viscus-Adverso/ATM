/**
 * Created by Viscus on 9/16/16.
 */
public class UsersAccount {
    String name;
    String pass;
    double balance;

    public UsersAccount(String newName, String newPass, double newBalance) {
        setName(newName);
        setPass(newPass);
        setBalance(newBalance);
    }

    void setName(String newName) {
        name = newName;
    }

    void setPass(String newPass) {
        pass = newPass;
    }

    void setBalance(double newBalance) {
        balance = newBalance;
    }
}
