// Author: Atharv Damle
// Extend an abstract class.
// Full Question: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem

class MyBook extends Book
{
    int price;
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    MyBook(String title, String author, int p)
    {
        super(title, author);
        price = p;
    }
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    void display()
    {
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Price: "+ price);
    }
}
