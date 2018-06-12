package bridge;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape greenCircle=new Circle(new GreenCircle(),10,10,10);
        greenCircle.draw();
        Shape redCircle=new Circle(new RedCircle(),10,10,10);
        redCircle.draw();
    }
}
