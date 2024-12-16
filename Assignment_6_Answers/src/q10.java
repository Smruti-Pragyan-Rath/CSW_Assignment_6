import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an expression (e.g., 5+3):");
        String input = sc.nextLine();

        if (input.contains("+")) {
            String[] operands = input.split("\\+");
            int result = Integer.parseInt(operands[0].trim()) + Integer.parseInt(operands[1].trim());
            System.out.println("Sum = " + result);
        } else if (input.contains("-")) {
            String[] operands = input.split("-");
            int result = Integer.parseInt(operands[0].trim()) - Integer.parseInt(operands[1].trim());
            System.out.println("Sub = " + result);
        } else if (input.contains("*")) {
            String[] operands = input.split("\\*");
            int result = Integer.parseInt(operands[0].trim()) * Integer.parseInt(operands[1].trim());
            System.out.println("Mul = " + result);
        } else if (input.contains("/")) {
            String[] operands = input.split("/");
            int denominator = Integer.parseInt(operands[1].trim());
            if (denominator == 0) {
                System.out.println("Error: Division by zero");
            } else {
                int result = Integer.parseInt(operands[0].trim()) / denominator;
                System.out.println("Div = " + result);
            }
        }

    }
}
