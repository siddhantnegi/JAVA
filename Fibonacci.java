import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int count = 2;
        {
            Scanner fib = new Scanner(System.in);
            System.out.println("ENTER THE nTH -- ");
            int n = fib.nextInt();

            while (count <= n) {
                int temp = b;
                b = b + a;
                a = temp;
                count++;
            }
            
            System.out.println("fibonacci no is : " + b);
            fib.close();
        }

    }
    
}
