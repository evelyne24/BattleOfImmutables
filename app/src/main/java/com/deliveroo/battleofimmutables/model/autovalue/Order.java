package com.deliveroo.battleofimmutables.model.autovalue;

import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;

import java.util.List;

/**
 * Created by evelina on 22/10/2016.
 */
@AutoValue
public abstract class Order {

    public abstract long id();
    public abstract String status();
    public abstract double totalPrice();
    public abstract String customerName();
    public abstract double totalTip();
    public abstract double totalCredit();
    public abstract double rooCharge();
    public abstract String currency();
    public abstract long createdAt();
    @Nullable public abstract Long submittedAt();
    @Nullable public abstract Long deliveryAt();
    public abstract Card card();
    @Nullable public abstract Restaurant restaurant();
    @Nullable public abstract Driver driver();
    public abstract List<OrderItem> items();


    public static Builder builder() {
        return new AutoValue_Order.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder id(long id);
        public abstract Builder status(String status);
        public abstract Builder totalPrice(double totalPrice);
        public abstract Builder customerName(String customerName);
        public abstract Builder totalTip(double totalTip);
        public abstract Builder totalCredit(double totalCredit);
        public abstract Builder rooCharge(double rooCharge);
        public abstract Builder currency(String currency);
        public abstract Builder createdAt(long createdAt);
        public abstract Builder submittedAt(Long submittedAt);
        public abstract Builder deliveryAt(Long deliveryAt);
        public abstract Builder card(Card card);
        public abstract Builder restaurant(Restaurant restaurant);
        public abstract Builder driver(Driver driver);
        public abstract Builder items(List<OrderItem> items);

        public abstract Order build();
    }

    public Builder copyBuilder() {
        return new AutoValue_Order.Builder(this);
    }

//    // auto-value-with extension
//    public abstract Order withStatus(String status);
//
//    // auto-value-gson extension
//    public static TypeAdapter<Order> typeAdapter(Gson gson) {
//        return new GsonTypeAdapter(gson);
//    }


}
