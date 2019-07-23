package pointer.enums;

import java.util.ArrayList;

public class Store implements Searchable, Editable{
    private String name;
    private ArrayList<Food> warehouse = new ArrayList<>();

    public Store(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Food> getFoods() {
        return warehouse;
    }

    public void addFood(Food f) {
        if (f != null) {
            warehouse.add(f);
        }
    }

    public Food doSearch(String foodName) {
        for (Food f : warehouse) {
            if (f.getName().equals(foodName)){
                return f;
            }
        }

        return null;
    }

    public ArrayList<Food> doSearch(FoodType type) {
        ArrayList<Food> search = new ArrayList<>();

        for (Food f: warehouse) {
            if (f.getType() == type){
                search.add(f);
            }
        }

        return search;
    }

    public void removeFood(Food f) {
        if (f != null && warehouse.contains(f)) {
            warehouse.remove(f);
        }
    }
}
