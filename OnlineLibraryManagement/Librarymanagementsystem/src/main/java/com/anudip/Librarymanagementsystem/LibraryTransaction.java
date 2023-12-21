package com.anudip.Librarymanagementsystem;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LibraryTransaction {
	@Id
	private int bookid;
	private int mid;
	private int tid;
	private String borrowDate;
	private String returnDate;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="member_id")
	private Member member;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="book_id")
    private Book book;
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public LibraryTransaction(int bookid, int mid, int tid, String borrowDate, String returnDate) {
		super();
		this.bookid = bookid;
		this.mid = mid;
		this.tid = tid;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
	}
	public LibraryTransaction() {
		
		// TODO Auto-generated constructor stub
	}
    
	
}
