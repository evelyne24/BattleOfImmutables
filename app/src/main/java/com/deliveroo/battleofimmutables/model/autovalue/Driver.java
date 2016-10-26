package com.deliveroo.battleofimmutables.model.autovalue;


import com.deliveroo.battleofimmutables.model.DriverInterface;
import com.google.auto.value.AutoValue;

/**
 * Created by evelina on 23/10/2016.
 */
@AutoValue
public abstract class Driver implements DriverInterface {

    public abstract long id();
    public abstract String name();
    public abstract String contactNumber();

    public static Builder builder() {
        return new AutoValue_Driver.Builder();
    }

    public  Builder copyBuilder() {
        return new AutoValue_Driver.Builder(this);
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder id(long id);
        public abstract Builder name(String name);
        public abstract Builder contactNumber(String contactNumber);
        public abstract Builder registrationNumber(String registrationNumber);

        public abstract Driver build();
    }
}
