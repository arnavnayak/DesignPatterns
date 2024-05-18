package designpattern.creational.prototype;

import java.awt.*;
import java.awt.geom.Point2D;

public abstract class GameUnit implements Cloneable{

    private Point2D position;

    public GameUnit(){
        position = new Point(0,0);
    }

    public GameUnit(int x, int y){
        position = new Point(x,y);
    }

    public void move(int x, int y){
        position =new Point(x,y);
    }

    public Point2D getPosition(){
        return position;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException{
            GameUnit unit = (GameUnit) super.clone();
            unit.initialize();
            return unit;
    }

    protected void initialize(){
        this.position = new Point(0,0);
        reset();
    }

    protected abstract void reset();

    @Override
    public String toString() {
        return "position=" + position;
    }
}
