package builder;


import java.util.LinkedList;
import java.util.List;

public class Pizza {
    private List<String> ingredients = new LinkedList<String>();
    private String name;

    public void describePizza() {
        System.out.println(getName()+ " has: ");
        for (String ingredient : ingredients) {
            System.out.println(" - " + ingredient);
        }
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
