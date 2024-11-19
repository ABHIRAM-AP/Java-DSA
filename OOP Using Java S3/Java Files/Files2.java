import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class Files2 {
    public static void main(String[] args) {
        try {
            File file = new File("Sample.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

             BufferedWriter writer = new BufferedWriter(new FileWriter("Sample.txt"));
             writer.write("This is the first line.");
            writer.newLine(); // Add a newline
            writer.write("This is the second line.");
            writer.newLine(); // Add another newline
            writer.write("BufferedWriter makes file writing efficient!");
            
            // Close the writer
            writer.close();

              //Usage of Append mode by creating FileWriter object and pass that object using BufferedWriter 
            FileWriter writer1 = new FileWriter("Sample.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer1);
            bufferedWriter.newLine();
            bufferedWriter.write("Appending this line.");
            bufferedWriter.newLine();
            bufferedWriter.close();


             BufferedReader reader = new BufferedReader(new FileReader("Sample.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

          

        } 
        
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
