import java.util.*;
class Int_Bin{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n[] = new int[7];
System.out.println("Enter the elements in an array=");
for(int i = 0; i < 7 ; i++)
{
n[i]=sc.nextInt();
int r, s=0, p=1;
while(i!=0){
r=n[i]%2;
s = s+(r*p);
p=p*10;
n=n/2;}
System.out.println("binary conversion is = "+s);}}}
