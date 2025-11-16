import java.util.Scanner;
class ArrDemo{

public static void main(String[] args)
{

int min=Integer.MAX_VALUE;
int max=Integer.MIN_VALUE;
int min2=Integer.MAX_VALUE;
int max2=Integer.MIN_VALUE;

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
for(int j=0;j<arr.length;j++)
{
if(arr[j]!=max && max2<arr[j] )
max2=arr[j];

if(arr[j]!=min && min2>arr[j])
min2=arr[j];

}

System.out.println("Maximum value: "+max +"\nMinimum value: " +min);
if(max2==Integer.MIN_VALUE)
System.out.println("2nd Maximum value is not available");
else
System.out.println("2n Maximum value: "+max2);
if(min2==Integer.MAX_VALUE)
System.out.println("2nd Minimum value is not available");
else
System.out.println("2n Minimum value: "+min2);
}
}
