package designpattern.creational.prototype;


// donot support cloning
public class General extends GameUnit{

    private String state = "idle";

    public void boostMorale(){
        this.state ="Moral boost";

    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("reset not supported for general");
    }

    @Override
    public String toString() {
        return "General{" +
                "state='" + state + '\'' +
                '}';
    }
}
