package abstractfactory;

public class BMWCarFactory extends CarFactory {
    @Override
    LowClassCar makeLowClassCar() {
        return new X1();
    }

    @Override
    HighEndCar makeHighEndCar() {
        return new X6();
    }
}
