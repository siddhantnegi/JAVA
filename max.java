import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER :");
        Scanner sid=new Scanner(System.in);
        int a = sid.nextInt();
        int b = sid.nextInt();
        int c = sid.nextInt();
        
        int max=a;
        if(b>max)
        {
            max=b;
        }
        if(c>max)
        max=c;
        System.out.println("maximum no. :"+max);
        sid.close();
    }
}
