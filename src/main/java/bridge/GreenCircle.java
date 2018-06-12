package bridge;

public class GreenCircle implements DrawApi {
    @Override
    public void draw(int x, int y, int indius) {
        System.out.println("green circle indius:"+indius+"x:"+x+"y:"+y);
    }
}
