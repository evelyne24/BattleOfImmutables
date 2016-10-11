package com.deliveroo.battleofimmutables.model.autovalue;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

/**
 * Created by evelina on 23/10/2016.
 */
@AutoValue
public abstract class OrderItem implements Parcelable {

    public abstract String dishName();
    public abstract int quantity();
    public abstract double price();

    public static Builder builder() {
        return new AutoValue_OrderItem.Builder();
    }

    public Builder copyBuilder() {
        return new AutoValue_OrderItem.Builder(this);
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder dishName(String dishName);
        public abstract Builder quantity(int quantity);
        public abstract Builder price(double price);

        public abstract OrderItem build();
    }
}
