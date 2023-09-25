import java.util.Scanner;

public class Casecheck1 {
    public static void main(String[] args) {

        System.out.println("enter your name :");
        Scanner in = new Scanner(System.in);
        String ch = in.nextLine();

        if (ch.length() == 1) {

            char chr = ch.charAt(0);
            System.out.println("YOU ENTERED :" + chr);
               
             
            if(chr>='a'&& chr<='z')
                System.out.println("...Lower Case...");

                else
                System.out.println("...Upper Case...");
                

        }

    else

    {
        System.out.println("PLEASE ENTER SINGLE CHARACTER");

    }
        in.close();

    }

}
