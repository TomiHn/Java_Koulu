package nippu.kaksi;

import java.io.File;

public class T13 {
    public long fileCalc(String filePath) {

        File file = new File(filePath);
        long size = 0;

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File oneFile : files) {
                if (oneFile.isDirectory()) {
                    size += fileCalc(oneFile.getPath());
                } else {
                    size = oneFile.length();
                }
            }
        } else {
            size = file.length();
        }
        return size;
    }
}
