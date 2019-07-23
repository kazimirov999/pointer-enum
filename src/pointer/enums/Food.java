package pointer.enums;

public class Food {
    private String name;
    private FoodType type;
    private int quantity;
    private float price;

    public Food(String n, FoodType type, float price, int qty) {
        name = n;
        this.type = type;
        setPrice(price);
        setQuantity(qty);
    }

    public String getName() {
        return name;
    }

    public FoodType getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void setQuantity(int qty) {
        if (qty >= 0) {
            quantity = qty;
        }
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
