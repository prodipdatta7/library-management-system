/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.util.ArrayList;
/**
 *
 * @author prodi
 */
public class DB {
    
    public static ArrayList<StudentModel> students = new ArrayList<StudentModel>() ;
    public static ArrayList<BookModel> books = new ArrayList<BookModel>() ;
    public static ArrayList<IssueBookModel> issuedBooks = new ArrayList<IssueBookModel>() ;
    public static boolean isLoggedIn = false ;
    
    public static boolean checkLoggedIn() {
        return isLoggedIn ; 
    }
    
    public static int getBookWithId(String bookId){
        if(books.size() == 0)return -1 ; 
        for(int i = 0 ; i < books.size(); ++i) {
            if(books.get(i).bookID == bookId){
                return 1 ; 
            }
        }
        return -1 ; 
    }
    
    public static int getStudentWithId(String ID) {
        if(students.size() == 0)return -1 ; 
        for(int i = 0 ; i < students.size() ; ++i) {
            if(students.get(i).ID == ID) {
                return 1 ; 
            }
        }
        return -1 ; 
    }
    
    public static int insert(StudentModel obj) {
        int _size = students.size() ;
        for(int i = 0 ; i < _size ; ++i) {
            StudentModel cur = students.get(i) ;
            if(cur.ID == obj.ID){
                return -1 ; 
            }
        }
        students.add(obj) ;
        return 1 ; 
    }
    
    public static int insertBook(BookModel obj) {
        int _size = books.size() ;
        for(int i = 0 ; i < _size ; ++i) {
            BookModel cur = books.get(i) ;
            if(cur.bookID == obj.bookID){
                return -1 ; 
            }
        }
        books.add(obj) ;
        return 1 ; 
    }
    
    public static int IssueNewBook(IssueBookModel obj) {
        int _size = issuedBooks.size() ;
        for(int i = 0 ; i < _size ; ++i) {
            IssueBookModel cur = issuedBooks.get(i) ;
            if(cur.bookID == obj.bookID){
                return -1 ; 
            }
        }
        issuedBooks.add(obj) ;
        return 1 ; 
    }
    
    public static int getIssuedBookWithBookIdAndStudentId(String bookId, String studentId) {
        if(issuedBooks.size() == 0)return -1 ; 
        for(int i = 0 ; i < issuedBooks.size() ; ++i) {
            if(issuedBooks.get(i).bookID == bookId && issuedBooks.get(i).studentID == studentId) {
                return i ; 
            }
        }
        return -1 ; 
    }
    
}
