
public class YourFirstAccount {

    public static void main(String[] args) {
        Account acc = new Account("Matt's account", 100.00);
        acc.deposit(20.00);
        System.out.println(acc);
    }
}
