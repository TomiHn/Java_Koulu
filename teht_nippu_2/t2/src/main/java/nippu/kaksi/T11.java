package nippu.kaksi;

public class T11 {
    public int sumCalc(int[] arr) {

        int max = arr[0];

        for (int i = 0; i + 2 < arr.length; i++) {
            int maxTemp = arr[i] + arr[i + 1] + arr[i + 2];

            if (maxTemp > max) {
                max = maxTemp;
            }
        }
        return max;

    }
}
