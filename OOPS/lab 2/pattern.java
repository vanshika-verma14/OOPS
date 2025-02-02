public class pattern {
    public static void main(String[] args) {
        int[] symbolCounts = {3, 5, 2, 6, 4};
        
        for (int i = 0; i < symbolCounts.length; i++) {
            char symbol = (i % 2 == 0) ? '?' : '#';
            for (int j = 0; j < symbolCounts[i]; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
