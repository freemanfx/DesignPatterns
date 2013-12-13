package adapter;

public class CelsiusTemperature {

    public CelsiusTemperature(int value){
        this.value = value;
    }

    private int value;

    public int getCelsiusDegrees(){
        return value;
    }
}
