package proxy.staticproxy;

public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println(filename);
    }
}
