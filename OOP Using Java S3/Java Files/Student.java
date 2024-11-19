import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

     
        try (FileWriter writer = new FileWriter("studrecord.txt")) { 
            while (choice != 3) {
                System.out.println("Enter choice\n1-Add Student\n2-Display Student\n3-Exit");
                choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.println("Enter name:");
                        String name = scanner.nextLine();
                        System.out.println("Enter roll number:");
                        int rollno = scanner.nextInt(); 
                        scanner.nextLine(); 
                        System.out.println("Enter marks:");
                        int marks = scanner.nextInt();
                        scanner.nextLine(); 

                
                        writer.write("Name: " + name + ", Roll No: " + rollno + ", Marks: " + marks + "\n");
                        writer.flush(); 
                        System.out.println("Student record added.");
                        break;

                    case 2:
                        displayStudents(); 
                        break;

                    case 3:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            }
        } 
        catch (IOException e) {
            System.out.println("Error!! " + e.getMessage());
        } 
        finally {
            scanner.close(); 
        }
    }

   
    private static void displayStudents() 
    {
        try (FileReader reader = new FileReader("studrecord.txt")) 
        {
            int data;
            System.out.println("Student Records:");
            while ((data = reader.read()) != -1) {
                System.out.print((char) data); 
            }
            System.out.println(); 
        } catch (IOException e) {
            System.out.println("Error reading student records: " + e.getMessage());
        }
    }
}
