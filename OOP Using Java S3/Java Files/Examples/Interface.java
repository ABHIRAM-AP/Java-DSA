package Examples;



interface A
{
      void display();
    
    default void sum()
    {
        System.out.println("Display Sum in A");
    }
}
class B implements A
{
    public void display()
    {
        System.out.println("Implemented from interface A");
    }
       public void sum()
    {
        System.out.println("Display Sum in B");
    }
}
class Interface
{
    public static void main(String[]args)
    {
        B ob=new B();
        ob.display();
        ob.sum();
    }
}