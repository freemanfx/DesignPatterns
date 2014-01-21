package decorator;

public class NormalCostCalculator implements CostCalculator{
    private final double cost;

    public NormalCostCalculator(double cost){
        this.cost = cost;
    }
    @Override
    public double calculate() {
        return cost;
    }
}
