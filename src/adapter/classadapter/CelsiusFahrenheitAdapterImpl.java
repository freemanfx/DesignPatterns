package adapter.classadapter;

import adapter.CelsiusFahrenheitAdapter;
import adapter.CelsiusTemperature;
import adapter.FahrenheitTemperature;

public class CelsiusFahrenheitAdapterImpl extends CelsiusTemperature implements CelsiusFahrenheitAdapter {

    public CelsiusFahrenheitAdapterImpl(int value) {
        super(value);
    }

    public FahrenheitTemperature getFahrenheitTemperature(){
        int fahrenheitTemperature = (int) (getCelsiusDegrees() * (9/5.0) + 32);
        return new FahrenheitTemperature(fahrenheitTemperature);
    }

    @Override
    public CelsiusTemperature getCelsiusTemperature() {
        return new CelsiusTemperature(getCelsiusDegrees());
    }
}
