package nippu.kaksi.T14;

public class Tili {

    final private int accNum;
    private int balance;
    private String userName;

    Tili(int account, int balance, String name) {
        this.accNum = account;
        this.balance = balance;
        this.userName = name;
    }

    void addBalance(int amount) {
        this.balance += amount;
    }

    void drawFromBalance(int amount) {
        this.balance -= amount;
    }

    long showBalance() {
        return this.balance;
    }

    protected void showDetails() {
        System.out.println("Owner: " + this.userName);
        System.out.println("Account number: " + this.accNum);
        System.out.println("Balance: " + this.balance);
    }
}
