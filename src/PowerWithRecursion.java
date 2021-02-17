import java.util.Scanner;
public class PowerWithRecursion 
{
    int value,power,result=1;
    void power()
    {  
        if(power>0)
        {            
            result=result*value;
            power=power-1;
            this.power();
            
        }
        else
        {
            System.out.println("Result: "+result);
        }
    }
    public static void main(String args[])
    {
        PowerWithRecursion obj = new PowerWithRecursion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        obj.value=sc.nextInt();
        System.out.println("Enter the power");
        obj.power=sc.nextInt();
        obj.power();
    }
}
