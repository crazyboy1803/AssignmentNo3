import java.util.*;
class Nodee4
{
    int rollno;
    Nodee4 next;
}
public class AgeSortedData
{
   Nodee3 START;
   int ar[]=new int[10];
    AgeSortedData()
    {
        START = null;
    }
    void addnode()
    {
        for(int i=0;i<ar.length;i++)
        {
            int rn = ar[i];
        
            Nodee3 newnode = new Nodee3();
            newnode.rollno = rn;
            newnode.next = null;
        
            if(START == null)
            {
                START = newnode;
            }
            else
            {
                Nodee3 current = START;
                while(current.next != null)
                {
                    current = current.next;
                }
                current.next = newnode;
            }            
        }    
        System.out.println("Data Inserted.....");
    }
    void traversenode()
    {
        if(START == null)
        {
            System.out.println("List Empty");
        }
        else
        {
            Nodee3 current;
            for(current = START;current != null ;current = current.next)
            {
                System.out.print(" " +current.rollno);
            }
        }
    }
    public static void main(String arg[])
    {        
        AgeSortedData obj = new AgeSortedData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age Data");
        for(int i=0;i<obj.ar.length;i++)
        {
            obj.ar[i]=sc.nextInt();
        }
        Arrays.sort(obj.ar);
        while(true)
        {
            System.out.println("\npress 1 for pass array into stack");
            System.out.println("press 2 for traverse");
            System.out.println("press 3 for Exit");
            
            System.out.println("Enter ur choice");           
            int ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    obj.addnode();
                    break;
                case 2:
                    obj.traversenode();
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
