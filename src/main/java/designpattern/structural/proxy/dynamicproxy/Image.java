package designpattern.structural.proxy.dynamicproxy;

import java.awt.geom.Point2D;

/*
* Interface to be implmented by proxy and concrete objects*/
public interface Image {

    public void setLocation(Point2D location);

    public Point2D getLocation();

    public void render();
}
