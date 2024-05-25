package designpattern.structural.proxy.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ImageFactory {
    /*factory to get image objects from proxy object instead of real object*/
    public static Image getImage(String name) {
        return (Image) Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[]{Image.class}, new ImageInvocationHandler(name));
    }
}
