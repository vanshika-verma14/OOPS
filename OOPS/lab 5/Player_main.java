//Create a Java program with a Player class and derive three subclasses: Cricket_Player, Football_Player, and Hockey_Player. Implement attributes such as name, age, and position, and methods like play() and train() to represent these players. 
 public class player {
    String name ;
    int age ;
    String position ;
    
    public player(String name, int age, String position){
        this.name = name ;
        this.age = age ;
        this.position = position ;
    }
    
    public void play(){
        System.out.println(name + " is playing as " + position);
    }
    
    public void train(){
        System.out.println(name + " is training as" + position);
    }

}

public class Cricket_Player extends player{
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }
}
  
class Football_Player extends player{
    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }
}

class Hockey_Player extends player{
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }
}
public class Player_main{
 public static void main(String[] args) {
    Cricket_Player obj1 = new Cricket_Player("Virat kholi", 40, "batsman");
    obj1.play();
    obj1.train();
    
    Football_Player obj2 = new Football_Player("Cristiano Ronaldo", 30, "forward");
    obj2.play();
    obj2.train();
    
    Hockey_Player obj3 = new Hockey_Player("Shane Warne", 32, "goalie");
    obj3.play();
    obj3.train();
 }
}