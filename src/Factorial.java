import java.util.Scanner;
public class Factorial 
{
    int result=1,value;
    void factorial()
    {
        if(value>1)
        {
           result=result*value;
           value=value-1;
           this.factorial();
        }        
    }
    public static void main(String args[])
    {
        Factorial obj = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        obj.value = sc.nextInt();
        obj.factorial();
        System.out.println("Result: "+obj.result);
    }
}
