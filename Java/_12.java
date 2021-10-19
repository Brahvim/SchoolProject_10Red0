import java.util.Scanner;

public class _12 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        println("Hello! This program prints out random numbers.");

        print("Please enter the lower range of the value (inclusive): ");
        int m = sc.nextInt();
        System.out.println();

        print("Please enter the higher range of the value (also inclusive): ");
        int n = sc.nextInt();
        System.out.println();

        println("Here is a random number: " + (int) (Math.random() * (n - m) * m));
        print("Would you like another? (`Y`/`N`) ");

        // if (checkNext()) {
        // giveRandom(m, n);
        // println("Would you like another?");
        // } else
        // System.exit(0);

        while (checkNext()) {
            System.out.println();
            giveRandom(m, n);
            print("Would you like another? (`Y`/`N`) ");
        }

    }

    public static void giveRandom(int m, int n) {
        System.out.println("Here is another random number: " + (int) (Math.random() * (n - m) * m));
    }

    public static boolean checkNext() {
        switch (sc.next().charAt(0)) {
            case 'Y':
                return true;

            case 'y':
                return true;

            default:
                return false;
        }
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
                    break;
                default:
                    Thread.sleep(20);
                    break;
            }
        }

    }

}
