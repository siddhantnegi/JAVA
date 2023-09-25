public class occurance {
    public static void main(String[] args) {
        int a=128838584;
        int count=0,rem;
        while(a!=0){
            rem = a%10;
            if (rem==4)
            {
                count++;
            }
            a=a/10;
                       
        }
        System.out.println("occurance :"+count);
    }

}
