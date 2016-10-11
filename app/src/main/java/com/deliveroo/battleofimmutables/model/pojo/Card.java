package com.deliveroo.battleofimmutables.model.pojo;

/**
 * Created by evelina on 23/10/2016.
 */

public class Card {

    private final String number;
    private final String expiryDate;
    private final int cvc;
    private final String nameOnCard;

    private Card(Builder builder) {
        number = builder.number;
        expiryDate = builder.expiryDate;
        cvc = builder.cvc;
        nameOnCard = builder.nameOnCard;
    }

    public String getNumber() {
        return number;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getCvc() {
        return cvc;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (cvc != card.cvc) return false;
        if (number != null ? !number.equals(card.number) : card.number != null) return false;
        if (expiryDate != null ? !expiryDate.equals(card.expiryDate) : card.expiryDate != null) return false;
        return nameOnCard != null ? nameOnCard.equals(card.nameOnCard) : card.nameOnCard == null;

    }

    @Override public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (expiryDate != null ? expiryDate.hashCode() : 0);
        result = 31 * result + cvc;
        result = 31 * result + (nameOnCard != null ? nameOnCard.hashCode() : 0);
        return result;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("number='").append(number).append('\'');
        sb.append(", expiryDate='").append(expiryDate).append('\'');
        sb.append(", cvc=").append(cvc);
        sb.append(", nameOnCard='").append(nameOnCard).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Card copy) {
        Builder builder = new Builder();
        builder.number = copy.number;
        builder.expiryDate = copy.expiryDate;
        builder.cvc = copy.cvc;
        builder.nameOnCard = copy.nameOnCard;
        return builder;
    }


    public static final class Builder {
        private String number;
        private String expiryDate;
        private int cvc;
        private String nameOnCard;

        private Builder() {
        }

        public Builder number(String val) {
            number = val;
            return this;
        }

        public Builder expiryDate(String val) {
            expiryDate = val;
            return this;
        }

        public Builder cvc(int val) {
            cvc = val;
            return this;
        }

        public Builder nameOnCard(String val) {
            nameOnCard = val;
            return this;
        }

        public Card build() {
            return new Card(this);
        }
    }
}
