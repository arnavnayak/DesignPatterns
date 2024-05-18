package designpattern.creational.prototype;


// supports cloning
public class SwordsMan extends GameUnit{

    private String state = "idle";

    public void attack(){
        this.state = "attacking";
    }
    @Override
    protected void reset() {
        state = "idle";
    }

    @Override
    public String toString() {
        return "SwordsMan{" +
                "state='" + state + '\'' +
                '}';
    }


}
