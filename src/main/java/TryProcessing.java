import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;
    public static final int DIAMETER = 20;
    public int x = 0;


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
        ellipse(x, HEIGHT/2, DIAMETER, DIAMETER);
        x++;
    }
}
