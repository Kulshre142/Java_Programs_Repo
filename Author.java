public class Author {
  
protected String name;
protected String email;
protected char gender;
  
public Author(String name, String email, char gender)
{
this.name = name;
this.email = email;
this.gender = gender;
}
  
public String getName()
{
return name;
}
  
public String getEmail()
{
return email;
}
  
public void setEmail(String email)
{
this.email = email;
}
  
public char getGener()
{
return gender;
}
  
public String toString()
{
return ( name + "(" + gender + ")@" + email);
}

public static void main(String[] args) {

}
  
}
public class Book extends Author{
  
private String name;
//private final String email;
// private char gender;
private Author author;// = new Author(name,super.email,super.gender);
private double price;
private int qtyInStock = 0;
  
public Book(String name, Author author,Double price)
{
this.author = new author();
this.name = name;
this.price = price;
  
}
  
public Book(String name, Author author, double price, int qtyInStock)
{
  
this.name = name;
this.author = author();
this.price = price;
this.qtyInStock = qtyInStock;
}
  
public String getName()
{
return name;
}
  
public Author getAuthor()
{
return author;
}
  
public double getPrice()
{
return price;
}
  
public void setPrice(double price)
{
this.price = price;
}
  
public int getQtyInStock()
{
return qtyInStock;
}
  
public void setQtyInStock(int qtyInStock)
{
this.qtyInStock = qtyInStock;
}
  
public String toString()
{
return (name + " by " + author + "(" + super.gender + ")at" + super.email);
}
}