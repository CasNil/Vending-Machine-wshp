package model;

public class VendingMachine implements IVendingMachine {
    private int depositPool;

    @Override
    public void addCurrency(int amount) {
        int[] acceptedAmount = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};

        boolean isValidAmount = false;
        for (int validAmount : acceptedAmount) {
            if (amount == validAmount) {
                isValidAmount = true;
                break;
            }
        }
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
