package patternAbstractFactory;

public class CarFactory implements IVehiculeFactory{
    @Override
    public IWheel createWheel() {
        return new CarWheel();
    }

    @Override
    public IHandle createHandle() {
        return new CarHandle();
    }
}
