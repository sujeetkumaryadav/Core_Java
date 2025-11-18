import java.util.Scanner;
class Concat{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter String and char ");
String str1=sc.nextLine();
char ch=sc.nextLine().charAt(0);
char[] ch1= new char[str1.length()];
int k=0;
for(int i=0;i<str1.length();i++)
{
if(str1.charAt(i)!=ch)
{
ch1[k]=str1.charAt(i);
k++;
}
}
String res=new String(ch1);
System.out.println("Final String: "+res);
}
}
