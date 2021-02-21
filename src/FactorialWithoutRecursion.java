import java.util.Scanner;
public class FactorialWithoutRecursion 
{
    int result=1,value;
    void factorial()
    {
        while(value>1)
        {
           result=result*value;
           value=value-1;
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
