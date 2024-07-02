package model;

public interface IVendingMachine {
    void addCurrency(int amount);
    int getBalance();

    int endSession();
    String getDescription();
    String[] getProducts();
}
