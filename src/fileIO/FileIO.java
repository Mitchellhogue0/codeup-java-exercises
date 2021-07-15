package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {

    public static void main(String[] args) {
//        System.out.println(getFilePath("src", "fileIO", "test.txt").toAbsolutePath());

//        System.out.println("Does the path exist?");
//        System.out.println(doesPathExist(getFilePath("src", "fileIO", "test.txt")));
        tryCreateDirectory(getPath("src", "fileIO", "files"));
    }


    public static Path getPath(String fileName) {
        return Paths.get(fileName);
    }


    public static Path getPath(String parentDirectory, String fileName) {
        return Paths.get(parentDirectory, fileName);
    }


    public static Path getPath(String parentDirectory, String childDirectory, String fileName) {
        return Paths.get(parentDirectory, childDirectory, fileName);
    }

    public static boolean doesPathExist(Path path) {
        return Files.exists(path);
    }

    public static void tryCreateDirectory(Path pathToCreate) {
        if (!doesPathExist(pathToCreate)) {
            try {
                Files.createDirectory(pathToCreate);

            } catch (IOException e) {
                System.out.println("Could not create Directory");
                System.out.println(pathToCreate.toAbsolutePath());
            }
        } else {
            System.out.println("The path at: " + pathToCreate.toAbsolutePath() + " already exists");
        }
    }


}
