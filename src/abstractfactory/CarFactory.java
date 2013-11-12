package abstractfactory;

public abstract class CarFactory {

    public static final String COUNTRY = "COUNTRY";
    public static final String ROMANIA = "ROMANIA";
    public static final String GERMANY = "GERMANY";

    abstract LowClassCar makeLowClassCar();
    abstract HighEndCar makeHighEndCar();

    public static CarFactory newInstance(){
        if(System.getProperties().getProperty(COUNTRY).equals(ROMANIA)){
            return new DaciaCarFactory();
        } else {
            return new BMWCarFactory();
        }
    }

}
