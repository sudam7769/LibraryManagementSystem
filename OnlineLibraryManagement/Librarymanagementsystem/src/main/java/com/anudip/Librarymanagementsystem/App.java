package com.anudip.Librarymanagementsystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Configuration conf=new Configuration().configure().addAnnotatedClass(Book.class).addAnnotatedClass(Category.class).addAnnotatedClass(Member.class).addAnnotatedClass(LibraryTransaction.class);
        SessionFactory ss=conf.buildSessionFactory();
        Session s=ss.openSession();
        Transaction t=s.beginTransaction();

        Member member=new Member();
        member.setMid(101);
        member.setMname("Tejas");
        member.setMcontactno("9876895678");
        member.setMemail("tejas@gmail.com");
        member.setMaddress("Anand nagar pune");
        
        Member member1=new Member();
        member1.setMid(102);
        member1.setMname("Yash");
        member1.setMcontactno("9876543456");
        member1.setMemail("yash@gmail.com");
        member1.setMaddress("Chandani chowk pune");
        
        Book book=new Book();
        book.setBookId(1);
        book.setBookname("Hibernate");
        book.setAuthor("Jon");
        book.setDescription("Include all hibernate concept");
        book.setQuantityAvailable(67);
        book.setPrice(435);
        
        Book book1=new Book();
        book1.setBookId(2);
        book1.setBookname("Gone Girl");
        book1.setAuthor("Gillian flynn");
        book1.setDescription("Gone Girl is one of those stories that etched into cultural history");
        book1.setQuantityAvailable(40);
        book1.setPrice(250);
        
        LibraryTransaction transaction=new LibraryTransaction();
        transaction.setBookid(1);
        transaction.setMid(101);
        transaction.setTid(2);
        transaction.setBorrowDate("12/1/2023");
        transaction.setReturnDate("25/1/2023");
        
        LibraryTransaction transaction1=new LibraryTransaction();
        transaction1.setBookid(2);
        transaction1.setMid(102);
        transaction1.setTid(3);
        transaction1.setBorrowDate("15/12/2023");
        transaction1.setReturnDate("25/12/2023");
        
        Category category=new Category();
        category.setCategory_id(1);
        category.setName("Science");
        category.setLanguage("English");
        category.setAgegroup("All");
       
        Category category1=new Category();
        category1.setCategory_id(2);
        category1.setName("Crime");
        category1.setLanguage("English");
        category1.setAgegroup("All");
        
         s.save(book);
         s.save(member);
         s.save(transaction);
         s.save(book1);
         s.save(member1);
         s.save(transaction1);
         s.save(category);
         s.save(category1);
         t.commit();
         ss.close();
    }
}
