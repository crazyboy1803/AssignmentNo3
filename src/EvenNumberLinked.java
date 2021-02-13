import java.util.Scanner;
class Node
{
    int data;
    Node next;
}
public class EvenNumberLinked 
{
    Node Start;
    EvenNumberLinked()
    {
        Start=null;
    }
    void insert()
    {
        System.out.println("Enter the value");
        Scanner sc2 = new Scanner(System.in);
        int ch = sc2.nextInt();        
        if(ch%2==0)
        {
             Node newnode= new Node();
            newnode.data=ch;
            newnode.next=null;
        
            if(Start==null)
            {
               Start=newnode;
            }
            else
            {
                Node current = Start;
                while(current.next!=null)
                {
                    current=current.next;
                }
                current.next=newnode;
            }
            System.out.println("Value Enetered");  
            }
        else
        {
            System.out.println("Value is not even.....Try Again");
        }
        
    }
    void traverse()
    {
        if(Start==null)
        {
            System.out.println("LinkedList is Empty");
        }
        else
        {
            Node current;
            for(current=Start;current.next!=null;current=current.next)
            {
                System.out.print(" "+current.data);
            }
        }
    }
    public static void main(String args[])
    {
        EvenNumberLinked obj = new EvenNumberLinked();        
        while(true)
        {
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for traverse");
            System.out.println("press 3 for exit");
            
            System.out.println("Enter ur choice");
            Scanner sc=new Scanner(System.in);
            int value = sc.nextInt();
            
            switch(value)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.traverse();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }            
        }
    }
}
