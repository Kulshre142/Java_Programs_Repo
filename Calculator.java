import java.util.Scanner;
import java.lang.*;
class Calculator
{
double Add(double num1, double num2)
{
return(num1+num2);
}
double Sub(double num1, double num2)
{
return(num1-num2);
}
double Mul(double num1, double num2)
{
return(num1*num2);
}
double Div(double num1, double num2)
{
return(num1/num2);
}
double Power(double num1, double num2)
{
double p=Math.pow(num1,num2);
return(p);
}
double Sqroot(double num1)
{
double s=Math.sqrt(num1);
return(s);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Calculator c1=new Calculator();
double a1,a2,a3;
int op=0;
while(op!=7)
{
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println("5.Power");
System.out.println("6.Square Root");
System.out.println("7.Exit");
System.out.println("Enter your Choice=");
op=sc.nextInt();}
switch(op){
case 1:
{  System.out.println("Enter 1st number=");
a1=sc.nextInt();
System.out.println("Enter 2nd number=");
a2=sc.nextInt();
a3=c1.Add(a1,a2);
System.out.println(a3);
}
break;
case 2:
{  System.out.println("Enter 1st number=");
a1=sc.nextInt();
System.out.println("Enter 2nd number=");
a2=sc.nextInt();
a3=c1.Sub(a1,a2);
System.out.println(a3);
}
break;
case 3:
{  System.out.println("Enter 1st number=");
a1=sc.nextInt();
System.out.println("Enter 2nd number=");
a2=sc.nextInt();
a3=c1.Mul(a1,a2);
System.out.println(a3);
}
break;
case 4:
{  System.out.println("Enter 1st number=");
a1=sc.nextInt();
System.out.println("Enter 2nd number=");
a2=sc.nextInt();
a3=c1.Div(a1,a2);
System.out.println(a3);
}
break;
case 5:
{  System.out.println("Enter 1st number=");
a1=sc.nextInt();
System.out.println("Enter 2nd number=");
a2=sc.nextInt();
a3=c1.Power(a1,a2);
System.out.println(a3);
}
break;
case 6:
{  System.out.println("Enter number=");
a1=sc.nextInt();
a3=c1.Sqroot(a1);
System.out.println(a3);
}
break;
case 7:
System.out.println("EXIT");
break;
default:
System.out.println("INVALID");
}
}}
