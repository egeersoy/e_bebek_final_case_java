package e_bebek_final;

public enum Brand {
    Samsung, Lenovo, Apple, Huawei, Casper, Asus, HP, Xiaomi, Monster;

    public static Brand fromString(String text) {
        for (Brand brand: Brand.values()) {
            if (brand.name().equalsIgnoreCase(text)) {
                return brand;
            }
        }
        return null;
    }
}
