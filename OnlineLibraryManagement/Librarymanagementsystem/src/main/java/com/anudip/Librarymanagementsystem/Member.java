package com.anudip.Librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Member {
	@Id
	private int mid;
	private String mname;
	private String mcontactno;
	private String memail;
	private String maddress;
	
	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
	private List<LibraryTransaction> libraryTransaction=new ArrayList<LibraryTransaction>();
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMcontactno() {
		return mcontactno;
	}
	public void setMcontactno(String mcontactno) {
		this.mcontactno = mcontactno;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getMaddress() {
		return maddress;
	}
	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}
	public List<LibraryTransaction> getLibraryTransaction() {
		return libraryTransaction;
	}
	public void setLibraryTransaction(List<LibraryTransaction> libraryTransaction) {
		this.libraryTransaction = libraryTransaction;
	}
	public Member(int mid, String mname, String mcontactno, String memail, String maddress,
			List<LibraryTransaction> libraryTransaction) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mcontactno = mcontactno;
		this.memail = memail;
		this.maddress = maddress;
		this.libraryTransaction = libraryTransaction;
	}
	public Member() {
		
		// TODO Auto-generated constructor stub
	}

	
	

}
