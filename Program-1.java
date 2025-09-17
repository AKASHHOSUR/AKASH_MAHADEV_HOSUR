import java.util.Scanner;

class Calculator {
  double a, b;
  String operation;

  Calculator(double a, double b, String operation) {
    this.a = a;
    this.b = b;
    this.operation = operation;
  }

  double calculate() {
    switch (operation.toLowerCase()) {
      case "add": return a + b;
      case "subtract": return a - b;
      case "multiply": return a * b;
      case "divide": 
        if (b !=0) return a / b;
        else {
          System.out.println("Error: Division by Zero");
          return 0;
        }
      default:
        System.out.println("Invalid operation!");
        return 0;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    double a = sc.nextDouble();
    System.out.print("Enter second number: ");
    double b = sc.nextDouble();
    System.out.print("Enter operation to be performed: ");
    String op = sc.next();
    Calculator c = new Calculator(a, b, op);
    System.out.println("Result: " + c.calculate());
    sc.close();
  }
}
