package designpattern.structural.proxy.staticproxy;

import java.awt.geom.Point2D;
/*provides metadata like location image functionality
and renders the original image
, a concrete class*/
public class ImageProxy implements Image{

    private String name;
    private BitMapImage image;

    private Point2D location;
    public ImageProxy(String name){
        this.name = name;
    }
    @Override
    public void setLocation(Point2D location) {
        if(image != null){
            image.setLocation(location);
        }else{
            this.location = location;
        }
    }

    @Override
    public Point2D getLocation() {
        if(image != null){
            return getLocation();
        }else{
            return this.location;
        }
    }

    @Override
    public void render() {
        if(image == null){
            image = new BitMapImage(name);
            if(location != null){
                image.setLocation(location);
            }
            image.render();
        }
    }
}
