/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author eiwei
 */
public class Book {
    public String title,author,publisher;
    public int yearPublished;
    public double price;
    public boolean isAvailable;
    
    public void printDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $"+price);
        if (isAvailable) {
            System.out.println("Available: Yes");
            
        }else{
            System.out.println("Available: No");
        }
    }
    public void updatePrice(double newPrice){
        price = newPrice;
        
    }
    public void markAsAvailable(){
        isAvailable = true;
    }
    public void markAsUnavailable(){
        isAvailable = false;
        
    }
    public boolean isPublishedAfter(int year){
        return year < yearPublished;
    }
}

public class Library{
    public String libraryName;
    public Book book1;
    public Book book2;
    public Book book3;
    
    public void addBook(Book book,int slot){
        if (slot == 1) {
            book1 = book;
        }else if (slot == 2) {
            book2 = book;
        }else if (slot == 3) {
            book3 = book;
            
        }
    }
    
    public void removeBook(int slot){
            if (slot == 1) {
            book1 = null;
        }else if (slot == 2) {
            book2 = null;
        }else if (slot == 3) {
            book3 = null;
            
        }
    }
    
    public void printLibraryDetails(){
        System.out.println("Library: " +libraryName);
        System.out.println("");
        if (book1 != null){
            book1.printDetails();
            System.out.println("");
        }else{
            System.out.println("No book in this slot.");
            System.out.println("");
        }
        if (book2 != null){
            book2.printDetails();
            System.out.println("");
        }else{
            System.out.println("No book in this slot.");
            System.out.println("");
        }
        if (book3 != null){
            book3.printDetails();
            System.out.println("");
        }else{
            System.out.println("No book in this slot.");
            System.out.println("");
        }
    }
    
    public void checkBookAvailability(int slot){
        Book bellbook = null;
        if (slot == 1){
            bellbook = book1;
            
        }else if (slot == 2) {
            bellbook = book2;
        }
        else if (slot == 3) {
            bellbook = book3;
        }
        if (bellbook != null) {
            System.out.println(bellbook.title+" is available.");
        }else{
            System.out.println("Book in slot " + slot +" is not available.");
        }
    }
    
    public void updateBookPrice(int slot, double newPrice){
        Book bellbook = null;
        if (slot == 1){
            bellbook = book1;
            
        }else if (slot == 2) {
            bellbook = book2;
        }
        else if (slot == 3) {
            bellbook = book3;
        }
        if (bellbook != null) {
            bellbook.updatePrice(newPrice);
            System.out.println("Updated price of " + bellbook.title + " to $" + newPrice+".");
        }else{
            System.out.println("No book in this slot.");
        }
    }
    
    public void printBookDetails(Book book){
        if (book != null){
            book.printDetails();
        }else{
            System.out.println("No book in this slot.");
        }
    }
}