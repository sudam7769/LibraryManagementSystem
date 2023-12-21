package com.anudip.Librarymanagementsystem;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Library")
public class Book {
	@Id
	
	private int bookId;
	private String bookname;
	private String author;
	private String description;
	private int quantityAvailable; 
	private int price;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "category_id")
	 private Category category;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantityAvailable() {
		return quantityAvailable;
	}
	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book(int bookId, String bookname, String author, String description, int quantityAvailable, int price) {
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		this.author = author;
		this.description = description;
		this.quantityAvailable = quantityAvailable;
		this.price = price;
	}
	public Book() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
