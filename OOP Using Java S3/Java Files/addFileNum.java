import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class addFileNum
{
  public static void main(String[]args)
  {
    try{
    File f=new File("AddNum.txt");
      if(f.createNewFile())
      {
        System.out.println("File Created "+f.getName());
      }
      else{
        System.out.println("File Already Exists");
      }

      BufferedReader reader=new BufferedReader(new FileReader("AddNum.txt"));
      int num1=Integer.parseInt(reader.readLine().trim());
      int num2=Integer.parseInt(reader.readLine().trim());

      int sum=num1+num2;
      System.out.println("Sum ="+sum);
      reader.close();
    }

    catch(IOException e)
    {
      System.out.println("Error Occured!!");
    }
    catch(Exception e)
    {
      System.out.println("Error other than IOException Occured!!!!");
    }
  }
}