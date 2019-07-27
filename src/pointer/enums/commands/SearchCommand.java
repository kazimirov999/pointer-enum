package pointer.enums.commands;

import pointer.enums.foodstore.Food;
import pointer.enums.foodstore.StoreManager;

import java.util.ArrayList;

public class SearchCommand extends AbstractCommand {

    public SearchCommand(StoreManager manager, CommandReader reader) {
        super(manager, reader);
    }

    @Override
    public void execute() {
        if (verify())
            return;

        ArrayList<Food> search = manager.doSearch(reader.commandArr()[1]);

        if (search.size() > 0) {
            System.out.println("Search result: " + search);
            return;
        }

        System.out.println("No search result.");
    }
}
