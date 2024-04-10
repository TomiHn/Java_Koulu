package nippu.kaksi.T18;

public class SoundFile extends FileClass {

    public SoundFile(String filePath) {
        super(filePath, File.SOUND);
    }

    @Override
    public void Open() {
        System.out.println("Opening audio file...");
    }

    @Override
    public void Close() {
        System.out.println("Closing audio file...");
    }
}
