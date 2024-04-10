package nippu.kaksi.T14;

public class Tili {

    final protected int accNum;
    protected int balance;
    protected String userName;

    public Tili(int account, int balance, String name) {
        this.accNum = account;
        this.balance = balance;
        this.userName = name;
    }

    public void addBalance(int amount) {
        this.balance += amount;
    }

    public void drawFromBalance(int amount) {
        this.balance -= amount;
    }

    public long showBalance() {
        return this.balance;
    }

    protected void showDetails() {
        System.out.println("Owner: " + this.userName);
        System.out.println("Account number: " + this.accNum);
        System.out.println("Balance: " + this.balance);
    }
}
