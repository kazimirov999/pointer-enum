package pointer.enums.foodstore;

import java.util.Arrays;

public class FoodStoreFactory {

    public Food getFood(String[] arr) {
        if (arr.length == 1){
            return null;
        }

        try {
            FoodType type = FoodType.fromString(arr[1]);
            String name = arr[2];
            float price = Float.parseFloat(arr[3]);
            int qty = Integer.parseInt(arr[4]);
            return new Food(name, type, price, qty);
        } catch (Exception e) {
            System.out.println("Wrong data for food: '" + String.join(" ",arr) + "'. Should be <food type> <food name> <price(float)> <quantity(int)");
        }

        return null;
    }

    public void updateFood(Food food, String[] arr) {
        if (food == null) {
            System.out.println("foodstore has no product with name: "+ arr[1]);
            return;
        }

        try {
            float price = Float.parseFloat(arr[2]);
            int qty = Integer.parseInt(arr[3]);
            food.setPrice(price);
            food.setQuantity(qty);
        } catch (Exception e) {
            System.out.println("Wrong data. Use update <food name> <price(float)> <quantity(int)>.");
            return;
        }

        System.out.println("Food is updated: " + food);
        return;
    }

    public Store getStore(String name) {
        if (name != null && name != "") {
            System.out.println("Food types: " + Arrays.toString(FoodType.values()) +
                    "\nUse 'done' when finish. \nUse add <food type> <food name> <price> <quantity>:");
            return new Store(name);
        }

        System.exit(0);
        return null;
    }
}
