package patternAbstractFactory;

public class Application {
    public static void main(String[] args) {
        IVehiculeFactory carFactory = new CarFactory();
        Vehicule car = new Vehicule(carFactory);
        car.move();
        IVehiculeFactory bikeFactory = new BikeFactory();
        Vehicule moto = new Vehicule(bikeFactory);
        moto.move();
    }
}
