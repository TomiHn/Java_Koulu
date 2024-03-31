package nippu.kaksi;

import nippu.kaksi.T14.*;

public class Main {
    public static void main(String[] args) {

        T11 t11 = new T11();
        T12 t12 = new T12();
        T13 t13 = new T13();

        // T15 t15 = new T15();
        // T16 t16 = new T16();
        // T17 t17 = new T17();
        // T18 t18 = new T18();
        // T19 t19 = new T19();
        // T20 t20 = new T20();

        // Tehtävä 11
        System.out.println(t11.sumCalc(new int[] { 2, 5, 1, 3, 2 }));

        // Tehtävä 12
        System.out.println(t12.randNames());
        System.out.println(t12.randNames());

        // Tehtävä 13
        System.out.println(t13.fileCalc(""));

        // Tehtävä 14
        Pankki bank = new Pankki();

    }
}