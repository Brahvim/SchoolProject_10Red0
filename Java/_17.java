import java.util.InputMismatchException;
import java.util.Scanner;

public class _17 {
    static Scanner sc = new Scanner(System.in);
    static String difficulty;
    static int answer;

    public static void main(String[] args) throws InterruptedException {

        println("Hey there! Let\'s play a game!");
        Thread.sleep(1250);
        println("You will need to guess a number.");
        print("Does that sound fun to you? (Will you play?)\n(`Y`/`N`): ");

        if (checkNext())
            chooseLevel();
        else
            leave();
    }

    public static void chooseLevel() throws InterruptedException {
        println("Which one of these difficulty levels would you like to play at?:");

        println("Easy");
        Thread.sleep(120);
        println("Medium");
        Thread.sleep(120);
        println("HARD");
        Thread.sleep(120);

        print("Type the name in!: ");

        switch (sc.next().toLowerCase()) {
            case "easy":
                difficulty = "Easy";
                game();
                break;
            case "medium":
                difficulty = "Medium";
                game();
                break;
            case "hard":
                difficulty = "HARD";
                game();
                break;
            default:
                println("..looks like you won't play?");
                leave();
                break;
        }
    }

    public static void game() throws InterruptedException {
        println(".....so, you chose the \'" + difficulty + "\' Difficulty.");
        int r = (int) (difficulty == "Easy" ? (Math.random() * 3) + 1
                : difficulty == "Medium" ? (Math.random() * 5) + 1 : (Math.random() * 10) + 1);

        println("Alright, I chose the number!");
        println("It is between `1` and `" + (difficulty == "Easy" ? 3 : difficulty == "Medium" ? 5 : 10) + "`!");
        println("I will give you ten seconds.\nIf I do not recieve an answer in that time interval,");
        println("..you will be given your other chance.");
        println("Yes, I'll give you two chances. \nLet's see if you can guess it in time!~");

        playGame();
        checkAnswer(answer, r);
        println("Ah, you failed, I see. Here's another chance: ");
        playGame();
        checkAnswer(answer, r);

        println("Sad! Well, not everybody needs to win... the answer was: `" + r + "`. ");
        print("Well, I\'ll go now... Enjoy your time!~");

        /*
         * String[] appreciate = new String[] { "Nice one!", "Amazing!", "Woah...",
         * "Wooh!", "Yay!", "I see a winner,", "Well played.", "Well performed!",
         * "That was on fire!", "I can barely believe it!" };
         * 
         * int theNumber = (int) (Math.random() * words.length);
         * 
         * println("Alright, **LET'S DO THIS.**");
         * 
         * System.out.println(3); Thread.sleep(500); System.out.println(2);
         * Thread.sleep(500); System.out.println(1); Thread.sleep(500);
         * 
         * long startt; System.out.println("Go!");
         * 
         * startt = System.currentTimeMillis(); String userWord = (String) sc.next();
         * 
         * if (words[index].equalsIgnoreCase(userWord)) { println(appreciate[(int)
         * (Math.random() * appreciate.length)] + " Your reaction time was just: `" +
         * (System.currentTimeMillis() - startt) + "` milliseconds!");
         * println("...play again?! (`Y`/`N`): ");
         * 
         * gameOrLeave();
         * 
         * } else { println("Oh no-no-no-no-no-no!");
         * print("Wrong word!\nWrong word!\n"); print("...try again? (`Y`/`N`): ");
         * 
         * gameOrLeave(); }
         */
    }

    public static void playGame() throws InterruptedException {
        try {
            GetInput g = new GetInput();
            println("..3");
            println("..2");
            println("..1");
            System.out.println("GO!");
            g.start();
            g.join(10000);

            System.gc();
        } catch (InputMismatchException e) {
            return;
        }
    }

    public static void checkAnswer(int answer, int r) throws InterruptedException {
        String[] appreciate = new String[] { "Nice one!", "Amazing!", "Woah...", "Wooh!", "Yay!", "I see a winner,",
                "Well played.", "Well performed!", "That was on fire!", "I can barely believe it!" };

        if (answer == r) {
            print(appreciate[(int) (Math.random() * appreciate.length)] + " ..you did it! ");
            println("That was the right answer!");
            print("...want to play again? (`Y`/`N`): ");
            if (checkNext())
                chooseLevel();
            else
                leave();
        }
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

class GetInput extends Thread {

    static Scanner sc = new Scanner(System.in);

    @Override
    public void run() {
        _17.answer = sc.nextInt();
    }
}