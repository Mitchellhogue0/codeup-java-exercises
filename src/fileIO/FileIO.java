package fileIO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {

    //Class's responsibility is to make everything else run
    public static void main(String[] args) {
        init();
    }

    public static void init () {

        //Try to create the directory
        Path path = FileDirectoryUtil.getPath("src", "fileIO", "files");
        FileDirectoryUtil.tryCreateDirectory(path);

        // Try to create the file
        path = Paths.get(String.valueOf(path), "test.txt");
        FileDirectoryUtil.tryCreateFile(path);

        // Print out the final location of the file
        System.out.println(path.toAbsolutePath());


        //Try to print the contents of the fileIO
        IOUtil.tryPrintContents(path);
    }


}
