//Student's Full name: Tasfique Enam
//Student's ID: 5886429
//Task1
package labtask6;
/**
 *
 * @author Tasfique
 */

import java.util.Scanner;

public class TextBookMain {
    
     public static void main(String[] args) {
         
         String name,isbn,author,publisher;
         Float price;
         
          Scanner read = new Scanner (System.in);
          TextBook object = new TextBook(); //object
          
          System.out.println("Enter the name of the book ");
          name = read.nextLine();
          System.out.println("Enter the isbn of the book ");
          isbn = read.nextLine();
          System.out.println("Enter the author of the book");
          author = read.nextLine();
          System.out.println("Enter the publisher of the book ");
          publisher = read.nextLine();
          System.out.println("Enter the price of the book ");
          price = read.nextFloat();
          
          object.setTextBookTitle(name);
          object.setTextBookisbn(isbn);
          object.setTextBookauthor(author);
          object.setTextBookpublisher(publisher);
          object.setTextBookpricePerUnit(price);
          
          System.out.println(object.getTextBookTitle());
          System.out.println(object.getTextBookisbn());
          System.out.println(object.getTextBookAuthor());
          System.out.println(object.getTextBookPublisher());
          System.out.println("RM"+object.getTextBookpricePerUnit());
     }
    
}
