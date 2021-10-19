import java.util.Scanner;

public class _7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        println("I will find the `GCD`/`HCF` and `LCM` of two numbers you enter.");
        print("Please enter the first number: ");
        int a = sc.nextInt();
        print("Please enter the second number: ");
        int b = sc.nextInt();
        int p = a * b;
        for (int i = 1; i < p; i++)
            if (a % i == 0 && b % i == 0)
                print("\nThe `GCD` is: `" + i + "`, and the `LCM` is: `" + (p / i) + "`. Thank you, and bye!~");

    }

    public static void println(String st) throws InterruptedException {
        print(st);
        System.out.println();
        Thread.sleep(200);
    }

    public static void print(String st) throws InterruptedException {

        // Could use this, but it is unoptimized!:
        /*
         * char[] ch = st.toCharArray();
         * 
         * for (char c : ch) {
         * 
         * System.out.print(c);
         * 
         * Thread.sleep(10); }
         */

        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            System.out.print(c);

            switch (c) {
                case ',':
                    Thread.sleep(350);
                    break;
                case '.':
                    Thread.sleep(150);
                    break;
                case '!':
                    Thread.sleep(550);
                    break;
                case '-':
                    // Yeah. No delay. No gap.
                    break;
                default:
                    Thread.sleep(20);
                    break;
            }
        }

    }

}
