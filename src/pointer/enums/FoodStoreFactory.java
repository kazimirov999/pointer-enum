package pointer.enums;

public class FoodStoreFactory extends AbstractFactory {
    @Override
    public Food getFood(String line) {
        String[] arr = line.split(" ");

        if (arr.length == 1){
            return null;
        }

        try {
            FoodType type = FoodType.fromString(arr[0]);
            String name = arr[1];
            float price = Float.parseFloat(arr[2]);
            int qty = Integer.parseInt(arr[3]);
            return new Food(name, type, price, qty);
        } catch (Exception e) {
            System.out.println("Wrong data for food: '" + line + "'. Should be <food type> <food name> <price(float)> <quantity(int)");
        }

        return null;
    }

    @Override
    public void updateFood(Food food, String[] arr) {
        if (food == null) {
            System.out.println("Store has no product with name: "+ arr[1]);
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

    @Override
    public Store getStore(String name) {
        if (name != null && name != "") {
            return new Store(name);
        }

        return null;
    }
}
