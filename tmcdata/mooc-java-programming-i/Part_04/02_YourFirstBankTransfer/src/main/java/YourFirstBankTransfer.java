
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matt = new Account("Matthews account", 1000);
        Account me = new Account("My account", 0);
        matt.withdrawal(100.0);
        me.deposit(100.0);
        System.out.println(matt);
        System.out.println(me);
    }
}
