class Shape{
	
	void draw(){
	System.out.println("Drawing Shape");
	}
	void erase(){
	System.out.println("Erasing Shape");
	}
}
class Circle extends Shape
{
	
	void draw(){
	System.out.println("Drawing Circle");
	}
	void erase(){
	System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape
{	void draw(){
	System.out.println("Drawing Triangle");
	}
	void erase(){
	System.out.println("Erasing Triangle");
	}
}
class Square extends Shape
{	void draw(){
	System.out.println("Drawing Square");
	}
	void erase(){
	System.out.println("Erasing Shape");
	}
}
public class AllShape{
	public static void main(String args[]){
	Shape a=new Apple("Apple","sweet","Sphere");
	Orange o=new Orange("Orange","sour","Sphere");
	a.eat();
	o.eat();
}}