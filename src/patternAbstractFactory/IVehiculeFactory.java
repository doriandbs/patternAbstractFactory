package patternAbstractFactory;

public interface IVehiculeFactory {
    IWheel createWheel();
    IHandle createHandle();
}
