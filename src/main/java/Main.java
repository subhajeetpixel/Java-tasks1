import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter first number:");
    double num1 = scanner.nextDouble();
    System.out.println("Enter operator (+, -, *, /):");
    char operator = scanner.next().charAt(0);
    System.out.println("Enter second number:");
    double num2 = scanner.nextDouble();
    scanner.close();

    double result;
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
          System.out.println("Cannot divide by zero.");
          return;
        }
        result = num1 / num2;
        break;
      default:
        System.out.println("Invalid operator.");
        return;
    }
    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
  }
}