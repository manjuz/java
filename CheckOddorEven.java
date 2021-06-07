import java.util.*;
class CheckOddorEven
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter two integers");
int num1=sc.nextInt();
int num2=sc.nextInt();
if(num1%2==0)
{
System.out.println(num1+"is an even number");
}
else
{
System.out.println(num1+"is an odd number");
}
if(num2%2==0)
{
System.out.println(num2+"is an even number");
}
else
{
System.out.println(num2+"is an odd number");
}
}
}
