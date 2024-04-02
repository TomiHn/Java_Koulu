package nippu.kaksi.T14;

import java.util.ArrayList;

public class Pankki {

    public ArrayList<Tili> accounts = new ArrayList<>();

    public void addAccount(Tili account) {

        this.accounts.add(account);
    }

    public void deleteAccount(int account) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).accNum == account) {
                accounts.remove(i);
                return;
            }
        }
    }

    public void showAccount(int account) {
        for (Tili tili : accounts) {
            if (account == tili.accNum) {
                tili.showDetails();
            }
        }
    }

    // Extra methodi toiminnan todentamiseen
    public void showAllAccounts() {
        int i = 1;
        for (Tili tili : accounts) {
            System.out.println(i + ": " + tili.accNum);
            i++;
        }
    }
}
