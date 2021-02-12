import java.util.Scanner;
public class EvenNumbers 
{
    int top=-1;
    int ar[];
    EvenNumbers()
    {
        ar=new int[10];
    }
    void push()
    {
        if(top==4)
        {
            System.out.println("Stack is full");
        }
        else
        {
            System.out.println("Enter the value");
            Scanner sc2 = new Scanner(System.in);
            int value = sc2.nextInt();
            if(value%2==0)
            {
                top = top +1;
                ar[top]=value;   
            }
            else
            {
                System.out.println("Try again");
            }            
        }
    }
    void traverse()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            for(int i=0;i<=top;i++)
            {
                System.out.print(" "+ar[i]);
            }
        }
    }
    public static void main(String args[])
    {
        EvenNumbers obj = new EvenNumbers();
        while(true)
        {             
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for traverse");
            System.out.println("press 3 for exit");
            
            System.out.println("Enter ur Choice");
            Scanner sc = new Scanner(System.in);
            int ch= sc.nextInt();            
            switch(ch)
            {                
                case 1:
                    obj.push();
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
