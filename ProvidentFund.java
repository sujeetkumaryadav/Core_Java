import java.util.Scanner;
class ProvidentFund{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter basic salary: ");
int a =sc.nextInt();
System.out.println("Provident fund of basic salary "+a +" is:"+(a*12/100));

}
}