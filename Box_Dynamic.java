/*Creat a class Box that uses a parameterized constructor to initialize the
dimensions of a box. The class should have a method that can return the volume of
the box. Create an object of the Box class and test the functionalities.*/
import java.util.Scanner;
class Box_Dynamic{
int length;
int breath;
int height;
Box(int l,int b,int h){
length=l;
breath=b;
height=h;
}
int volume(){
return length*breath*height;
}
}
class boxclass{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.println("Enter length:");
int l=ob.nextInt();
System.out.println("Enter breath:");
int b=ob.nextInt();
System.out.println("Enter height:");
int h=ob.nextInt();
Box obj=new Box(l,b,h);
System.out.println("area is:"+obj.volume());
}
}