
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    
    //Adds a meal based off of the parameter given
    public void addMeal(String meal) {
        if(!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }
    
    //Prints out every meal within the list
    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }
    
    //Cleas the menu of all items
    public void clearMenu() {
        this.meals.clear();
    }
}
