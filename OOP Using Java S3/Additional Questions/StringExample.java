class StringExample{
public static void main(String[]args)
{
  String s1=new String("Java");
  String s2=new String("Oak");
  System.out.println(s1==s2);
  //This is example for String objects


  String s3="Java";
  String s4="Java";
  System.out.println(s3==s4);
  //This is example for String literals


  String name="Abhiram";
  System.out.println("Length: "+name.length());
  int age=19;
  System.out.println("I am "+age+" years old");

  System.out.println("Example for String comparison: "+s1.equals(s2));
  System.out.println("Example for String comparison: "+s3.equals(s4));

  String st1="hello";
  String st2="HELLO";
  System.out.println(st1.equals(st2));
  System.out.println(st1.equalsIgnoreCase(s2)); //Case sensitivity is removed


  String sen="java string split method";
  System.out.println("\n\n"+sen.startsWith("ja"));
  System.out.println(sen.endsWith("od"));

  String a="hello";
  String b="mello";
  System.out.println(a.compareTo(b));

}
}