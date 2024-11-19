import java.io.*;
import java.util.*;

public class Files2
{
  @SuppressWarnings("resource")
  public static void main(String[] args) {
        int op=0;
        Scanner s=new Scanner(System.in);
      try{
        File f=new File("StudentRecord.txt");
        if(f.createNewFile())
        {
          System.out.println("File Created: "+f.getName());
        }
        else{
          System.out.println("File Exists");
        }

        FileWriter writer=new FileWriter("StudentRecord.txt",true);

        while(op!=3)
        {
          System.out.println("1-Add Details\n2-Display Details\n3-Exit\n");
          op=s.nextInt();
          s.nextLine();
          switch(op)
              {
                case 1:
                System.out.println("Enter name:");
                String name=s.nextLine();
                System.out.println("Enter Roll number:");
                int roll_no=s.nextInt();
                s.nextLine();
                System.out.println("Enter marks:");
                int marks=s.nextInt();
                s.nextLine();

                writer.write("Name: "+name+ " Roll_No: "+roll_no+" Marks: "+marks+"\n");
                writer.flush();
                break;

                case 2:
                displayDetails();
                break;

                case 3:
                System.exit(0);
                break;
              }
          }
      }

      catch(IOException e)
      {
        System.out.println(e.getMessage());
      }

    }
    public static void displayDetails()
    {
      try{
        FileReader reader=new FileReader("StudentRecord.txt");
        int data=reader.read();
        while(data!=-1)
        {
          System.out.print((char)data);
          data=reader.read();
        }
        reader.close();
      }
      catch(IOException e)
      {
        System.out.println(e.getMessage());
      }
    }
    
    
}