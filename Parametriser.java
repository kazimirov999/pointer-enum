public enum Parametriser {
    APPLE("iOS"), BLACKBERRY("Android"), LG("Android"), SAMSUNG("Android"), SONY("Android"), ZTE("Android");
    private String str;

    Parametriser(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    static {
        System.out.println("Вивести список моделей смартфонів із операційною системою у наявності: ");
    }

    static void checking () {
        for (Parametriser n : Parametriser.values()) {
            System.out.println(n + " " + n.ordinal() + " " + n.getStr());
        }
     }
     static void counter(String i) {
         for (Parametriser j : Parametriser.values()) {
             System.out.println("Диспозиція заданої моделі по відношенню до заданої ->");
             System.out.println(j.compareTo(Parametriser.valueOf(i)));
         }
     }
}