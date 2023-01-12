package patternAbstractFactory;

public class CarWheel implements IWheel{
    @Override
    public void turn() {
        System.out.println("the 4 wheels are turning properly");
    }
}
