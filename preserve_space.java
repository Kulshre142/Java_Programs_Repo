import java.util.*;
class preserve_space
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the string= ");
String str= sc.nextLine(); {
char[] chars = str.toCharArray();
int len=chars.length-1;
int i = 0;
while(i < len) {
if(chars[i] == ' ')
i++;
if(chars[len] == ' ')
len--;

char temp = chars[i];
chars[i] = chars[len];
chars[len] = temp;

i++;
len--;
}


System.out.print(chars);
}
}
}
