package utils;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.copy;
import static java.nio.file.Files.move;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FileCopyUtils {

    public static void moveFile(String source, String destination) throws IOException {
        Path sourceFile = Paths.get(source);
        Path destinationFile = Paths.get(destination);
        move(sourceFile, destinationFile, REPLACE_EXISTING);
    }

    public static void copyFile(String source, String destination) throws IOException {
        Path sourceFile = Paths.get(source);
        Path destinationFile = Paths.get(destination);
        copy(sourceFile, destinationFile, REPLACE_EXISTING);
    }

}
