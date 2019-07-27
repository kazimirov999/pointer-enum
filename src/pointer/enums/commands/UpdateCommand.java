package pointer.enums.commands;

import pointer.enums.foodstore.StoreManager;

public class UpdateCommand extends AbstractCommand {

    public UpdateCommand(StoreManager manager, CommandReader reader) {
        super(manager, reader);
    }

    @Override
    public void execute() {
        if (verify())
            return;

        String name = reader.commandArr()[1];
        float price;
        int quantity;

        try {
            price = Float.parseFloat(reader.commandArr()[2]);
            quantity = Integer.parseInt(reader.commandArr()[3]);
        } catch (Exception e) {
            System.out.println("Wrong data. Use update <food name> <price(float)> <quantity(int)>.");
            return;
        }

        manager.updateFood(name, price, quantity);
    }
}
