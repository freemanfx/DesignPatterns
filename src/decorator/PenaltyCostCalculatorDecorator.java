package decorator;


public abstract class PenaltyCostCalculatorDecorator implements CostCalculator{

    private final CostCalculator costCalculator;

    public PenaltyCostCalculatorDecorator(CostCalculator costCalculator){
        this.costCalculator = costCalculator;
    }

    @Override
    public double calculate() {
        return costCalculator.calculate();
    }
}
