package Examples;


import java.io.*;


public class Files
{
  public static void main(String[]args)throws IOException
  {
    File i=new File("input.txt");
    File o=new File("output.txt");
    if(i.createNewFile() && o.createNewFile())
    {
      System.out.println("Files Created Successfully");
    }
    else
    {
      System.out.println("Files Already Exixts");
    }

    FileReader f1=null;
    FileWriter f2=null;
    try{
       f1=new FileReader("input.txt");
       f2=new FileWriter("output.txt");
         int c=f1.read();

       while(c!=-1)
       {
        f2.write(c);
        c=f1.read();
       }
    }
    catch(IOException e)
    {
      System.out.println(e);
    }
    catch(Exception e)
    {
      System.out.println("Handled");
    }
    finally
    {
      f1.close();
      f2.close();
    }

    }
}