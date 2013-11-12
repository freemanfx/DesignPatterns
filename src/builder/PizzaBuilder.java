package builder;

import java.util.List;

public abstract class PizzaBuilder {
    public abstract List<String> getToppings();
    public abstract List<String> getSauces();

    public Pizza makePizza(){
        Pizza pizza = new Pizza();
        pizza.setName(getPizzaName());

        for(String ingredient: getToppings()){
            pizza.addIngredient(ingredient);
        }

        for(String sauce: getSauces()){
            pizza.addIngredient(sauce);
        }

        return pizza;
    }

    public abstract String getPizzaName();
}
