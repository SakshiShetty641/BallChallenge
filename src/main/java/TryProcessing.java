import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;
    public static final int DIAMETER = 20;
    public int x1 = 0;
    public int x2 = 0;
    public int x3 = 0;
    public int x4 = 0;
    public static final int SPEED_1 = 1;
    public static final int SPEED_2 = 2;
    public static final int SPEED_3 = 3;
    public static final int SPEED_4 = 4;


    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        //ellipse(400/2, 200/2, 20, 20);
    }

    @Override
    public void draw() {
        ellipse(x1 += SPEED_1, HEIGHT * 1 / 4, DIAMETER, DIAMETER);
        ellipse(x2 += SPEED_2, HEIGHT * 2 / 4, DIAMETER, DIAMETER);
        ellipse(x3 += SPEED_3, HEIGHT * 3 / 4, DIAMETER, DIAMETER);
        ellipse(x4 += SPEED_4, HEIGHT * 4 / 4, DIAMETER, DIAMETER);

    }
}
