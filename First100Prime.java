class First100Prime{
public static void main(String[] args)
{
int count=1,num=2;
while(count<=100)
{
boolean flag=true;
for(int i=2;i<=num-1;i++)
{
if(num%i==0)
flag=false;
}
if(flag)
{
System.out.print(num+" ");
count++;
}
num++;
}
}
}