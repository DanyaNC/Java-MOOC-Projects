/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danya
 */
import java.util.ArrayList;

public class Library {
    
    private ArrayList<Book> List;
    
    public Library() {
        List = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        List.add(newBook);
    }
    
    public void printBooks() {
        for (Book book : List) {
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> output = new ArrayList<Book>();
        for (Book book : List) {
            if (StringUtils.included(book.title(), title)) {
                output.add(book);
            }
        }
        return output;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> output = new ArrayList<Book>();
        for (Book book : List) {
            if (StringUtils.included(book.publisher(), publisher)) {
                output.add(book);
            }
        }
        return output;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> output = new ArrayList<Book>();
        for (Book book : List) {
            if (book.year() == year) {
                output.add(book);
            }
        }
        return output;
    }
}
