import java.util.Scanner;
class ArmstrongNum{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter Any Number: ");
long num=sc.nextLong();
long num2=num;
long num3=num;
int cnt=0;
double sum=0;
long rem;
while(num>0)
{
cnt++;
num=num/10;
}
while(num2>0)
{
rem=num2%10;
sum=sum+Math.pow(rem,cnt);
num2=num2/10;
}
System.out.println(sum);
if(sum==num3)
System.out.println("Armstrong");
else
System.out.println("Not Armstrong");
}
}

