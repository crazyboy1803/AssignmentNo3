import java.util.Scanner;
public class FabnocciSeries
{
    int value,a=0,b=1,result=0;
    void FabconniSeries()
    {
        result=a+b;
        while(result<=value)
        {
            System.out.print(result+" ");
            a=b;
            b=result;
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
