import java.util.Scanner;
class LadderIf{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
if(a>0)
System.out.println("Number is +ve");

else if(a<0)
System.out.println("negative");

else if(a<0)
System.out.println("Number is -ve");
else
System.out.println("Number is 0");
}
}