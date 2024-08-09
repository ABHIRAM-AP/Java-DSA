import java.util.*;

 class Book {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int item_no = s.nextInt();
        
         s.nextLine();
        BookDetails b[] =new BookDetails[item_no];
         
        for(int i=0;i<item_no;i++)
    {
       System.out.println();
         System.out.println("Enter the title of book:");
             String title = s.nextLine();
         
        System.out.print("Enter the author of book:");
        String author = s.nextLine();
        
        System.out.println("Enter the price of book:");
         float price = s.nextFloat();
          s.nextLine();
          System.out.println();
          b[i].display(title, author, price);
    }
       
    }
}

 class BookDetails {
     //Scanner sc =new Scanner(System.in);
    public static void display(String a, String b, float c) {
        System.out.println("Title: " + a +"\nAuthor: " + b +"\nPrice: "+ c);
       //  sc.nextLine();
    }
}

