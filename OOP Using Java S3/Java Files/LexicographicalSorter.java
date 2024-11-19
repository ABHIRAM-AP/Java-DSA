
import java.io.*;

public class LexicographicalSorter
{
  public static void main(String[]args)
  {
    try
    {
      File f1=new File("input.txt");
      File f2=new File("output.txt");
      if(f1.createNewFile() && f2.createNewFile())
      {
        System.out.println("Files Created: "+f1.getName()+" "+f2.getName());
      }
      else
      {
        System.out.println("Files Already Exists");
      }
      BufferedWriter writer=new BufferedWriter(new FileWriter("input.txt"));
      writer.write("Mango\n");
      writer.write("Apple\n");
      writer.write("Zebra\n");
      writer.write("Grapes\n");
      writer.close();


      BufferedReader reader=new BufferedReader(new FileReader("input.txt"));
      String line="";
      String []words=new String[4];

      int i=0;
      while((line=reader.readLine())!=null)
      {
        words[i]=line;
        i++;
      }
     
      //System.out.println(Arrays.toString(words));
      
     for(int j=0;j<words.length;j++)
     {
      for(int k=j+1;k<words.length;k++)
      {
        if(words[j].compareTo(words[k])>0)
        {
          String temp=words[j];
          words[j]=words[k];
          words[k]=temp; 
        }
      }
     }
     
     reader.close();


     BufferedWriter writer1=new BufferedWriter(new FileWriter("output.txt"));
     {
      for(String word:words)
      {
        writer1.write(word);
        writer1.newLine();
      }
      writer1.close();
     }
    }
    catch(IOException e)
    {
      System.out.println(e.getMessage());
    }
    catch(Exception e)
    {
      System.out.println(e.getMessage());
    }
  }
}