import java.util.Scanner;

class One
{
    public static void main(String arr[])
    {
        Scanner obj=new Scanner(System.in);

        int pin;
        System.out .println("enter your pin");
        pin=obj.nextInt();

        if(pin==1234)
        {
            System.out .println("cw");
        }

        else
        {
             System.out .println("invailid password again");
             pin=obj.nextInt();
             if (pin==1234)
             {
                System.out .println("cw");
             }
             else{

                System.out .println("invailid password try again");
                pin=obj.nextInt();
                if(pin==1234)
                {
                    System.out .println("cw");
                }

                else
                {
                    System.out .println("card blocked");
                }
             }
        }
    }
}