package designpattern.creational.singleton.eagerimpl;

//for creating eager singleton instance
public class EagerRegistry {
    private EagerRegistry(){
        System.out.println("initalizaed eagerly");
    }

    private static final EagerRegistry INSTANCE = new EagerRegistry(); //unlike the lazy initialization here irrespective of getInstance()
                                                                        // is called or not the object is created eagerly

    public static EagerRegistry getInstance(){
        return INSTANCE;
    }

}
