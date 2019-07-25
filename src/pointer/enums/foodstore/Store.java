package pointer.enums.foodstore;

import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<Food> warehouse = new ArrayList<>();

    Store(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Food> getFoods() {
        return warehouse;
    }

    void addFood(Food f) {
        if (f != null) {
            warehouse.add(f);
        }
    }

    Food doSearch(String foodName) {
        for (Food f : warehouse) {
            if (f.getName().equals(foodName)){
                return f;
            }
        }

        return null;
    }

    ArrayList<Food> doSearch(FoodType type) {
        ArrayList<Food> search = new ArrayList<>();

        for (Food f: warehouse) {
            if (f.getType() == type){
                search.add(f);
            }
        }

        return search;
    }

    void removeFood(Food f) {
        if (f != null) {
            warehouse.remove(f);
        }
    }
}