package Examples;

import java.io.*;
class Files2
{
public static void main(String arg[]) throws IOException
{
FileOutputStream f;
String s,s1;
try
{
f= new FileOutputStream("Sample.txt");
s="Welcome to OOP\n";
s1="Hi ABhiram";
byte []b1=s.getBytes();
byte []b2=s1.getBytes();
f.write(b1);
f.write(b2);

// f.write(66); 
}
catch(FileNotFoundException e)
{
System.out.println("File not found");
return;
}
f.close();
}
}