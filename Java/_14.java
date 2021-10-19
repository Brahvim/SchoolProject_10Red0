public class _14 {

    public static void main(String[] args) {
        Particle ball = new Particle();
        Particle balloon = new Particle();

        makeGLWindow();

        while (!windowShouldClose()) {
            renderParticle(ball);
            renderParticle(balloon);
        }

        destroyWindow();

    }

    public static boolean windowShouldClose() {
        // Code to return whether or not the window should close...
        return false;
    }

    public static void makeGLWindow() {
        // Code to make a window with the `WINAPI` goes here...
    }

    public static void destroyWindow() {
        // Code to un-make a window with the `WINAPI` goes here...
    }

    public static void renderParticle(Particle p) {
        // Code to render the particle on the window goes here...
    }

}

class Particle {
    Vector position, velocity, acceleration;

    Particle() {
        this.position = new Vector();
        this.velocity = new Vector(.5f, .2f);
        this.acceleration = new Vector(this.position);
    }

    Particle(float _x, float _y) {
        this.position = new Vector(_x, _y);
        this.velocity = new Vector(.5f, .2f);
        this.acceleration = new Vector(this.position);
    }

}

class Vector {
    float x, y;

    Vector() {
        x = .0f;
        y = .0f;
    }

    Vector(float _x, float _y) {
        this.x = _x;
        this.y = _y;
    }

    Vector(Vector v) {
        this.x = v.x;
        this.y = v.y;
    }

    public double dist(Vector v) {
        return Math.sqrt(this.distSq(v));
    }

    public void add(Vector v) {
        this.x += v.x;
        this.y += v.y;
    }

    public void add(double a, double b) {
        this.x += a;
        this.y += b;
    }

    public void sub(Vector v) {
        this.x -= v.x;
        this.y -= v.y;
    }

    public void sub(double a, double b) {
        this.x -= a;
        this.y -= b;
    }

    public double distSq(Vector v) {
        return Math.pow(v.x, 2.f) + Math.pow(v.y, 2.f);
    }

}