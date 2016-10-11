package com.deliveroo.battleofimmutables.model.autovalue;


import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Card {

    public abstract String number();
    public abstract String expiryDate();
    public abstract int cvc();
    public abstract String nameOnCard();

    public static Builder builder() {
        return new AutoValue_Card.Builder();
    }

    public Builder copyBuilder() {
        return new AutoValue_Card.Builder(this);
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder number(String number);
        public abstract Builder expiryDate(String expiryDate);
        public abstract Builder cvc(int cvc);
        public abstract Builder nameOnCard(String nameOnCard);
        public abstract Card build();
    }
}