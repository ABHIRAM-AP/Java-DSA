import java.io.*;
public class PalindromeFiles
{
  public static void main(String[]args){
    File f1=new File("input.txt");
    File f2=new File("output.txt");
    try{
    if(f1.createNewFile() && f2.createNewFile())
    {
      System.out.println("Files Created "+f1.getName()+" & "+f2.getName());
    }
    else{
      System.out.println("File Already Exists");
    }
    BufferedReader reader=new BufferedReader(new FileReader("input.txt"));
    BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt"));
    String line="";
    
    while((line=reader.readLine())!=null)
    { 
      String rev="";
        for(int i=line.length()-1;i>=0;i--)
        {
          rev=rev+line.charAt(i);
        }
        if(line.equalsIgnoreCase(rev))
        {
          System.out.println(line + " is a palindrome");
           writer.write(line + " is a palindrome\n");
        }
        else{
          System.out.println(line + " is not a palindrome");
          writer.write(line + " is not a palindrome\n");
        }
      }
      reader.close();
      writer.close();
    }
    
  

  

  catch(IOException e)
  {
    System.out.println("Error Occured!!");
  }
  }
}
