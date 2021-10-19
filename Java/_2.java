import java.util.Scanner;

public class _2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number. I'll tell if it's prime.");
        System.out.println(isPrime(sc.nextInt()) ? "It is." : "No, it isn't.");
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        int half = n / 2;
        for (int i = 2; i <= half; i++)
            flag = n % i != 0;
        return flag;
    }

}
