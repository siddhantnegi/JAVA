import java.util.Scanner;

public class reverse {
public static void main(String[] args) {
    int n, join = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the no.");
    int num=in.nextInt();

    while(num!=0)
    {
        n = num % 10;
        join = (join * 10) + n;
        num = num / 10;
    }
    System.out.println("Reversed number is : "+join);
    in.close();
    
}
    
}
    
