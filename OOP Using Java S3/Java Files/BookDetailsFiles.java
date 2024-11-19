import java.io.*;
import java.util.*;

class Book {
    int bookNo;
    String name;

    Book(int bookNo, String name) {
        this.bookNo = bookNo;
        this.name = name;
    }
}

class Author extends Book {
    String authorName;

    Author(int bookNo, String name, String authorName) {
        super(bookNo, name);
        this.authorName = authorName;
    }
}

class Pub extends Author {
    String pubName;

    Pub(int bookNo, String name, String authorName, String pubName) {
        super(bookNo, name, authorName);
        this.pubName = pubName;
    }
}

class BookDetailsFiles{
    public static void main(String[] args) throws IOException {
        String filename = "fake.txt";
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Pub[] publ = new Pub[n];
        boolean check = true;
        int i = 0;

        while (check) {
            System.out.println("1) Insert\n2) Delete\n3) Exit");
            int opt = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (opt) {
                case 1:
                    if (i >= n) {
                        System.out.println("Array is full. Cannot insert more books.");
                        break;
                    }
                    System.out.println("Enter the book number:");
                    int bookNo = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    System.out.println("Enter the name:");
                    String name = sc.nextLine();

                    System.out.println("Enter the author name:");
                    String authorName = sc.nextLine();

                    System.out.println("Enter the pub name:");
                    String pubName = sc.nextLine();

                    publ[i] = new Pub(bookNo, name, authorName, pubName);
                    i++;

                    // Append to the file
                    try (FileWriter fw = new FileWriter(filename, true)) {
                        fw.write(bookNo + " " + name + " " + authorName + " " + pubName);
                        fw.write("\n");
                    }
                    break;

                case 2:
                    System.out.println("Enter the book number to delete:");
                    int num = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    boolean found = false;

                    // Mark the book for deletion
                    for (int j = 0; j < i; j++) {
                        if (publ[j].bookNo == num) {
                            found = true;
                            System.out.println("Deleted: " + publ[j].name);
                            // Shift elements left
                            for (int left = j; left <= i ; left++) {
                                publ[left] = publ[left + 1];
                            }
                            publ[i - 1] = null; // Clear last element
                            i--; // Decrease count
                            break; // Exit the loop
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    } else {
                        // Rewrite the file
                        try (FileWriter fw = new FileWriter(filename)) {
                            for (int j = 0; j < i; j++) {
                                fw.write(publ[j].bookNo + " " + publ[j].name + " " + publ[j].authorName + " " + publ[j].pubName);
                                fw.write("\n");
                            }
                        }
                    }
                    break;

                case 3:
                    check = false;
                    break;

                default:
                    System.out.println("Invalid option\n");
            }
        }

        sc.close();
    }
}