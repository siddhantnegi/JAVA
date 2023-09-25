import java.util.Scanner;

public class sum {

    public static int subtractProductAndSum(int num) {
        int add = 0, prod = 1, x;
        while (num > 0) {
            x = num % 10;
            prod = prod * x;
            add = add + x;
            num = num / 10;
        }
        return (prod - add);
    }
   public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the digit :");
        int n = in.nextInt();
        sum obj=new sum();
        System.out.println(obj.subtractProductAndSum(n));
        in.close();
}
}
