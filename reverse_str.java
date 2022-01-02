import java.util.*;
public class reverse_str
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the string= ");
String input = sc.nextLine();
int n= input.length();
for(int i=n-1;i>=0;i--)
{
System.out.print(input.charAt(i));
}
}
}