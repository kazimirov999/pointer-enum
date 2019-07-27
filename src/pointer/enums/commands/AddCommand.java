package pointer.enums.commands;

import pointer.enums.foodstore.Food;
import pointer.enums.foodstore.FoodType;
import pointer.enums.foodstore.StoreManager;

public class AddCommand extends AbstractCommand {
    public AddCommand(StoreManager manager, CommandReader reader) {
        super(manager, reader);
    }

    @Override
    public void execute() {
        if (verify()) {
            return;
        }

        Food food = null;

        try {
            FoodType type = FoodType.fromString(reader.commandArr()[1]);
            String name = reader.commandArr()[2];
            float price = Float.parseFloat(reader.commandArr()[3]);
            int quantity = Integer.parseInt(reader.commandArr()[4]);
            food = manager.addFood(type, name, price, quantity);
        } catch (Exception e) {
            System.out.println("Wrong data for food: '" + reader.getLine() + "'. Should be <food type> <food name> <price(float)> <quantity(int)");
        }


        if (food != null) {
            System.out.println(food + " is added to store.");
        } else {
            System.out.println("Food is not is added.");
        }
    }
}
