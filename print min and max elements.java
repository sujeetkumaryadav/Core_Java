import java.util.Scanner;
class ArrDemo{

public static void main(String[] args)
{

int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Array Size: ");
int n=sc.nextInt();
int[] arr= new int[n];

System.out.println("Enter Array elements: ");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
for(int i=0; i<arr.length;i++)
{
if(min>arr[i])
min=arr[i];

if(max<arr[i])
max=arr[i];
}
System.out.println("Maximum value: "+max +"\nMinimum value: " +min);
}
}
