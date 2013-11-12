package abstractfactory;

public class DaciaCarFactory extends CarFactory {
    @Override
    LowClassCar makeLowClassCar() {
        return new Logan();
    }

    @Override
    HighEndCar makeHighEndCar() {
        return new Stepway();
    }
}
