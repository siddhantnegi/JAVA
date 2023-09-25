import java.util.Scanner;

public class Calculator {

    public static char opr;

    public static void main(String[] args) {
        int ans = 0;
        Scanner cal = new Scanner(System.in);
        System.out.println("WELCOME TO SIMPLE CALCULATOR");
        System.out.println("Avalable operators (+, -, *, /)");

        // if (op != "x" && op != "X") {

        //     opr = op.charAt(0);
        // } else
        //     System.out.println("invalid choice!!");

        while (true) {

            if (opr == '+' || opr == '-' || opr == '*' || opr == '/') {
                System.out.println("Enter the 1st number :");
                int num1 = cal.nextInt();
                System.out.println("Enter the operator ::");
                char op = cal.next().charAt(0);

                System.out.println("Enter the 2nd number :");
                int num2 = cal.nextInt();

                if (opr == '+') {
                    ans = num1 + num2;
                }
                if (opr == '-') {
                    ans = num1 - num2;
                }
                if (opr == '*') {
                    ans = num1 * num2;
                }
                if (opr == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Denominator should be greater than 0");
                    }

                }
            }
            System.out.println("Answer ::" + ans);
            cal.close();
        }

    }

}
