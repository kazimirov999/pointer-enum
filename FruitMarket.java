public enum FruitMarket {
    APPLE("Apple", 100, 0.5),
    ORANGE("Orange", 50, 2.2),
    BANANA("Banana", 200, 1.5),
    APRICOT("Apricot", 340, 2.5),
    KIWI("Kiwi", 85, 3),
    LEMON("Lemon", 98, 0.8),
    MANGO("Mango", 120, 3.6);


    private String fruits;
    private  float quantity;
    private  double price;



    FruitMarket(String fruits, float quantity, double price) {
        this.fruits = fruits;
        this.quantity = quantity;
        this.price = price;

    }




    public String toString() {
        return fruits;
    }

    static void showFruits() {
        for (FruitMarket fruits : FruitMarket.values()) {
            System.out.println(fruits.name());
        }

    }


    static void showChosenFruit(FruitMarket fruits) {
        switch (fruits) {
            case APPLE:
            case ORANGE:
            case BANANA:
            case APRICOT:
            case KIWI:
            case LEMON:
            case MANGO:
                System.out.println(" You picked " + fruits.toString() + ", we have " + fruits.quantity + "(kg.) our price:" + fruits.price + "$ per(kg.) ");
                break;

        }


    }


}