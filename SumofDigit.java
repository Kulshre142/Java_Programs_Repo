import java.util.Scanner;
class SumofDigit
{
    public static void main(String args[])
    {
       int num,rem,sum=0;

       Scanner input = new Scanner(System.in);
       System.out.print("Enter the number=");
       num=input.nextInt();
       while (num!=0)
    {
            rem = num % 10;
            sum = sum + rem;
            num = num/10;
    }

    System.out.print("Sum= "+sum);
  }
}