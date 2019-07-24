package pointer.enums.foodstore;

public enum FoodType {
    VEGETABLE,
    FRUIT,
    MEAT,
    DRINK;

    public static FoodType fromString(String value) {
        return valueOf(value.toUpperCase());
    }

    public static boolean isType(String value) {
        String upValue = value.toUpperCase();

        for (FoodType f : values()) {
            if (f.name().equals(upValue) ) {
                return true;
            }
        }

        return false;
    }
}
