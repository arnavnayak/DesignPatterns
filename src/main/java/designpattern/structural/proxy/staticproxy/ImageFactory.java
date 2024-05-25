package designpattern.structural.proxy.staticproxy;

public class ImageFactory {
    /*factory to get image objects from proxy object instead of real object*/
    public static Image getImage(String name) {
        return new ImageProxy(name);
    }
}
