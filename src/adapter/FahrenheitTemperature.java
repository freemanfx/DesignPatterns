package adapter;

public class FahrenheitTemperature {

    private int value;

    public FahrenheitTemperature(int value){
        this.value = value;
    }

    public int getFahrenheitDegrees(){
      return value;
    }
}
