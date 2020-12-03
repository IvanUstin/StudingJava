package stringsAndBasicsOfTextProcessing.WorkingWithRegularExpression;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WorkingFileMethods {

    public static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void recordFile (String fileName, String text) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));
        writer.write(text);
        writer.newLine();
        writer.close();
    }
}


