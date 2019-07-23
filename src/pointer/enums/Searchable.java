package pointer.enums;

import java.util.ArrayList;

public interface Searchable {
    Food doSearch(String foodName);
    ArrayList<Food> doSearch(FoodType type);
    ArrayList<Food> getFoods();
}
