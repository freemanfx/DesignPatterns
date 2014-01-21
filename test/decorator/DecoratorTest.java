package decorator;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class DecoratorTest {
    @Test
    public void testDecorator(){
        CostCalculator invoiceNotPaid = new NormalCostCalculator(100);
        Assertions.assertThat(invoiceNotPaid.calculate()).isEqualTo(100.006);

        invoiceNotPaid = new MonthlyPenalty(invoiceNotPaid, 6);
        invoiceNotPaid = new DailyPenalty(invoiceNotPaid, 10);

        System.out.println(invoiceNotPaid.calculate());

        CostCalculator totalToPay = new DailyPenalty(new MonthlyPenalty(new NormalCostCalculator(100),6), 10);
        System.out.println(totalToPay.calculate());
    }
}
