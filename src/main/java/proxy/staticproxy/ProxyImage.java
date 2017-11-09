package proxy.staticproxy;


public class ProxyImage implements Image {
    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if(realImage==null){
            realImage=new RealImage(filename);
        }
        realImage.display();
        doThing();
    }

    public static void doThing(){
        System.out.println("say hello");
    }
}
