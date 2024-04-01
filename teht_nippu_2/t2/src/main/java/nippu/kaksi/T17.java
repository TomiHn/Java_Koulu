package nippu.kaksi;

public class T17 {
    public String reverseString(String s) {

        int start = 0;
        int end = s.length() - 1;

        String reversed = "";

        char[] sArr = s.toCharArray();

        while (start < end) {
            char tmp = sArr[start];
            sArr[start] = sArr[end];
            sArr[end] = tmp;
            start++;
            end--;
        }
        for (char c : sArr) {
            reversed = reversed + c;
        }

        return reversed;
    }
}
