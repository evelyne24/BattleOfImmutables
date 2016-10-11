package com.deliveroo.battleofimmutables.model.pojo;

import java.util.List;

/**
 * Created by evelina on 22/10/2016.
 */

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

    private Order(Builder builder) {
        id = builder.id;
        status = builder.status;
        totalPrice = builder.totalPrice;
        customerName = builder.customerName;
        totalTip = builder.totalTip;
        totalCredit = builder.totalCredit;
        rooCharge = builder.rooCharge;
        currency = builder.currency;
        createdAt = builder.createdAt;
        submittedAt = builder.submittedAt;
        deliveryAt = builder.deliveryAt;
        card = builder.card;
        restaurant = builder.restaurant;
        driver = builder.driver;
        items = builder.items;
    }

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalTip() {
        return totalTip;
    }

    public double getTotalCredit() {
        return totalCredit;
    }

    public double getRooCharge() {
        return rooCharge;
    }

    public String getCurrency() {
        return currency;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public Long getSubmittedAt() {
        return submittedAt;
    }

    public Long getDeliveryAt() {
        return deliveryAt;
    }

    public Card getCard() {
        return card;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Driver getDriver() {
        return driver;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (Double.compare(order.totalPrice, totalPrice) != 0) return false;
        if (Double.compare(order.totalTip, totalTip) != 0) return false;
        if (Double.compare(order.totalCredit, totalCredit) != 0) return false;
        if (Double.compare(order.rooCharge, rooCharge) != 0) return false;
        if (createdAt != order.createdAt) return false;
        if (status != null ? !status.equals(order.status) : order.status != null) return false;
        if (customerName != null ? !customerName.equals(order.customerName) : order.customerName != null) return false;
        if (currency != null ? !currency.equals(order.currency) : order.currency != null) return false;

        final Object this$submittedAt = this.getSubmittedAt();
        final Object other$submittedAt = order.getSubmittedAt();
        if (this$submittedAt == null ? other$submittedAt != null : !this$submittedAt.equals(other$submittedAt)) return false;

        //if (submittedAt != null ? !submittedAt.equals(order.submittedAt) : order.submittedAt != null) return false;
        //if (deliveryAt != null ? !deliveryAt.equals(order.deliveryAt) : order.deliveryAt != null) return false;

        final Object this$deliveryAt = this.getDeliveryAt();
        final Object other$deliveryAt = order.getDeliveryAt();
        if (this$deliveryAt == null ? other$deliveryAt != null : !this$deliveryAt.equals(other$deliveryAt)) return false;

        if (card != null ? !card.equals(order.card) : order.card != null) return false;
        if (restaurant != null ? !restaurant.equals(order.restaurant) : order.restaurant != null) return false;
        if (driver != null ? !driver.equals(order.driver) : order.driver != null) return false;
        return items != null ? items.equals(order.items) : order.items == null;

    }

    @Override public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (status != null ? status.hashCode() : 0);
        temp = Double.doubleToLongBits(totalPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        temp = Double.doubleToLongBits(totalTip);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalCredit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(rooCharge);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (int) (createdAt ^ (createdAt >>> 32));
//        result = 31 * result + (submittedAt != null ? submittedAt.hashCode() : 0);
//        result = 31 * result + (deliveryAt != null ? deliveryAt.hashCode() : 0);

        final Object $submittedAt = this.getSubmittedAt();
        result = result * 31 + ($submittedAt == null ? 43 : $submittedAt.hashCode());
        final Object $deliveryAt = this.getDeliveryAt();
        result = result * 31 + ($deliveryAt == null ? 43 : $deliveryAt.hashCode());

        result = 31 * result + (card != null ? card.hashCode() : 0);
        result = 31 * result + (restaurant != null ? restaurant.hashCode() : 0);
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        return result;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("id=").append(id);
        sb.append(", status='").append(status).append('\'');
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", customerName='").append(customerName).append('\'');
        sb.append(", totalTip=").append(totalTip);
        sb.append(", totalCredit=").append(totalCredit);
        sb.append(", rooCharge=").append(rooCharge);
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", createdAt=").append(createdAt);
        sb.append(", submittedAt=").append(submittedAt);
        sb.append(", deliveryAt=").append(deliveryAt);
        sb.append(", card=").append(card);
        sb.append(", restaurant=").append(restaurant);
        sb.append(", driver=").append(driver);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Order copy) {
        Builder builder = new Builder();
        builder.id = copy.id;
        builder.status = copy.status;
        builder.totalPrice = copy.totalPrice;
        builder.customerName = copy.customerName;
        builder.totalTip = copy.totalTip;
        builder.totalCredit = copy.totalCredit;
        builder.rooCharge = copy.rooCharge;
        builder.currency = copy.currency;
        builder.createdAt = copy.createdAt;
        builder.submittedAt = copy.submittedAt;
        builder.deliveryAt = copy.deliveryAt;
        builder.card = copy.card;
        builder.restaurant = copy.restaurant;
        builder.driver = copy.driver;
        builder.items = copy.items;
        return builder;
    }


    public static final class Builder {
        private long id;
        private String status;
        private double totalPrice;
        private String customerName;
        private double totalTip;
        private double totalCredit;
        private double rooCharge;
        private String currency;
        private long createdAt;
        private Long submittedAt;
        private Long deliveryAt;
        private Card card;
        private Restaurant restaurant;
        private Driver driver;
        private List<OrderItem> items;

        private Builder() {
        }

        public Builder id(long val) {
            id = val;
            return this;
        }

        public Builder status(String val) {
            status = val;
            return this;
        }

        public Builder totalPrice(double val) {
            totalPrice = val;
            return this;
        }

        public Builder customerName(String val) {
            customerName = val;
            return this;
        }

        public Builder totalTip(double val) {
            totalTip = val;
            return this;
        }

        public Builder totalCredit(double val) {
            totalCredit = val;
            return this;
        }

        public Builder rooCharge(double val) {
            rooCharge = val;
            return this;
        }

        public Builder currency(String val) {
            currency = val;
            return this;
        }

        public Builder createdAt(long val) {
            createdAt = val;
            return this;
        }

        public Builder submittedAt(Long val) {
            submittedAt = val;
            return this;
        }

        public Builder deliveryAt(Long val) {
            deliveryAt = val;
            return this;
        }

        public Builder card(Card val) {
            card = val;
            return this;
        }

        public Builder restaurant(Restaurant val) {
            restaurant = val;
            return this;
        }

        public Builder driver(Driver val) {
            driver = val;
            return this;
        }

        public Builder items(List<OrderItem> val) {
            items = val;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
