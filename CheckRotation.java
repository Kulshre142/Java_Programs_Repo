import java.util.*;
public class CheckRotation {
Boolean isRotation(String s1,String s2)
{
int i=0;
if(s1.length()==s2.length())
{
for(i=0;i<s1.length();i++)
{
if(s1.charAt(i)==s2.charAt(0))
{
String temp1=s1.substring(i);
String temp2=s1.substring(0,i);


String temp3=temp1+temp2;

if(s2.equals(temp3))
{
return true;

}

}

}

if(i==s1.length())
{
return false;

}
}

return false;

}

public static void main(String args[])
{ CheckRotation obj =new CheckRotation();
Scanner sc = new Scanner(System.in);

System.out.println("enter first string");
String s1=sc.nextLine();
String s2=sc.nextLine();

if(obj.isRotation(s1,s2))
{
System.out.println("First String is a rotation of Second String");

}
else
{
System.out.println("First string is not a rotation of Second String");
}







}
}

