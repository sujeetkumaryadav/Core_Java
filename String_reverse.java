import java.util.Scanner;
class Concat{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter String: ");
String str1=sc.nextLine();
//With help of predefined method
StringBuffer sb= new StringBuffer(str1);
String result=sb.reverse().toString();
System.out.println("Combined string is: "+result);

//With the help of char Array
char[] ch=str1.toCharArray();
char[] ch1=new char[str1.length()];
int k=0;
for(int i=str1.length()-1;i>=0;i--)
{
ch1[i]=ch[k];
k++;
}
String res=new String(ch1);
System.out.println("Combined string is___: "+res);

}
}
