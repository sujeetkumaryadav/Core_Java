import java.util.Scanner;
class MarriageEligibility{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Person Age and Salary: ");
int age=sc.nextInt();
double salary=sc.nextDouble();

if(age>=30 && salary>=100000)
System.out.println("Eligible for marriage");
else
System.out.println("Not Eligible for marriage");

}
}