package decorator;

public class MonthlyPenalty extends PenaltyCostCalculatorDecorator{
    private static final double INTEREST = 0.01;
    private final int months;

    public MonthlyPenalty(CostCalculator costCalculator, int months) {
        super(costCalculator);
        this.months = months;
    }

    @Override
    public double calculate() {
        return super.calculate() + getPenalty();
    }

    private double getPenalty(){
        return months * INTEREST;
    }
}
