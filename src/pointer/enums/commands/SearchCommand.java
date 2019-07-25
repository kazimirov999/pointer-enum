package pointer.enums.commands;

import pointer.enums.foodstore.Food;
import pointer.enums.foodstore.StoreManager;

import java.util.ArrayList;

public class SearchCommand extends AbstractCommand {
    @Override
    public void execute(StoreManager manager) {
        if (verify(manager))
            return;

        ArrayList<Food> search = manager.doSearch();

        if (search.size() > 0) {
            System.out.println("Search result: " + search);
            return;
        }

        System.out.println("No search result.");
    }
}
