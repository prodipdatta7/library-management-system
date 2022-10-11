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
public class IssueBookModel {
    public String bookID ; 
    public String studentID ; 
    public String issueDate ; 
    public String dueDate ;
    public String returedBook;
    public IssueBookModel(){}
    public IssueBookModel(String bookID, String studentID, String issueDate, String dueDate, String returned){
        this.bookID = bookID ; 
        this.studentID = studentID ; 
        this.issueDate = issueDate ; 
        this.dueDate = dueDate ;
        this.returedBook = returned ;
    }
}
