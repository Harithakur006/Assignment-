package java4;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) throws IOException {
        // Create a new file in the specified folder
        File f1 = new File("D:\\New folder\\Test.txt");

        // Create a FileWriter for the file
        FileWriter fw = new FileWriter(f1);

        // Create a BufferedWriter to write to the file
        BufferedWriter wr = new BufferedWriter(fw);

        // Write to the file
        wr.append("third line");
        wr.append("second line");
        // Close the BufferedWriter
        wr.close();
    }
}
