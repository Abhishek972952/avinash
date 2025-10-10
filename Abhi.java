import java.util.Scanner;

 class One
{
    public static void main(String arr[])
   {
int option;
Scanner obj=new Scanner(System.in);
option=obj.nextInt();


String result = switch(option)
{
    case 1-> "case1";
    case 2-> "case2";
    case 3-> "case3";
    default-> "invailid";
};
System.out.println(result);


}
}