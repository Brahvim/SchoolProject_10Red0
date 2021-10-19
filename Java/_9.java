import java.util.Scanner;
import java.awt.*;

public class _9 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) size.getWidth();
        int height = (int) size.getHeight();

        System.out.println("Your Screen's dimensions are:");
        System.out.println("`x`:`" + width + "`  by `y`:`" + height + "`");
    }
}
/*
 * public static void main(String[] args) throws InterruptedException {
 * 
 * Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); int width =
 * (int) size.getWidth(); int height = (int) size.getHeight();
 * 
 * Simulator s = new Simulator(); s.width = width; s.height = height;
 * 
 * print("Wohoo! Welcome to the funzone, ---------");
 * println("\n\t --------- a (`2D`) particle Physics simulation!");
 * 
 * print("...Hmm, I see. Your computer reports that the resolution of your screen is: "
 * ); println("\n`x`:`" + width + "`  by `y`:`" + height + "`");
 * 
 * println("...What is the size of the particles (in pixels)?"); s.pSize =
 * sc.nextFloat();
 * 
 * println("How many particles do we have? (Max is 255)"); s.pCount = (int)
 * sc.nextByte();
 * 
 * char intChoice = '\0';
 * println("Which integration method should be utilized?");
 * println("Euler [\'E\'] and (Velocity-less) Verlet [\'V\'] are the ones used here."
 * ); while (!(intChoice == 'e' || intChoice == 'v')) {
 * 
 * print("Enter your choice (`E` or `V`): "); intChoice =
 * Character.toLowerCase(sc.next().charAt(0));
 * 
 * if (intChoice == 'e' || intChoice == 'v') break; else
 * println("Whoops, try again!"); }
 * 
 * print("..one last setting! May I know the timestep? (Values in milliseconds): "
 * ); long h = sc.nextLong();
 * 
 * println("About to start. Remember: you can always press `Alt + F4` to stop."
 * );
 * 
 * println("Now, without any further delay...let the simulation BEGIN!");
 * s.start();
 * 
 * }
 * 
 * public static boolean checkNext() { switch (sc.next().charAt(0)) { case 'Y':
 * return true;
 * 
 * case 'y': return true;
 * 
 * default: return false; } }
 * 
 * public static void println(String st) throws InterruptedException {
 * print(st); System.out.println(); Thread.sleep(200); }
 * 
 * public static void print(String st) throws InterruptedException {
 * 
 * // Could use this, but it is unoptimized!: /* char[] ch = st.toCharArray();
 * 
 * for (char c : ch) {
 * 
 * System.out.print(c);
 * 
 * Thread.sleep(10); } //
 * 
 * for (int i = 0; i < st.length(); i++) { char c = st.charAt(i);
 * System.out.print(c);
 * 
 * switch (c) { case ',': Thread.sleep(350); break; case '.': Thread.sleep(150);
 * break; case '!': Thread.sleep(550); break; case '-': break; default:
 * Thread.sleep(20); break; } }
 * 
 * }
 * 
 * }
 * 
 * class Simulator extends Thread { long h; int pCount; int width, height; float
 * pSize;
 * 
 * @Override public void run() {
 * 
 * }
 * 
 * }
 * 
 * class SParticle { PVector position, velocity, acceleration;
 * 
 * SParticle() { this.position = new PVector(); this.velocity = new PVector(.5f,
 * .2f); this.acceleration = new PVector(this.position); }
 * 
 * SParticle(float _x, float _y) { this.position = new PVector(_x, _y);
 * this.velocity = new PVector(.5f, .2f); this.acceleration = new
 * PVector(this.position); }
 * 
 * }
 * 
 * class PVector { float x, y;
 * 
 * PVector() { x = .0f; y = .0f; }
 * 
 * PVector(float _x, float _y) { this.x = _x; this.y = _y; }
 * 
 * PVector(PVector v) { this.x = v.x; this.y = v.y; }
 * 
 * public double dist(PVector v) { return Math.sqrt(this.distSq(v)); }
 * 
 * public void add(PVector v) { this.x += v.x; this.y += v.y; }
 * 
 * public void add(double a, double b) { this.x += a; this.y += b; }
 * 
 * public void sub(PVector v) { this.x -= v.x; this.y -= v.y; }
 * 
 * public void sub(double a, double b) { this.x -= a; this.y -= b; }
 * 
 * public double distSq(PVector v) { return Math.pow(v.x, 2.f) + Math.pow(v.y,
 * 2.f); } }
 */