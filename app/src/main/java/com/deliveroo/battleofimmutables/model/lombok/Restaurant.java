package com.deliveroo.battleofimmutables.model.lombok;

/**
 * Created by evelina on 23/10/2016.
 */
@lombok.Value
@lombok.Builder(toBuilder = true)
public class Restaurant {

    private final String name;
    private final double latitude;
    private final double longitude;
}
