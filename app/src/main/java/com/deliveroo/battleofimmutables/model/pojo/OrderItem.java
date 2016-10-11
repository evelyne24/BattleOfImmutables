package com.deliveroo.battleofimmutables.model.pojo;

/**
 * Created by evelina on 23/10/2016.
 */
public class OrderItem {

    private final String dishName;
    private final int quantity;
    private final double price;

    private OrderItem(Builder builder) {
        dishName = builder.dishName;
        quantity = builder.quantity;
        price = builder.price;
    }


    public String getDishName() {
        return dishName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItem orderItem = (OrderItem) o;

        if (quantity != orderItem.quantity) return false;
        if (Double.compare(orderItem.price, price) != 0) return false;
        return dishName != null ? dishName.equals(orderItem.dishName) : orderItem.dishName == null;

    }

    @Override public int hashCode() {
        int result;
        long temp;
        result = dishName != null ? dishName.hashCode() : 0;
        result = 31 * result + quantity;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("OrderItem{");
        sb.append("dishName='").append(dishName).append('\'');
        sb.append(", quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrderItem copy) {
        Builder builder = new Builder();
        builder.dishName = copy.dishName;
        builder.quantity = copy.quantity;
        builder.price = copy.price;
        return builder;
    }

    public static final class Builder {
        private String dishName;
        private int quantity;
        private double price;

        private Builder() {
        }

        public Builder dishName(String val) {
            dishName = val;
            return this;
        }

        public Builder quantity(int val) {
            quantity = val;
            return this;
        }

        public Builder price(double val) {
            price = val;
            return this;
        }

        public OrderItem build() {
            return new OrderItem(this);
        }
    }
}
