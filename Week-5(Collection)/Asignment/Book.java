package Asignment;

import java.util.ArrayList;
import java.util.LinkedList;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int qty;
     public Book(int id,String name,String author,String publisher,int qty){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.qty=qty;
        
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public int getQty() {
        return qty;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Books   ID: "+id+
        "  Name: "+name+
        "  Author: "+author+
        "  Publisher: "+publisher+
        "  Qunatity: "+qty;
    }

    public static void main(String[] args) {
        Book b1=new Book(101, "let us C", "Sai", "Sysmbiosis",1000);
        Book b2=new Book(102, "let us Java", "Samrath", "Sysmbiosis",1000);
        Book b3=new Book(103, "let us Python", "Rohit", "Sysmbiosis",1000);
        Book b4=new Book(104, "let us C++", "Sairaj", "Sysmbiosis",1000);
        LinkedList<Book> al=new LinkedList<Book>();
        al.add(b1);
        al.add(b2);
        al.add(b3);
        al.add(b4);
        for (Book book :al ) {
            System.out.println(book);
        }
    }

}
