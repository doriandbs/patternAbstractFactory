package patternAbstractFactory;

public class BikeFactory implements IVehiculeFactory{
    @Override
    public IWheel createWheel() {
        return new BikeWheel();
    }

    @Override
    public IHandle createHandle() {
         return new BikeHandle();
    }
}
