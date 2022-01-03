import java.util.*;
class binornot
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter given element=");
int num=sc.nextInt();
int r,count=0;
while(num>0)
{
r=num % 10;
if(r!= 0 && r !=1)
{
count++;
break;
}
num=num/10;
}
if(count==1)
{
System.out.println("number is not binary");
}
if(count==0)
{
System.out.println("number is binary");
}
}
}

