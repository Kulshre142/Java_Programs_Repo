import java.util.*;
class interse_array{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter elements in array1=");
int a[] =new int[5];
for(int i=0;i<5;i++)
{
a[i] = sc.nextInt();
}
System.out.println("Enter elements in array2=");
int b[]=new int[5];
for(int i=0;i<5;i++)
{
b[i] = sc.nextInt();
}
for(int i=0;i<a.length;i++)
{
for(int j=0;j<b.length;j++)
{
if(a[i]==b[j])
{
System.out.println("Common elements"+a[i]);
}
}
}
}
}