public enum Regions {
    ЦЕНТР("Центр"),
    ПІВНІЧ ("Північ"),
    ПІВДЕНЬ("Південь"),
    ЗАХІД("Захід"),
    СХІД("Схід");

    private String reg;
    private static Regions[] regionsList = Regions.values();

    Regions(String reg) {
        this.reg = reg;
    }

   static void showRegionsList(){
        for (Regions regNames : regionsList){
            System.out.println(regNames.name());
        }
    }
    static void showRegions(Regions reg){
        switch (reg){
            case ЦЕНТР:
            case ПІВНІЧ:
            case ПІВДЕНЬ:
            case ЗАХІД:
            case СХІД:
                System.out.println("Чудово, Ви обрали: " + reg);
                return;
        }
    }
}
