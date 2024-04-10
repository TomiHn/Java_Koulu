package nippu.kaksi.T18;

abstract class FileClass {
    protected final String filePath;
    protected final File fileType;

    protected FileClass(String file_path, File type) {
        this.filePath = file_path;
        this.fileType = type;
    }

    protected abstract void Open();

    protected abstract void Close();

    public String getFilePath() {
        return this.filePath;
    }

    public File getFileType() {
        return this.fileType;
    }

}
