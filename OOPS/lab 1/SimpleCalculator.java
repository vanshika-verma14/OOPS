public class SimpleCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("give the first number, operator and next number");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            char operator = args[1].charAt(0);
            int num2 = Integer.parseInt(args[2]);
            int result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator.");
                    return;
            }

            System.out.println("Answer: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}