package com.deliveroo.battleofimmutables.model.pojo;

/**
 * Created by evelina on 23/10/2016.
 */
public class Restaurant {

    private final String name;
    private final double latitude;
    private final double longitude;

    private Restaurant(Builder builder) {
        name = builder.name;
        latitude = builder.latitude;
        longitude = builder.longitude;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Restaurant copy) {
        Builder builder = new Builder();
        builder.name = copy.name;
        builder.latitude = copy.latitude;
        builder.longitude = copy.longitude;
        return builder;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Restaurant that = (Restaurant) o;

        if (Double.compare(that.latitude, latitude) != 0) return false;
        if (Double.compare(that.longitude, longitude) != 0) return false;
        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(latitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("Restaurant{");
        sb.append("name='").append(name).append('\'');
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append('}');
        return sb.toString();
    }


    public static final class Builder {
        private String name;
        private double latitude;
        private double longitude;

        private Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder latitude(double val) {
            latitude = val;
            return this;
        }

        public Builder longitude(double val) {
            longitude = val;
            return this;
        }

        public Restaurant build() {
            return new Restaurant(this);
        }
    }
}
