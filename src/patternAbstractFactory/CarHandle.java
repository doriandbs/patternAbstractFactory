package patternAbstractFactory;

public class CarHandle implements IHandle{
    @Override
    public void move() {
        System.out.println("the car has 2 doors");
    }
}
