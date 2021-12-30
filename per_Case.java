import java.util.*;
class per_Case
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the string= ");
String str= sc.nextLine();
 {
        int totalChar = str.length();
        int upperCase = 0,lowerCase = 0,digits = 0,others = 0,space=0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase++;
            }
            else if (Character.isLowerCase(ch)) {
                lowerCase++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else if (Character.isSpace(ch)) {
		space++;
            }
            else
                others++;

        }




        System.out.println("Uppercase letters are " + (upperCase * 100) / totalChar + "% ");
        System.out.println("Lowercase letters are " + (lowerCase * 100) / totalChar + "%");
        System.out.println("Digits Are " + (digits * 100) / totalChar + "%");
        System.out.println("Other Characters Are " + (others * 100) / totalChar + "%");

    }
    }

}