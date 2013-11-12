package builder;

import java.util.Arrays;
import java.util.List;

public class VeggiePizzaBuilder extends PizzaBuilder {
    @Override
    public List<String> getToppings() {
        return Arrays.asList(Ingredients.MOZZARELLA.toString(), Ingredients.MUSHROOMS.toString(), Ingredients.PEPPERONI.toString());
    }

    @Override
    public List<String> getSauces() {
        return Arrays.asList(Ingredients.KETCHUP.toString());
    }

    @Override
    public String getPizzaName() {
        return "Vegetarian Pizza";
    }
}
