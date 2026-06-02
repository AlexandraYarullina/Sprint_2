package model.service;

import model.Food;

public class ShoppingCart {
    private final Food[] foods;

    public ShoppingCart(Food[] foods){
        this.foods =foods;
    }
    //сумму товаров без скидки
    public Double getTotalWithoutDiscount() {
        double price = 0;
        for (Food food : foods) {
            price += food.getPrice() * food.getAmount();
        }
        return price;
    }
    //сумма товаров со скидкой
    public Double getTotalWithDiscount() {
        double price = 0;
        for (Food food : foods) {
            price += (food.getPrice() - discountSum(food)) * food.getAmount();
        }
        return price;
    }
    //сумма всех вегетарианских продуктов без скидки
    public Double getTotalVegetariansWithoutDiscount() {
        double price = 0;
        for (Food food : foods) {
            if (food.getIsVegetarian()) {
                price += food.getPrice() * food.getAmount();
            }
        }
        return price;
    }

    private double discountSum(Food food) {
        return food.getPrice() / 100 * food.getDiscount();
    }
}

