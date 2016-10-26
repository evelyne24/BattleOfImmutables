package com.deliveroo.battleofimmutables.model.lombok;

import com.deliveroo.battleofimmutables.model.DriverInterface;

/**
 * Created by evelina on 23/10/2016.
 */
@lombok.Value
@lombok.Builder(toBuilder = true)
public class Driver implements DriverInterface {

    private final long id;
    private final String name;
    private final String contactNumber;
    private final String registrationNumber;

    @Override public String registrationNumber() {
        return registrationNumber;
    }
}
