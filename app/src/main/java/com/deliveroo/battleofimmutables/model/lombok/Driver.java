package com.deliveroo.battleofimmutables.model.lombok;

/**
 * Created by evelina on 23/10/2016.
 */
@lombok.Value
@lombok.Builder(toBuilder = true)
public class Driver {

    private final long id;
    private final String name;
    private final String contactNumber;
}
