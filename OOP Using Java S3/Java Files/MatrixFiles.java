import java.io.*;


public class MatrixFiles {
  public static void main(String[] args) {
    try{
    File f=new File("matrix.txt");
    File g=new File("output.txt");
    if(f.createNewFile() && g.createNewFile())
    {
      System.out.println("file Created");
    }
    else
    {
      System.out.println("Exists");
    }
    BufferedReader reader=new BufferedReader(new FileReader("matrix.txt"));
    BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt"));
    String line;
    while((line=reader.readLine())!=null)
    {
      writer.write(line);
      writer.flush();
      writer.newLine(); 
    }
  }
  catch(IOException e)
  {
    System.out.println("Handled");
  }
  }
}
