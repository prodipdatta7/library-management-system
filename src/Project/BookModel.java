/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author prodi
 */
public class BookModel {
    public String bookID;
    public String bookName;
    public String publisher;
    public String publishYear;
    public String price;
    public BookModel(){}
    public BookModel(String bookID, String bookName, String publisher, String publishYear, String price) {
        this.bookID = bookID ;
        this.bookName = bookName ;
        this.publisher = publisher ;
        this.publishYear = publishYear ; 
        this.price = price ;
    }
}
