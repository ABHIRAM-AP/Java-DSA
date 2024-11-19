package College;

import java.util.*;




public class DLL {


    class Node
    {
      int data;
      Node next,prev;

      Node(int data)
      {
        this.data=data;
      prev=next=null;
      }
    }

    private Node head;

    public DLL()
    {
      head=null;
    }


    public void addNode(int data)
    {
      Node node=new Node(data);
      if(head==null)
      {
        head=node;
      }
      else{
        Node current=head;
        while(current.next!=null)
        {
          current=current.next;
        }
        current.next=node;
        node.prev=current;
      }
    }


    public  void deleteNode(int data)
    {
        if(head==null)
        {
          System.out.println("Empty List\n");
          return;
        }
        Node current=head;
        if(head.data==data)
          {
            if(head.next==null)
            {
              head=null;
            }
            else{
              head=head.next;
              head.prev=null;
            }
            System.out.println("Deleted Item: "+data);
            return;
          }

          Node previous=null;

          while(current!=null && current.data!=data)
            {
              previous=current;
              current=current.next;
            }


            if(current==null)
            {
              System.out.println("No data");
              return;
            }

            if(current.next!=null)
            {
              current.next.prev=previous;
            }
            if(previous!=null)
            {
              previous.next=current.next;
            }

            System.out.println("Deleted Item: "+data);
      }
    




    public void display()
    {
      Node current=head;
      if(current==null)
      {
        System.out.println("Empty List");
        return;
      }
      System.out.println("List:");
      while(current!=null)
      {
        System.out.print(current.data+"->");
        current=current.next;
      }
      System.out.println("NULL\n");
    }
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      DLL dll=new DLL();
      int op=0;
      int data=0;

    
      while(op!=4)
      {
        System.out.println("1-Insert\t2-Delete\t3-Display\t4-Exit");
        op=s.nextInt();

        switch (op) {
            case 1:
            System.out.println("Enter data:");
           data=s.nextInt();
           dll.addNode(data);
           break;

           case 2:
          System.out.println("Enter data to be deleted:");
          data=s.nextInt();
          dll.deleteNode(data);
           break;


           case 3:
           dll.display();
           break;

           case 4:
           System.exit(0);
           break;
        }
      }
     s.close(); 
    }
} 
