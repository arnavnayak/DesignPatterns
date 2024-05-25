package designpattern.structural.proxy.staticproxy;
import java.awt.geom.Point2D;
/*provides actual image functionality, a concrete class*/
public class BitMapImage implements Image{
    private String name;
    private Point2D location;

    public BitMapImage(String fileName){
        System.out.println("Loaded from disk : "+fileName);
        this.name = fileName;
    }
    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public Point2D getLocation() {
        return this.location;
    }

    @Override
    public void render() {
        System.out.println("Rendered image : "+this.name);
    }
}
