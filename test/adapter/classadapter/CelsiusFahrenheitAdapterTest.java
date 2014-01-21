package adapter.classadapter;

import adapter.CelsiusTemperature;
import adapter.FahrenheitTemperature;

import static junit.framework.Assert.assertEquals;

public class CelsiusFahrenheitAdapterTest {
    @org.junit.Test
    public void testGetFahrenheitTemperature() {
       CelsiusTemperature celsiusTemperature = new CelsiusTemperature(100);

        CelsiusFahrenheitAdapterImpl celsiusFahrenheitAdapter = new CelsiusFahrenheitAdapterImpl(celsiusTemperature.getCelsiusDegrees());

        FahrenheitTemperature fahrenheitTemperature = celsiusFahrenheitAdapter.getFahrenheitTemperature();

        assertEquals(fahrenheitTemperature.getFahrenheitDegrees(), 212);
    }
}
