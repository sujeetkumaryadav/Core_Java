import java.util.*;
class ShoesBrand{

public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter Shoes Brand Name: ");
switch(sc.next())
{
case "Nike":
System.out.println("Just do it");
break;
case "Adidas":
System.out.println("Impossible is nothing");
break;
case "Puma":
System.out.println("Forever Faster");
break;
case "Rebook":
System.out.println("I Am What I Am");
break;
default: 
System.out.println("Invalid Shoes Name ");
}

}

}