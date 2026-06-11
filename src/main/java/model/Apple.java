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
    //Для красных яблок (colour равно "red") скидка должна быть равна 60%: соответствующий метод возвращает значение 60.
    @Override
    public double getDiscount() {
        return Objects.equals(color, RED) ?
                DISCOUNT_FOR_RED_APPLE : 0;
    }
}
