import java.util.*;
import java.lang.*;
class BookDetails {
    public static void display(String a, String b, float c) {
        System.out.println("Title: " + a + " Author: " + b + " Price: " + c);
    }
}

class Book {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the title of book:");
        String title = s.nextLine();
        System.out.println("Enter the author of book:");
        String author = s.nextLine();
        System.out.println("Enter the price of book:");
        float price = s.nextFloat();
        
        BookDetails.display(title, author, price);
    }
}
