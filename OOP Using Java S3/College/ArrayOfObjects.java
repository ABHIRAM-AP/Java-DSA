package College;
import java.util.*;

class Book{
  String title,author;
  double price;
  Book(String title,String author,double price)
  {
    this.title=title;
    this.author=author;
    this.price=price;
  }
  public void displayDetails()
  {
    System.out.println("Title: "+title+"\tAuthor: "+author+"\tPrice: "+price);
  }
}


public class ArrayOfObjects {
  public static void main(String[] args) {
    String title,author;
    double price;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of books:");
    int num=s.nextInt();
    s.nextLine();

    Book []b=new Book[num];
    for(int i=0;i<num;i++)
    {
      System.out.println("Enter title:");
      title=s.nextLine();

      System.out.println("Enter author:");
      author=s.nextLine();

      System.out.println("Enter price");
      price=s.nextDouble();
      s.nextLine();

      b[i]=new Book(title,author,price);
    }
    for(int i=0;i<num;i++)
    {
    
      b[i].displayDetails();
    }
    s.close();
    
  }
}
