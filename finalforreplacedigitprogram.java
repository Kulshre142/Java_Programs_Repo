/*Write a java program to find the largest number ‘L’ less than a given number ‘N’ which should not contain a given digit ‘D’. For example, If 145 is the given number and 4 is the given digit, then you should find the largest number less than 145 such that it should not contain 4 in it. In this case, 139 will be the answer.*/
import java.util.Scanner;
class finalforreplacedigitprogram{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
int position=0;

System.out.print("Enter the number:");
int n=obj.nextInt(); //367857

if(n>0){
System.out.print("Enter the digit :");
int d=obj.nextInt(); //6

int a[]=new int[20]; int i=0;

while(n>0){ a[i]=n%10; i++; n=n/10; }
int j=0;
for(j=i-1; j>=0; j--){ if(a[j]==d){ position=j; break; } }

if(d != 0 && d != 9 && position ==j){
a[position]=a[position]-1;
for(int h=position-1; h>=0; h--){
a[h]=9;
}
}

if(d==0 && position ==j){
a[position+1]=a[position+1]-1; //2300 //0032 //2299
for(int h=position; h>=0; h--){
a[h]=9;
}
}

if(d==9 && position ==j){
a[position]=a[position]-1; //499923 //48888
for(int h=position; h>=0; h--){
a[h]=8;
}
}

System.out.print("output no :");
for(int h=i-1; h>=0; h--)
System.out.print(a[h]);
} else {
System.out.println("Invalid Input please Enter valid number");
}

}
}