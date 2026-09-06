import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StudentFileHandling {

    public static void main(String[] args) {

        String fileName = "student.txt";

        try {
            // Step 1: Create a file
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // Step 2: Write student information into the file
            FileWriter writer = new FileWriter(fileName);

            writer.write("Student ID: 101\n");
            writer.write("Student Name: Sneha Kesharwani\n");
            writer.write("Course: B.Tech Computer Science and Engineering\n");
            writer.write("Marks: 85\n");

            writer.close();

            System.out.println("Student information written to the file.");

            // Step 3: Read information from the file
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            System.out.println("\n----- STUDENT RECORD -----");

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while handling the file.");
            System.out.println(e.getMessage());
        }
    }
}