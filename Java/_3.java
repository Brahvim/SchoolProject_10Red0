import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number the factorial of whom should be determined: ");
        int x = sc.nextInt();
        System.out.println("It's factorial is: " + factorial(x));
        sc.close();
    }

    public static int factorial(int f) {
        return (f == 0 ? 1 : f * factorial(f - 1));
    }

}
