package adapter.objectadapter;

import adapter.CelsiusFahrenheitAdapter;
import adapter.CelsiusTemperature;
import adapter.FahrenheitTemperature;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CelsiusFahrenheitAdapterImplTest {


    @Test
    public void testGetFahrenheitTemperature() {
        CelsiusTemperature celsiusTemperature = new CelsiusTemperature(50);

        CelsiusFahrenheitAdapter celsiusFahrenheitAdapter = new CelsiusFahrenheitAdapterImpl(celsiusTemperature);

        FahrenheitTemperature fahrenheitTemperature = celsiusFahrenheitAdapter.getFahrenheitTemperature();

        int expectedFahrenheitTemperature = 122;
        assertEquals(expectedFahrenheitTemperature, fahrenheitTemperature.getFahrenheitDegrees());
        assertEquals(celsiusTemperature, celsiusFahrenheitAdapter.getCelsiusTemperature());
    }
}
