package pointer.enums.foodstore;

import pointer.enums.commands.AbstractCommand;
import pointer.enums.commands.Invoker;

import java.util.ArrayList;

public class StoreManager implements Invoker {
    private Store store;

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public void setStore(String storeName) {
        if (storeName != null && storeName != "") {
            this.store = new Store(storeName);
        }
    }

    public void executeCommand(AbstractCommand command) {
        if (command != null) {
            command.execute();
        }
    }

    public Food addFood(FoodType type, String name, float price, int quantity) {
        Food food = new Food(name, type, price, quantity);
        store.addFood(food);
        return food;
    }

    public ArrayList<Food> doSearch(String searchWord) {
        ArrayList<Food> search = new ArrayList<>();

        if (FoodType.isType(searchWord)) {
            FoodType type = FoodType.fromString(searchWord);
            search = store.doSearch(type);
        } else {
            Food food = store.doSearch(searchWord);

            if (food != null)
                search.add(food);
        }

        return search;
    }

    public void updateFood(String name, float price, int quantity) {
        Food food = store.doSearch(name);

        if (food == null) {
            System.out.println("Food store has no product with name: " + name);
            return;
        }

        food.setPrice(price);
        food.setQuantity(quantity);
    }

    public Food removeFood(String name) {
        Food food = store.doSearch(name);
        store.removeFood(food);
        return food;
    }
}
