import java.util.Scanner;
public class FabnocciSeriesUsingRecursion 
{
    int value,a=0,b=1,result=0;
    void FabconniSeries()
    {
        result=a+b;
        if(result<=value)
        {
            System.out.print(result+" ");
            a=b;
            b=result;
            
            this.FabconniSeries();
        }
    }
    public static void main(String args[])
    {
        FabnocciSeriesUsingRecursion obj = new FabnocciSeriesUsingRecursion();
        System.out.println("Please Enter the nth term of fabnocci series");
        Scanner sc = new Scanner(System.in);
        obj.value=sc.nextInt();
        System.out.print(obj.a+" ");
        System.out.print(obj.b+" ");
        obj.FabconniSeries();
    }
}
