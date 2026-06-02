package model;

import java.util.Objects;

import static model.constants.Color.RED;
import static model.constants.Discount.DISCOUNT_FOR_RED_APPLE;

public class Apple extends Food{
    private final String color;

    public Apple( int amount, double price, String color){
        super(amount,price);
        this.color=color;
        this.isVegetarian=true;
    }

    private String getColor(){
        return color;
    }

    @Override
    public double getDiscount() {
        return Objects.equals(color, RED) ?
                DISCOUNT_FOR_RED_APPLE : 0;
    }
}
