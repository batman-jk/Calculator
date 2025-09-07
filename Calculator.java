import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner jk = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        //boolean validOperation = true;
        char choice;

        System.out.println("CALCULATOR");

            do{
            System.out.print("Enter the first number: ");
            num1 = jk.nextDouble();

            System.out.print("Enter an operator (+, -, *, /, ^, ): ");
            operator = jk.next().charAt(0);

            System.out.print("Enter the second number: ");
            num2 = jk.nextDouble();
            {
                switch (operator) {
                    case '+' -> result = num1 + num2;
                    case '-' -> result = num1 - num2;
                    case '*' -> result = num1 * num2;
                    case '/' -> {
                        if (num2 == 0) {
                            System.out.println("\nCannot be divided by zero");
                           // validOperation = false;
                        } else {
                           result = num1 / num2;
                        }
                    }
                    case '^' -> result = Math.pow(num1, num2);
                    default ->
                        System.out.println("\nInvalid Operator");
                }
            }
            System.out.println("\nThe answer is " + result);

            System.out.print("Another Calculation..?(y/n): ");
            choice = jk.next().charAt(0);

        }while(choice == 'y' || choice == 'Y');
            jk.close();
        }
    }
