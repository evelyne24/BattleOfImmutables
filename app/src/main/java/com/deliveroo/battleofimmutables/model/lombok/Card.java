package com.deliveroo.battleofimmutables.model.lombok;

/**
 * Created by evelina on 23/10/2016.
 */
@lombok.Value()
@lombok.Builder(toBuilder = true)
public class Card {

    private final String number;
    private final String expiryDate;
    private final int cvc;
    private final String nameOnCard;
}
