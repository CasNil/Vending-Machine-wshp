package model;

public class Chips implements IProduct {
    private double price;
    private String ProductName;

    @Override
    public String examine() {
        return "";
    }

    @Override
    public String use() {
        return "";
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getProductName() {
        return "";
    }

    @Override
    public void setProductName(String productName) {
        this.ProductName = productName;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}

