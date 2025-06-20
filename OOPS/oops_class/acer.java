
public interface laptop{
    public void copy();
    public void paste();
    public void cut();
}
public class Acer implements laptop{
    public void copy(){
        System.out.println("acer laptop copy function called");
    }
public void paste(){
    System.out.println("acer laptop paste function called");
}
public void cut(){
    System.out.println("acer laptop cut function called");
}
}
