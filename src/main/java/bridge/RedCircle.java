package bridge;

public class RedCircle implements DrawApi {
    @Override
    public void draw(int x, int y, int indius) {
        System.out.println("red circle indius:"+indius+"x:"+x+"y:"+y);
    }
}
