package e_bebek_final;

public class MobilePhone {
    private String id;

    private Brand brand;
    private int unitPrice;
    private double discountRate;
    private int stock;
    private String productName;
    private int storage;
    private double screenSize;
    private int batterPower;
    private int ram;
    private String color;

    public MobilePhone() {}

    public MobilePhone(String id, Brand brand, int unitPrice, double discountRate, int stock, String productName, int storage, double screenSize, int batterPower, int ram, String color) {
        this.id = id;
        this.brand = brand;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stock = stock;
        this.productName = productName;
        this.storage = storage;
        this.screenSize = screenSize;
        this.batterPower = batterPower;
        this.ram = ram;
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatterPower() {
        return batterPower;
    }

    public void setBatterPower(int batterPower) {
        this.batterPower = batterPower;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "id='" + id + '\'' +
                ", unitPrice=" + unitPrice +
                ", discountRate=" + discountRate +
                ", stock=" + stock +
                ", productName='" + productName + '\'' +
                ", storage=" + storage +
                ", screenSize=" + screenSize +
                ", batterPower=" + batterPower +
                ", ram=" + ram +
                ", color='" + color + '\'' +
                '}';
    }
}
