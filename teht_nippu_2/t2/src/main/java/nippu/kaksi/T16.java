package nippu.kaksi;

public class T16 {
    public int findMissingNum(int[] arr) {

        int missing = 0;
        int compare = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != compare) {
                missing = compare;
                break;
            }
            compare++;
        }
        return missing;
    }
}
