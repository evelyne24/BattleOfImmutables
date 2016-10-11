package com.deliveroo.battleofimmutables.model.autovalue;


import com.google.auto.value.AutoValue;

/**
 * Created by evelina on 23/10/2016.
 */
@AutoValue
public abstract class Restaurant {

    public abstract String name();
    public abstract double latitude();
    public abstract double longitude();

    public static Builder builder() {
        return new AutoValue_Restaurant.Builder();
    }

    public Builder copyBuilder() {
        return new AutoValue_Restaurant.Builder(this);
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder name(String name);
        public abstract Builder latitude(double latitude);
        public abstract Builder longitude(double longitude);

        public abstract Restaurant build();
    }
}
