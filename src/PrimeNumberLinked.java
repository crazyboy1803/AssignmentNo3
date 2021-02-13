import java.util.Scanner;
class Node2
{
    int data;
    Node2 next;
}
public class PrimeNumberLinked 
{
    Node2 Start;
    PrimeNumberLinked()
    {
        Start=null;
    }
    void insert()
    {
        Node2 newnode = new Node2();
        System.out.println("Enter the Value");
        Scanner sc2 = new Scanner(System.in);
        int value = sc2.nextInt();
        int count=0;
        for(int i=1;i<=value;i++)
        {
            if(value%i==0)
            {
                count++;
            }
        }
        if(count<3)
        {
            newnode.data=value;
            newnode.next=null;
            if(Start==null)
            {
                Start=newnode;
            }
            else
            {
                Node2 current=Start;
                while(current.next!=null)
                {
                    current=current.next;
                }
                current.next=newnode;
            }
            System.out.println("Value Entered");
            
        }
        else
        {
            System.out.println("Value is not prime number...Try again");
        }
    }
    void traverse()
    {
        if(Start==null)
        {
           System.out.println("Stack is full"); 
        }
        else
        {
            Node2 current;
            for (current=Start;current!=null;current=current.next)
            {
                System.out.print(current.data+" ");
            }
        }
    }
    public static void main(String args[])
    {
        PrimeNumberLinked obj=new PrimeNumberLinked();
        
        
        while(true)
        {
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for traverse");
            System.out.println("press 3 for Exit");
        
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            int ch=sc.nextInt();
            switch(ch)
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
