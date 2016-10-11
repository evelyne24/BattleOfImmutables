package com.deliveroo.battleofimmutables.model.lombok;

import java.util.List;

/**
 * Created by evelina on 22/10/2016.
 */

@lombok.Value
@lombok.Builder(toBuilder = true)
public class Order {
    private final long id;
    private final String status;
    private final double totalPrice;
    private final String customerName;
    private final double totalTip;
    private final double totalCredit;
    private final double rooCharge;
    private final String currency;
    private final long createdAt;
    private final Long submittedAt;
    private final Long deliveryAt;
    private final Card card;
    private final Restaurant restaurant;
    private final Driver driver;
    private final List<OrderItem> items;
}