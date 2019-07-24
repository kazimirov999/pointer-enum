package pointer.enums.foodstore;

import pointer.enums.commands.*;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreManager {
    private Scanner scanner;
    private Store store;
    private String line;
    private FoodStoreFactory storeFactory = new FoodStoreFactory();

    public StoreManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public void setStore() {
        this.store = storeFactory.getStore(line);
    }

    public String nextLine() {
        return (line = scanner.nextLine());
    }

    public String[] commandArr() {
        return line.split(" ");
    }

    public void execute(AbstractCommand command) {
        if (command != null) {
            command.execute(this);
        }
    }

    public ArrayList<Food> doSearch() {
        ArrayList<Food> search = new ArrayList<>();

        if (FoodType.isType(commandArr()[1])) {
            FoodType type = FoodType.fromString(commandArr()[1]);
            search = store.doSearch(type);
        } else {
            Food food = store.doSearch(commandArr()[1]);

            if (food != null)
                search.add(food);
        }

        return search;
    }

    public void updateFood() {
        Food food = store.doSearch(commandArr()[1]);
        storeFactory.updateFood(food, commandArr());
    }

    public Food addFood() {
        Food food = storeFactory.getFood(commandArr());
        store.addFood(food);
        return food;
    }

    public Food removeFood() {
        Food food = store.doSearch(commandArr()[1]);
        store.removeFood(food);
        return food;
    }

    public void close() {
        scanner.close();
    }
}
