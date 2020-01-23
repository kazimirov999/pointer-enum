import com.sun.tools.javac.comp.Resolve;

public enum PhoneShop {
    IPHONE4S("Iphone 4 s"),
    IPHONE5("Iphone 5"),
    IPHONE8PLUS("Iphone 8 Plus"),
    LENOVOK4000("Lenovo K4000"),
    SAMSUNGS9("Samsung s 9"),
    MEIZUM3NOTE("Meizu m 3 NOTE");


    private String phoneName;
    private static PhoneShop[] phoneShops = PhoneShop.values();

    PhoneShop(String phoneName) {
        this.phoneName = phoneName;
    }

    @Override
    public String toString() {
        return phoneName;
    }

    static void showPhoneList() {
        for (PhoneShop phoneNames : phoneShops) {
            System.out.println(phoneNames.name());
        }
    }

    static void showPhone(PhoneShop phoneName) {
        switch (phoneName) {
            case IPHONE4S:
                System.out.println(phoneName.toString());
                return;
            case IPHONE5:
                System.out.println(phoneName.toString());
                return;
            case IPHONE8PLUS:
                System.out.println(phoneName.toString());
                return;
            case LENOVOK4000:
                System.out.println(phoneName.toString());
                return;
            case SAMSUNGS9:
                System.out.println(phoneName.toString());
            case MEIZUM3NOTE:
                System.out.println(phoneName.toString());
                return;
        }
    }
}
