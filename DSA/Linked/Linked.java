import java.util.*;

class Node{
    int data;
    Node next;
    Node prv;
    
   
    public Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prv=null;
    }
}
class DLL{
    public Node insertFront(Node head,int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return newNode;
        }
        else{
        newNode.next=head;
        head.prv=newNode;
        head=newNode;
        }
        return head;
    }
        public Node delete(Node head, int data) {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        Node temp = head;

       
        if (temp.data == data) {
            head = temp.next; 
            if (head != null) {
                head.prv = null; 
            }
            System.out.println("Deleted: " + data);
            return head;
        }

    
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        // Node not found
        if (temp == null) {
            System.out.println("Node with data " + data + " not found");
            return head;
        }
        if (temp.next != null) {
            temp.next.prv = temp.prv;
        }
        if (temp.prv != null) {
            temp.prv.next = temp.next;
        }

        System.out.println("Deleted: " + data);
        return head;
    }

    
   public void display(Node head) {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}



public class Main{
    public static void main(String[]args)
    {
        DLL ob=new DLL();
        Node head=null;
        Scanner s=new Scanner(System.in);
        int option=0;
        while(true)
        {
            System.out.println("1-Insert\n2-Delete\n3-Display\n");
            option=s.nextInt();
            s.nextLine();
            switch(option)
            {
                case 1:
                    System.out.println("Enter data");
                    int data=s.nextInt();s.nextLine();
                    head=ob.insertFront(head,data);
                    break;
                    
                case 2:
                    System.out.println("Enter item to be deleted:");
                    int del=s.nextInt();s.nextLine();
                    head=ob.delete(head,del);
                    break;
                case 3:
                    ob.display(head);
                    break;
            }
        }
    }
}