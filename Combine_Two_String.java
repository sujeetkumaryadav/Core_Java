import java.util.Scanner;
class Concat{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter First and Second String: ");
String str1=sc.nextLine();
String str2=sc.nextLine();

//converting the string into char array
char[] ch1=str1.toCharArray(); 
char[] ch2=str2.toCharArray();

char[] combined=new char[ch1.length+ch2.length];

//Copy first String
int k=0;
for(int i=0;i<str1.length();i++)
{
combined[k]=ch1[i];
k++;
}

//Copy Second string
for(int i=0;i<str2.length();i++)
{
combined[k]=ch2[i];
k++;
}

//Converting char array back to string
String result=new String(combined);

System.out.println("Combined string is: "+result);

}
}
