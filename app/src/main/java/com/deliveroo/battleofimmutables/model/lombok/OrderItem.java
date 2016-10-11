package com.deliveroo.battleofimmutables.model.lombok;

/**
 * Created by evelina on 23/10/2016.
 */
@lombok.Value
@lombok.Builder(toBuilder = true)
public class OrderItem {

    private final String dishName;
    private final int quantity;
    private final double price;
}
