package bridge;

public class Circle extends Shape {
    private int x,y,radius;
    Circle(DrawApi drawApi, int x, int y, int radius) {
        super(drawApi);
        this.radius=radius;
        this.x=x;
        this.y=y;
    }

    @Override
    public void draw() {
        drawApi.draw(x,y,radius);
    }
}
