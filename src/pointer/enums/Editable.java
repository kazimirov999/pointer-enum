package pointer.enums;

import java.util.ArrayList;

public interface Editable {
    void addFood(Food f);
    void removeFood(Food f);
    ArrayList<Food> getFoods();

}
