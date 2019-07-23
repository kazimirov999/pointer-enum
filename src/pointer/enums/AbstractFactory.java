package pointer.enums;

public abstract class AbstractFactory {
    public abstract Food getFood(String line);

    public abstract void updateFood(Food food, String[] arr);

    public abstract Store getStore(String store);
}
