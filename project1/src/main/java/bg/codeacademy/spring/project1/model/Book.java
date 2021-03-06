package bg.codeacademy.spring.project1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book
{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String isbnCode;
  private String  author;
  private String  title;
  private int     yearOfIssue;
  private double  price;
  private int     quantity;


  public String getIsbnCode()
  {
    return isbnCode;
  }

  public void setIsbnCode(String isbnCode)
  {
    this.isbnCode = isbnCode;
  }

  public String getAuthor()
  {
    return author;
  }

  public void setAuthor(String author)
  {
    this.author = author;
  }

  public String getTitle()
  {
    return title;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public int getYearOfIssue()
  {
    return yearOfIssue;
  }

  public void setYearOfIssue(int yearOfIssue)
  {
    this.yearOfIssue = yearOfIssue;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public int getQuantity()
  {
    return quantity;
  }

  public void setQuantity(int quantity)
  {
    this.quantity = quantity;
  }


}
