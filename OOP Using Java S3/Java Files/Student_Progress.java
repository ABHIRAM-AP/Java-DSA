import java.util.*;


class Student
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number of students:");
        int num = s.nextInt();
        s.nextLine();
        
        
        Progress [] p =new Progress[num];
        int []a = new int[8];
        
        for(int i=0;i<num;i++)
        {
            
         p[i] = new Progress();
         
         
         System.out.println("Enter the name of student:");
         String name = s.nextLine();
         
         System.out.println("Enter the department:");
         String department = s.nextLine();
         
        
         
         
         for(int j=0;j<8;j++)
         {
            System.out.print("Enter the mark of S"+(j+1) + ": ");
             a[j]= s.nextInt();
         }
         s.nextLine();
         
         p[i].setDetails(name,department,a);
        }
        
        
        for(int k=0;k<num;k++)
        {
            System.out.println("\nDetails of Student "+(k+1));
            p[k].display();
        }
    }
}



class Progress
{
    String name,department;
    int []marks = new int[8];
    double total =0;
    
    public void setDetails(String a, String b,int[]m)
    {
        name=a;
        department =b;
        
            for(int i=0;i<marks.length;i++)
            {
                marks[i]= m[i];
               
                total = (total+marks[i]);
            }
        
          
    }
    
    public void display()
    {
   
      
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
          for(int m=0;m<8;m++)
        {
          System.out.print("\tS"+(m+1)+": " +marks[m]+" \t");
          if(marks[m]>=90)
          {
            System.out.print("A");
          }
          else if(marks[m]>=80 && marks[m]<90)
          {
            System.out.print("B");
          }
          else if(marks[m]>=70 && marks[m]<80)
          {
            System.out.print("C");
          }
           // System.out.print("S"+(m+1)+": " +marks[m]+" \t");
        }
        System.out.println("\nTotal= "+total);
    }
    
}