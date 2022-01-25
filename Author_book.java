/*WAP to take following inputs
name;
email;
gender
of an author
and for the book class having following properties
name;
price;
qtyInStock;
*/
import java.util.*;
class Author
{
String name, gender, email;
Author(String nt, String ge, String em)
{name=nt;
gender=ge;
email=em;

}
void show()
{System.out.println("Name of author "+name);
System.out.println("Gender of author "+gender);
System.out.println("Eamil id of author "+email);

}


}
class Book extends Author
{
String name;
double price;
int quantity;
Book(String na ,double pr,int qua,String nt, String ge, String em)
{
super(nt,ge,em);
name=na;
price=pr;
quantity=qua;
}
void show()
{super.show();
System.out.println("Name of book "+name);
System.out.println("Price of book "+price);
System.out.println("Quantity id of book "+quantity);

}

}


class Author_book
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Name of author ");
String nt=sc.next();
System.out.println("Enter Genger of author ");
String ge=sc.next();
System.out.println("Enter Email of author ");
String em=sc.next();
System.out.println("Enter Name of Book ");
String na=sc.next();
System.out.println("Enter Price of Book ");
Double pr=sc.nextDouble();
System.out.println("Enter Quantity of Book ");
int qua=sc.nextInt();


Book c=new Book(na ,pr,qua,nt,ge, em);
c.show();

}
}

▲
