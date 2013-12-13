package adapter.objectadapter;

import adapter.CelsiusFahrenheitAdapter;
import adapter.CelsiusTemperature;
import adapter.FahrenheitTemperature;

public class CelsiusFahrenheitAdapterImpl implements CelsiusFahrenheitAdapter{

    private final CelsiusTemperature celsiusTemperature;

    public CelsiusFahrenheitAdapterImpl(CelsiusTemperature celsiusTemperature){
        this.celsiusTemperature = celsiusTemperature;
    }

    @Override
    public FahrenheitTemperature getFahrenheitTemperature() {
        return new FahrenheitTemperature((int)(celsiusTemperature.getCelsiusDegrees() * (9/5.0) + 32));
}

    @Override
    public CelsiusTemperature getCelsiusTemperature() {
        return celsiusTemperature;
    }
}
