import java.util.*;
class subpair
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number of element you want to insrrt in an array=");
int n=sc.nextInt();
int a[] = new int[n];

System.out.println("enter elements=");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter given element=");
int num=sc.nextInt();
for(int i=0;i<n;i++)
{
int sum=0;
for(int j=i;j<n;j++)
{
sum=sum+a[j];
if(sum==num)
{
System.out.println("Sub Pair is=");
for(int m=i;m<=j;m++)
{
System.out.println(a[m]+"");
}
System.out.println();
}
}

}

}
}

