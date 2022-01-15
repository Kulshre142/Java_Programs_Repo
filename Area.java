import java.util.Scanner;
class AreaOverload
{   
    void area(double x, double y)
    {
        System.out.println("Area of Rectangle= "+x*y);
    }
    void area(double x)
    {
        System.out.println("Area of Square="+x*x);
    }
    
    
}
class Area 
{
     public static void main(String args[]) 
	{
	AreaOverload obj = new AreaOverload();
	System.out.print("Input side : ");
     	Scanner in = new Scanner(System.in);
     	float s=in.nextFloat();
	obj.area(s);
	System.out.print("Input length & breadth: ");
	float l=in.nextFloat();
	float b=in.nextFloat();
	obj.area(l,b);
		
        }
}
