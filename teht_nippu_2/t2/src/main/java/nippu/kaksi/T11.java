package nippu.kaksi;

import java.util.ArrayList;
import java.util.Collections;

public class T11 {
    public int sumCalc(int[] arr) {

        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i + 2 < arr.length; i++) {

            sums.add(arr[i] + arr[i + 1] + arr[i + 2]);
        }

        return Collections.max(sums);
    }
}
