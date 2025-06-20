public class feb3_book {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setDetails("the alchemist" , "Paolo" , 15.99);
        book1.display();
        Book book2 = new Book();
        book2.setDetails("the alchemist" , "Paolo" , 15.99);
        book2.display();
    }
}
class Book{
  String tittle;
  String author;
  double price;
  void setDetails(String tittle , String author, double price){ 
    //Can a Parameterized Constructor Have void in Java?
    //No, a constructor in Java cannot have a return type, including void. If you add void before a constructor, it will be treated as a regular method instead of a constructor.
  this.tittle = tittle;
  this.author = author;
  this.price = price;
  }
void display(){
    System.out.println("Title : "+tittle +"\nAuthor : "+author +"\nPrice : "+price );
}
}