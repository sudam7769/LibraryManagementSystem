package com.anudip.Librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

@Id
	private int category_id;
    private String name;
    private String language;
    private String agegroup;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
	private List<Book> books=new ArrayList<Book>();

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getAgegroup() {
		return agegroup;
	}

	public void setAgegroup(String agegroup) {
		this.agegroup = agegroup;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Category(int category_id, String name, String language, String agegroup, List<Book> books) {
		super();
		this.category_id = category_id;
		this.name = name;
		this.language = language;
		this.agegroup = agegroup;
		this.books = books;
	}

	public Category() {
		
		// TODO Auto-generated constructor stub
	}
    
	
	

	

}
