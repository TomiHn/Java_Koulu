package nippu.kaksi.T14;

import java.util.ArrayList;

public class Pankki {

    ArrayList<Tili> accounts = new ArrayList<>();

    void addAccount(int account, int balance, String name) {
        Tili newTili = new Tili(account, balance, name);

        this.accounts.add(newTili);
    }
}
