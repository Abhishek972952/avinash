import java.util.Scanner;

class One
{
    public static void main(String arr[])
    {
        

    //     int pin;
    //     System.out .println("enter your pin");
    //     pin=obj.nextInt();

    //     if(pin==1234)
    //     {
    //         System.out .println("cw");
    //     }

    //     else
    //     {
    //          System.out .println("invailid password again");
    //          pin=obj.nextInt();
    //          if (pin==1234)
    //          {
    //             System.out .println("cw");
    //          }
    //          else{

    //             System.out .println("invailid password try again");
    //             pin=obj.nextInt();
    //             if(pin==1234)
    //             {
    //                 System.out .println("cw");
    //             }

    //             else
    //             {
    //                 System.out .println("card blocked");
    //             }
    //          }
    //     }
    //  }
    

    // System.out.println("enter a number");
    // int number;

    // if(number<0)
    // {
    //     System.out.println(number*-1);
    // }

    // else{
    //     System.out.println(number);
    // }
   
    
    // }




// int cp;
// int sp;

// cp=obj.nextInt();
// sp=obj.nextInt();

// if(cp<sp)
// {
// String option;
// System.out.println("chose option yes or no");
// option=obj.next();
// if(option=="yes")
// {
// System.out.println("profit= "+""+(sp-cp)+"your discount is 100");
// }

// else
// {
// System.out.println("profit= "+""+(sp-cp));
// }
// }

// else if(cp>sp)
//     {
//     String option;
//     System.out.println("chose option mrp yes or no");
//     option=obj.next();
// if(option.equals("yes"))
// {
// System.out.println("loss= "+""+(cp-sp)+"your discount ids 100");
// }

// else
// {
// System.out.println("loss= "+""+(cp-sp)); 
// }    
        
// }

Scanner obj=new Scanner(System.in);

// System.out .println("enter your choice 1.f-c 2.c-f");
// int option=obj.nextInt();

// if(option==1)
// {
//     int temp;
//     System.out.println("enter a tempreture");
//     temp=obj.nextInt();
//     int ans=((temp-32)*5)/9;
//     System.out.println(ans+" "+"temp in celcius");
// }

// else if(option==2)
// {
//     int temp;
//     System.out.println("enter a tempreture");
//     temp=obj.nextInt();
//     int ans=(temp*9)/5+32;
//     System.out.println(ans+" "+"temp in farenhit");
// }

// else{
//     System.out.println("invailid ");
// }

// check the number of days.

// int mn;
// System.out.println("enter a month 1-12");
// mn=obj.nextInt();

// if(mn==1 || mn==3 || mn==5 || mn==7 || mn==8 || mn==10 || mn==12)
// {
//     System.out.println("31 days");
// }

// else if(mn==4 || mn==6 || mn==9 || mn==11)
// {
//     System.out.println("30 dasy");
// }

// else if(mn==2)
// {
//     System.out .println("28/29 days");
// }

// else{
//     System.out.println("invailid");
// }

char ab;
System.out.println("enter a charctar");
ab=obj.next().charAt(0);

if(ab>='A' && ab<='Z')
{
    ab=(char)(ab+32);
    System.out.println(ab);
}

else if(ab>='a' && ab<='z')
{
    ab=(char)(ab-32);
    System.out.println(ab);
}

else 
{
    System.out.println("Spaical symbol");
}




}

}