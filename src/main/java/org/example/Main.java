package org.example;

import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;
import model.constants.Color;

public class Main
{
    public static void main( String[] args )
    {
        Food meat = new Meat(5, 100.0);
        //Мясо в количестве 5 кг по цене 100 рублей за кг;
        System.out.println("Мясо в количестве " + meat.getAmount() + " кг по цене " + meat.getPrice() + " рублей за кг;");
        // Яблоки красные в количестве 10 кг по цене 50 рублей;
        Food appleRed = new Apple(10, 50.0, Color.RED);
        System.out.println("Яблоки красные в количестве " + appleRed.getAmount() + " кг по цене " + appleRed.getPrice() + " рублей за кг;");
        double discount = appleRed.getDiscount();
        System.out.println("Для красных яблок скидка равна " + discount + " %");
        //Яблоки зелёные в количестве 8 кг по цене 60 рублей.
        Food appleGreen = new Apple(8, 60, Color.GREEN);
        System.out.println("Яблоки зелёные в количестве " + appleGreen.getAmount() + " кг по цене " + appleGreen.getPrice() + " рублей за кг;");

        //Массив продуктов из этих элементов
        Food[] foods = {meat, appleRed, appleGreen};

        ShoppingCart shoppingCart = new ShoppingCart(foods);
        System.out.println("Сумма товаров без скидки: " + shoppingCart.getTotalWithoutDiscount());
        System.out.println("Сумма товаров со скидкой: " + shoppingCart.getTotalWithDiscount());
        System.out.println("Сумма вегетарианских товаров без скидки: " + shoppingCart.getTotalVegetariansWithoutDiscount());
    }
}
