import java.util.*;

class Book {
    
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int item_no = s.nextInt();
        
        s.nextLine();  // Consume newline left-over

        // Array of BookDetails objects
        BookDetails[] b = new BookDetails[item_no];

       
        for (int i = 0; i < item_no; i++) {
           b[i] = new BookDetails();  // Initialize an empty object

          
            System.out.println();
            System.out.print("Enter the title of the book: ");
            String title = s.nextLine();

            System.out.print("Enter the author of the book: ");
            String author = s.nextLine();

            System.out.print("Enter the price of the book: ");
            float price = s.nextFloat();
            s.nextLine();  
            

            b[i].setDetails(title, author, price);
        }

        
        System.out.println("\nBook details:");
        for (int i = 0; i < item_no; i++) {
         System.out.println("Details of Book "+(i+1));
            b[i].display();
        }
    }
}

class BookDetails {
    String title, author;
    float price;

    
    public void setDetails(String t, String a, float p) {
        title = t;
        author = a;
        price = p;
    }

    public void display() {
        System.out.println();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}
