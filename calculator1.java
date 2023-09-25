  import java.util.Scanner;
public class calculator1 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Calculator");
        System.out.println("Available operations: +, -, *, /,%");
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the operator (+, -, *, /,%): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0.0;
        
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    System.exit(1); // Terminate the program
                }
                break;
                case '%':
                if(num1>=num2){
                result=num1%num2;
                }else {
                    System.out.println("invalid input??");
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
                System.exit(1); // Terminate the program
        }
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}

    
