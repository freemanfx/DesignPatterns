package builder;

public class PizzaHut {
    public static void main(String[] args) {
        System.out.println("Pizza order:" );

        Pizza firstPizza = new VeggiePizzaBuilder().makePizza();
        firstPizza.describePizza();

        Pizza secondPizza = new CarnivorePizzaBuilder().makePizza();
        secondPizza.describePizza();

    }
}
