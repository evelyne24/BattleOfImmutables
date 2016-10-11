package com.deliveroo.battleofimmutables.model.pojo;

/**
 * Created by evelina on 23/10/2016.
 */
public class Driver {

    private final long id;
    private final String name;
    private final String contactNumber;

    public String getContactNumber() {
        return contactNumber;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        if (id != driver.id) return false;
        if (name != null ? !name.equals(driver.name) : driver.name != null) return false;
        return contactNumber != null ? contactNumber.equals(driver.contactNumber) : driver.contactNumber == null;

    }

    @Override public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (contactNumber != null ? contactNumber.hashCode() : 0);
        return result;
    }

    @Override public String toString() {
        final StringBuilder sb = new StringBuilder("Driver{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", contactNumber='").append(contactNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Driver(long id, String name, String contactNumber) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Driver copy) {
        Builder builder = new Builder();
        builder.id = copy.id;
        builder.name = copy.name;
        builder.contactNumber = copy.contactNumber;
        return builder;
    }


    public static final class Builder {
        private long id;
        private String name;
        private String contactNumber;

        private Builder() {
        }

        public Builder id(long val) {
            id = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder contactNumber(String val) {
            contactNumber = val;
            return this;
        }

        public Driver build() {
            return new Driver(id, name, contactNumber);
        }
    }
}
