package e_bebek_final;

public class NoteBook {
    private String id;
    private Brand brand;
    private double unitPrice;
    private double discountRate;
    private int stock;
    private String productName;
    private int ram;
    private int storage;
    private double screenSize;

    public NoteBook() {}

    public NoteBook(String id,Brand brand, double unitPrice, double discountRate, int stock, String productName, int ram, int storage, double screenSize) {
        this.id = id;
        this.brand = brand;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stock = stock;
        this.productName = productName;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
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
}
