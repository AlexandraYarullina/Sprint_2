package model;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    protected Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }
    //возвращает количество продукта в килограммах
    public int getAmount() {
        return amount;
    }
    //возвращает цену за единицу
    public double getPrice() {
        return price;
    }

    //возвращает true или false, если продукт вегетарианский
    public boolean getIsVegetarian() {
        return isVegetarian;
    }
}
