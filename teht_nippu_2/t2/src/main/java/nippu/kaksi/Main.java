package nippu.kaksi;

import nippu.kaksi.T14.*;

public class Main {

    // Tehtävän demossa niin paljon printtiä että tulee siistimpi Main näin.
    public static void T14Demo() {
        // Tehtävä 14
        Pankki bank = new Pankki();
        Tili tili1 = new Tili(1234, 100, "tili1");
        Tili tili2 = new Tili(12345, 150, "tili2");
        Tili tili3 = new Tili(123456, 150, "tili3");

        bank.addAccount(tili1);
        bank.addAccount(tili2);
        bank.addAccount(tili3);

        bank.showAllAccounts();

        bank.deleteAccount(12345);

        System.out.println("After deletion:");

        bank.showAllAccounts();
        System.out.println();

        System.out.println("Balances:");

        tili3.addBalance(50);
        System.out.println("Tili 3 balance: " + tili3.showBalance());
        tili1.drawFromBalance(50);
        System.out.println("Tili 1 balance: " + tili3.showBalance());
        System.out.println();

        System.out.println("All details:");
        bank.showAccount(1234);
        bank.showAccount(123456);
    }

    public static void main(String[] args) {

        T11 t11 = new T11();
        T12 t12 = new T12();
        T13 t13 = new T13();
        T16 t16 = new T16();
        T17 t17 = new T17();
        // T18 t18 = new T18();
        // T19 t19 = new T19();
        // T20 t20 = new T20();

        // Tehtävä 11
        System.out.println(t11.sumCalc(new int[] { 9, 8, 32, -2, 1 }));
        System.out.println("------------");

        // Tehtävä 12
        System.out.println(t12.randNames());
        System.out.println(t12.randNames());
        System.out.println("------------");

        // Tehtävä 13
        // Anna tiedostopolku argumenttina!
        System.out.println(t13.fileCalc(""));
        System.out.println("------------");

        // Tehtävä 14
        T14Demo();
        System.out.println("------------");

        // Tehtävä 15
        T15 first = T15.getInstance();
        T15 second = T15.getInstance();

        first.setTrack("Song1");
        second.setTrack("Song2");

        first.playTrack();
        second.playTrack();

        System.out.println(first.equals(second));
        System.out.println("------------");

        // Tehtävä 16
        System.out.println(t16.findMissingNum(new int[] { 1, 2, 3, 4, 6, 7, 8 }));
        System.out.println("------------");

        // Tehtävä 17
        // System.out.println(t17.reverseString("Hello"));
        String s = t17.reverseString("aabbccdd");
        System.out.println(s);

    }
}