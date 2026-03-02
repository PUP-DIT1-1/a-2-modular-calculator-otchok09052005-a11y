import java.util.Scanner;

public class JayCalculator{

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int choice = 0; choice != 5; ) {

            System.out.println("\n=== SIMPLE MENU CALCULATOR ===");
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("5 - Exit");
            System.out.print("Choose: ");
            choice = scan.nextInt();

            if (choice >= 1 && choice <= 4) {

                System.out.print("Enter first number: ");
                double num1 = scan.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = scan.nextDouble();

                double answer = 0;

                switch (choice) {
                    case 1:
                        answer = add(num1, num2);
                        break;
                    case 2:
                        answer = subtract(num1, num2);
                        break;
                    case 3:
                        answer = multiply(num1, num2);
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Cannot divide by zero.");
                            continue;
                        }   answer = divide(num1, num2);
                        break;
                    default:
                        break;
                }

                System.out.println("Answer: " + answer);
            }
            else if (choice == 5) {
                System.out.println("Program ended.");
            }
            else {
                System.out.println("Invalid choice.");
            }
        }

        scan.close();
    }
}