import java.util.Scanner;
class SumOfDigit{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Number: ");
long num=sc.nextLong();
long sum=0;
while(num>0)
{
sum=sum+num%10;
num=num/10;
}
System.out.println("Sum of Digit is: "+sum);
}
}