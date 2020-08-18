//Student's Full name: Tasfique Enam
//Student's ID: 5886429
//Task1
package labtask6;

public class TextBook {
    private String title;
    private String isbn;
    private String author;
    private String publisher;
    private float pricePerUnit;
    
    public TextBook(){
        title = null;
        isbn = null;
        author = null;
        publisher = null;
        pricePerUnit = 0.0f;
        
    }
    
    void setTextBookTitle(String title){
        this.title = title;
    }
    
    void setTextBookisbn(String isbn){
        this.isbn = isbn;
    }
    
    void setTextBookauthor(String author){
        this.author = author;
    }
    
    void setTextBookpublisher(String publisher){
        this.publisher = publisher;
    }
    
    void setTextBookpricePerUnit(Float pricePerUnit){
        this.pricePerUnit = pricePerUnit;
    }
    
    String getTextBookTitle(){
        return title;
    }
    
    String getTextBookisbn(){
        return isbn;
    }
    
    String getTextBookPublisher(){
        return publisher;
    }
    
    String getTextBookAuthor(){
        return author;
    }
    
    Float getTextBookpricePerUnit(){
        return pricePerUnit;
    }
    
    
    
    
    
    
    
    
    
    
    
    
   
    
}
