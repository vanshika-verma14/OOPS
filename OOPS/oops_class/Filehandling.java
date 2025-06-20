import java.io.File;
import java.io.IOException;

public class Filehandling {
    public static void main(String[] args) throws IOException {
        // Use double backslashes or forward slashes
        File f = new File("C:\\Users\\ayush\\OneDrive\\Documents\\java\\OOPS\\oops_class\\Filehandling.java");

            System.out.println(f.createNewFile());
      
    }
}
