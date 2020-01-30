public enum TypeJava {
    JAVACARD("Java Card"),
    JAVAENTERPRISEEDITION("Java Enterprise Edition"),
    JAVAMICRIEDITION("Java Micro Edition"),
    JAVASTANDARDEDITION("Java Standard Edition");

    private String javaPlatformClassification;
    private static TypeJava[] typeJavas = TypeJava.values();


    TypeJava(String javaPlatformClassification) {
        this.javaPlatformClassification = javaPlatformClassification;
    }

    @Override
    public String toString() {
        return javaPlatformClassification;
    }

    static void javaPlatform() {
        for (TypeJava javaNames : typeJavas) {
            System.out.println(javaNames.name());
        }
    }

    static void showJavaPlatform(TypeJava javaPlatformClassification) {
        switch (javaPlatformClassification) {
            case JAVASTANDARDEDITION:
                System.out.println(javaPlatformClassification.toString());
                return;
            case JAVACARD:
                System.out.println(javaPlatformClassification.toString());
                return;
            case JAVAMICRIEDITION:
                System.out.println(javaPlatformClassification.toString());
                return;
            case JAVAENTERPRISEEDITION:
                System.out.println(javaPlatformClassification.toString());
                return;
        }
    }
}
