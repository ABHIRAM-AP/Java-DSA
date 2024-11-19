package College;

import java.util.*;


class Book
{
  String title,author;
  double price;
  Book(String t,String a,double p)
  {
    this.title=t;
    this.author=a;
    this.price=p;
  }
  public void displayDetails()
  {
      System.out.println("Title: "+title+" Author: "+author+" Price: "+price);
      System.out.println();
  }
}

public class TwoObjects {
  public static void main(String[] args) {
    String title,author;
    double price;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Title:");
     title=s.nextLine();

    System.out.println("Enter author:");
     author=s.nextLine();

    System.out.println("Enter price:");
     price=s.nextDouble();
     s.nextLine();

    Book ob1=new Book(title,author,price);
    ob1.displayDetails();



    System.out.println("Enter Title:");
     title=s.nextLine();

    System.out.println("Enter author:");
     author=s.nextLine();

    System.out.println("Enter price:");
     price=s.nextDouble();

    Book ob2=new Book(title,author,price);
    ob2.displayDetails();

    s.close();
  }
}
