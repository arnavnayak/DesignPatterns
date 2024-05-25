package designpattern.structural.proxy.dynamicproxy;


import java.awt.*;
import java.awt.geom.Point2D;

public class Client {

    public static void main(String[] args) {
        Image img = ImageFactory.getImage("Dog.png");
        Point2D location = new Point(-10,20);
        img.setLocation(location);
        System.out.println("location of image : "+img.getLocation());
        System.out.println("rendering....");
        img.render();
    }
}
