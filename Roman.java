import java.util.*;
class Roman
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int[] decimal = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
String[] letters = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
System.out.println("enter number =");
int num=sc.nextInt(); 
String roman = "";
 while (num > 0) {
        int maxFound = 0;
        for (int i=0; i < decimal.length; i++) {
            if (num >= decimal[i]) {
                maxFound = i;
            }
        }
        roman += letters[maxFound];
        num -= decimal[maxFound];
    }

    System.out.println(roman);       
  }
}