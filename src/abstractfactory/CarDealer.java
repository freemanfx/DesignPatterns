package abstractfactory;


public class CarDealer {
    public static void main(String[] args) {
        System.getProperties().setProperty(CarFactory.COUNTRY,CarFactory.ROMANIA);

        CarFactory carFactory = CarFactory.newInstance();

        makeAllCarRange(carFactory);

        System.getProperties().setProperty(CarFactory.COUNTRY,CarFactory.GERMANY);

        carFactory = CarFactory.newInstance();
        makeAllCarRange(carFactory);
    }

    private static void makeAllCarRange(CarFactory carFactory) {
        System.out.println("\nCar dealer home country: " + getHomeCountry() );
        HighEndCar highEndCar = carFactory.makeHighEndCar();
        highEndCar.autoPilotDriving();

        LowClassCar lowClassCar = carFactory.makeLowClassCar();
        System.out.println("Our lowClassCar max speed is: "+ lowClassCar.getMaxSpeed());
    }

    public static String getHomeCountry() {
        return System.getProperty(CarFactory.COUNTRY);
    }
}
