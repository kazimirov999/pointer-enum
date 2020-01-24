package src;

public enum Shop {
    CHERRY("CHERRY", 50, 5),
    ORANGE("ORANGE", 40, 6),
    STRAWBERRY("STRAWBERRY", 30, 7),
    LEMON("LEMON", 20, 8),
    PEAR("PEAR", 10, 9);
    private String fruits;
    private int weight;
    private int coast;

    Shop(String fruits, int weight, int coast) {
        this.coast = coast;
        this.fruits = fruits;
        this.weight = weight;
    }

    public String toString() {
        return fruits;
    }

    static void giveFruits() {
        for (Shop fruits : Shop.values()) {
            System.out.println(fruits.name());
        }
    }

    static void showYourFruit(Shop fruits) {
        switch (fruits) {
            case PEAR:
            case LEMON:
            case CHERRY:
            case ORANGE:
            case STRAWBERRY:
                System.out.println("You want" + fruits.toString() + " OUR SHOP can to give you some:" + fruits.weight + " kg" + "  for   " + fruits.coast + " grn/kg");
                break;
        }
    }


}
