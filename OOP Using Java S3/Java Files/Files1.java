
import java.io.*;

class Files1
{
  public static void main(String[]args)
  {
    File file=new File("AddNum.txt");

    if(file.exists())
    {
      System.out.println("File Exists");
      System.out.println("Path:"+file.getPath());
      System.out.println("Absolute Path:"+file.getAbsolutePath());
      
    }
    else{
      System.out.println("No file found");
    }
  }
}