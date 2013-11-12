package builder;

import java.util.Arrays;
import java.util.List;


public class CarnivorePizzaBuilder extends PizzaBuilder {
    @Override
    public List<String> getToppings() {
        return Arrays.asList(Ingredients.PEPPERONI.toString(), Ingredients.SAUSAGES.toString(), Ingredients.MOZZARELLA.toString());
    }

    @Override
    public List<String> getSauces() {
        return Arrays.asList(Ingredients.GARLIC.toString(), Ingredients.KETCHUP.toString());
    }

    @Override
    public String getPizzaName() {
        return "Carnivore Pizza";
    }
}
