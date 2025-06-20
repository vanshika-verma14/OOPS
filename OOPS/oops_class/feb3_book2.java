public class feb3_book2 {
    public static void main(String[] args) {
        Book book1 = new Book("the alchemist" , "Paolo" , 15.99);
        book1.display();
        Book book2 = new Book("the alchemist" , "Paolo" , 15.99);
        // book2.display();
        // Book book3 = new Book();
        // book3.display();
    }
}
class Book{ 
  String tittle;
  String author;
  double price;
  String newspaper;
public Book(String TLE , String author, double price){ 
  tittle = TLE;
  this.author = author;
  this.price = price;
  }
void display(){
    System.out.println("Title : "+tittle +"\nAuthor : "+author +"\nPrice : "+price );
}
// public Book(String newspaper){
//     this.newspaper = newspaper;
// }
// public Book()
// {
//     this("newspaper");
// }
}