package designpattern.creational.singleton.lazyimpl.withoutmultithread;

//singleton pattern using lazy initialization holder class. this ensures that we have a lazy initialization without worrying about syncronization
public class LazyRegistryIODH {

    private LazyRegistryIODH(){ // private takes care of any object creation and also inheritance confinement
        System.out.println("initialized lazily");
    }

    private static class RegistryHolder{  // so as this is in inner class unless and until someone calls the getInstance()
                                        // the object won't be created hence lazily created unlike the eager object creation
        static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
    }

    public static LazyRegistryIODH getInstance(){
        return RegistryHolder.INSTANCE;
    }
}
