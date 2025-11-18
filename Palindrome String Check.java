import java.util.Scanner;
class Concat{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter String: ");
String str1=sc.nextLine();


/*

//Using predefined method
StringBuffer sb= new StringBuffer(str1);
String result=sb.reverse().toString();

if(str1.equals(result))
System.out.println("Palindrome");
else
System.out.println("Not-Palindrome");

*/

// Using own logic

int left=0, right=str1.length()-1;
boolean flag=true;
while(left<right)
{
if(str1.charAt(left)!=str1.charAt(right))
{
flag=false;
break;
}
left++;
right--;
}
if(flag)
System.out.println("Palindrome");
else
System.out.println("Not Plaindrome");

}
}
