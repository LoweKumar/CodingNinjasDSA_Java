import java.util.Scanner;

public class noOfDigit {

    public static long count(long n) {
        if (n/10==0)
            return 1;
        return 1 + count(n/10);
    }

    public static void main(String[] main){
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();

        long result = count(n);
        System.out.println("No of digits = "+ result);
    }


}
