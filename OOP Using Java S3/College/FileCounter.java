import java.io.*;

public class FileCounter {
    public static void main(String[] args) {
        int sentence = 0, words = 0, characters = 0;
        File file = new File("Sample.txt");

        try {
            // Create or open file
            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File Exists");
            }

            // Writing to the file
            // BufferedWriter writer = new BufferedWriter(new FileWriter("Sample.txt"));
            // writer.write("Hi. How are you?");
            // writer.newLine();
            // writer.write("I am Abhiram.");
            // writer.newLine();
            // writer.close();

            // Reading from the file and counting characters, words, sentences
            BufferedReader reader = new BufferedReader(new FileReader("Sample.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                characters += line.length();
                
                // Count words
                String[] wordArray = line.trim().split("\\s+");
                words += wordArray.length;

                // Count sentences based on ending punctuation
                String[] sentences = line.split("[.!?]+");
                // Filter out any empty strings resulting from the split
                for (String s : sentences) {
                    if (!s.trim().isEmpty()) {
                        sentence++;
                    }
                }
            }
            reader.close();

            // Output results
            System.out.println("Characters: " + characters);
            System.out.println("Words: " + words);
            System.out.println("Sentences: " + sentence);

        } catch (IOException e) {
            System.out.println("Error Occurred: " + e.getMessage());
        }
    }
}
