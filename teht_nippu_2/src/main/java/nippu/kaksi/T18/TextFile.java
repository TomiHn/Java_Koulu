package nippu.kaksi.T18;

public class TextFile extends FileClass {

    public TextFile(String filePath) {
        super(filePath, File.TEXT);
    }

    @Override
    public void Open() {
        System.out.println("Opening text file...");
    }

    @Override
    public void Close() {
        System.out.println("Closing text file...");
    }
}
