import java.util.*;

 class Book {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        BookDetails b[] =new BookDetails[2];
         
        for(int i=0;i<2;i++)
    {
        b[i]=new BookDetails();
       System.out.println();
         System.out.println("Enter the title of book:");
             String title = s.nextLine();
         
        System.out.print("Enter the author of book:");
        String author = s.nextLine();
        
        System.out.println("Enter the price of book:");
         float price = s.nextFloat();
          s.nextLine();
          System.out.println();
          b[i].setDetails(title, author, price);
    }
       System.out.println("\nBook details:");
        for (int i = 0; i < 2; i++) {
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
