/*If ‘n‘ is the positive number and ‘a‘ is an array of integers of length n-1 containing elements from 1 to n.
Then find the missing number in ‘a’ in the range from 1 to n. Occurrence of each element is only once.
If n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8. For example {1, 4, 5, 3, 7, 8, 6}.
One number will be missing in ‘a’ (2 in this case). You have to find out that missing number.
*/
import java.util.*;
class Array_Missing_Number
{

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number want to insert the element in the array ");
int n=sc.nextInt();
int[] a=new int[n-1];
for(int i=0;i<a.length;)
{System.out.println("Enter the number "+(i+1)+" Element");
int p=sc.nextInt();
if(p<=n || p!=0)
{int flag=0;
for(int j=0;j<i;j++)
{
if(p==a[j])
{
flag=1;
break;
}
}if(flag==0)
{
a[i]=p;
i++;
}
else
System.out.println("Please enter the another value ");
}
else
System.out.println("Please enter the number in the range 1 to "+n);
}
for(int i=1;i<=n;i++)
{int flag=1;
for(int j=0;j<a.length;j++)
{if(a[j]==i)
{
flag=0;
break;
}
}
if(flag==1)
{
System.out.println("The mising number in array is "+i);
break;
}
}

}
}