package nippu.kaksi;

public class T15 {

    private static T15 singleT15 = null;

    private String fileName = "";

    private T15() {
    }

    public static synchronized T15 getInstance() {
        if (singleT15 == null) {
            singleT15 = new T15();
        }
        return singleT15;
    }

    public void setTrack(String s) {
        this.fileName = s;
    }

    public void playTrack() {
        if (fileName == "") {
            System.out.println("No track selected!");
            return;
        }
        System.out.println("Playing track: " + this.fileName);
    }

}
