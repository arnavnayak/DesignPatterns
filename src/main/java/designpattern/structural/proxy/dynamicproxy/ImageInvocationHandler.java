package designpattern.structural.proxy.dynamicproxy;

import designpattern.structural.proxy.staticproxy.BitMapImage;

import java.awt.geom.Point2D;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ImageInvocationHandler implements InvocationHandler {

    private BitMapImage image;
    private String name;
    private Point2D location;
    private static final Method setLocationMethod;
    private static final Method getLocationMethod;
    private static final Method renderMethod;

    static {
        try {
            setLocationMethod = Image.class.getMethod("setLocation", new Class[]{Point2D.class});
            getLocationMethod = Image.class.getMethod("getLocation");
            renderMethod = Image.class.getMethod("render");
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    public ImageInvocationHandler(String name){
        this.name = name;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        if(method.equals(setLocationMethod)){
           return handleSetLocation(args);
        }else if(method.equals(getLocationMethod)){
            return handleGetLocation();
        }else if(method.equals(renderMethod)){
            return handleRender();
        }
        return null;
    }

    private Object handleRender() {
        if(image == null){
            image = new BitMapImage(name);
            if(location != null){
                image.setLocation(location);
            }
            image.render();
        }
        return image;
    }

    private Object handleGetLocation() {
        if(image != null){
            return handleGetLocation();
        }else{
            return this.location;
        }
    }

    private Object handleSetLocation(Object[] args) {
        if(image != null){
            image.setLocation((Point2D) args[0]);
        }else{
            this.location = (Point2D) args[0];
        }
        return null;
    }
}
