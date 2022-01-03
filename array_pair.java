import java.util.*;
class array_pair{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number of elements in array=");
int n =sc.nextInt();
System.out.println("Enter elements in array=");
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i] = sc.nextInt();
}
System.out.println("Enter Given Number=");
int num = sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if((num==a[i]+a[j]))
{
System.out.println(+a[i] + " , " + a[j]);
System.out.println();
}
}
}
}
}