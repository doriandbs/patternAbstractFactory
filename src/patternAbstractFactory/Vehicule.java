package patternAbstractFactory;

public class Vehicule {
    private IWheel wheel;
    private IHandle handle;
    public Vehicule(IVehiculeFactory factory){
        this.wheel = factory.createWheel();
        this.handle = factory.createHandle();
    }
    public void move(){
        wheel.turn();
        handle.move();
    }
}
