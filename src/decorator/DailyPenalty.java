package decorator;

public class DailyPenalty extends PenaltyCostCalculatorDecorator {
    private final int days;
    private static final double INTEREST = 0.001;

    public DailyPenalty(CostCalculator costCalculator, int days) {
        super(costCalculator);
        this.days = days;
    }

    @Override
    public double calculate() {
        return super.calculate() + getPenalty();
    }

    private double getPenalty() {
        return days * INTEREST;
    }
}
