import java.util.Scanner;

public class _20 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        println("Hey there! Let\'s play a game!");
        Thread.sleep(1250);
        println("You will race against time!");
        println("Type the given word in as less time as possible!");
        print("It'll be fun, may I start? (`Y`/`N`): ");

        gameOrLeave();

    }

    public static void game() throws InterruptedException {

        String[] words = new String[] { "Word", "Train", "Chocolate", "Win", "Cake", "Yummy", "Water", "Bottle", "Dog",
                "Apple", "Coffee", "Language" };

        String[] appreciate = new String[] { "Nice one!", "Amazing!", "Woah...", "Wooh!", "Yay!", "I see a winner,",
                "Well played.", "Well performed!", "That was on fire!", "I can barely believe it!" };

        int index = (int) (Math.random() * words.length);

        println("Alright,\n\tYour word is: \"" + words[index] + "\".\nStarting in:");

        System.out.println(3);
        Thread.sleep(500);
        System.out.println(2);
        Thread.sleep(500);
        System.out.println(1);
        Thread.sleep(500);

        long startt;
        System.out.println("Go!");

        startt = System.currentTimeMillis();
        String userWord = (String) sc.next();

        if (words[index].equalsIgnoreCase(userWord)) {
            long t = (System.currentTimeMillis() - startt);

            if (t == 1)
                println(appreciate[(int) (Math.random() * appreciate.length)] + " Your reaction time was JUST: `" + t
                        + "` millisecond!");
            else
                println(appreciate[(int) (Math.random() * appreciate.length)] + " Your reaction time was just: `" + t
                        + "` milliseconds!");

            println("...play again?! (`Y`/`N`): ");

            gameOrLeave();

        } else {
            println("Oh no-no-no-no-no-no!");
            print("Wrong word!\nWrong word!\n");
            print("...try again? (`Y`/`N`): ");

            gameOrLeave();
        }

    }

    public static void gameOrLeave() throws InterruptedException {
        if (checkNext())
            game();
        else
            leave();
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

    public static void leave() throws InterruptedException {
        println("Oh, sorry. Thank you, and bye!");
        sc.close();
        System.exit(0);
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
