package patternAbstractFactory;

public class BikeWheel implements IWheel{

    @Override
    public void turn() {
        System.out.println("the 2 wheels are turning properly");
    }
}
