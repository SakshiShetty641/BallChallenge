import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        size(400, 200);
    }

    @Override
    public void setup() {
        ellipse(400/2, 200/2, 20, 20);
    }

    @Override
    public void draw() {
        ellipse(400/2, 200/2, 20, 20);
    }
}
