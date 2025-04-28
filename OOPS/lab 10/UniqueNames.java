import java.util.HashSet;

public class UniqueNames {
    public static void main(String[] args) {
        String[] names = {"Aman", "Varchasv", "Divyansh", "Varchasv", "Aman"};
        
        HashSet<String> uniqueNames = new HashSet<>();
        
        // Adding names to the HashSet to remove duplicates
        for (String name : names) {
            uniqueNames.add(name);
        }
        
        // Checking if a specific name exists
        String searchName = "Aman";
        if (uniqueNames.contains(searchName)) {
            System.out.println(searchName + " exists in the set.");
        } else {
            System.out.println(searchName + " does not exist in the set.");
        }
        
        // Printing unique names
        System.out.println("Unique names in the set:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
