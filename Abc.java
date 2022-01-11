import java.util.Scanner;
class A
{
	int z=30;
       
class B 
{
int x =10;
public void show (int y)
{
System.out.println("Hello" + x);
System.out.println("World" + y);
System.out.println("Bye" + z); 
}
} 
class Abc 
{
     public static void main(String args[]) 
	{
	A obj = new A();
	//obj.z;
	A.B obj1 = obj.new B(); 
	obj.show(20);
	}
}
}