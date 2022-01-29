public class Fruit{
String name,taste,size;
	Fruit(String n,String t,String s){
		name=n;
		taste=t;
		size=s;
	}
	void eat(){
	System.out.println(name+""+taste);
	}
}
class Apple extends Fruit
{
	Apple(String n,String t,String s){
	super(n,t,s);
	}
	void eat(){
	System.out.println(name+""+taste);
	}
}
class Orange extends Fruit
{
	Orange(String n,String t,String s){
	super(n,t,s);
	}
	void eat(){
	System.out.println(name+""+taste);
	}
}
public class AllFruit{
	public static void main(String args[]){
	Apple a=new Apple("Apple","sweet","Sphere");
	Orange o=new Orange("Orange","sour","Sphere");
	a.eat();
	o.eat();
}}}