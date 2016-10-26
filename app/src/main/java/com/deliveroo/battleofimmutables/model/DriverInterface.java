package com.deliveroo.battleofimmutables.model;

import android.annotation.SuppressLint;

/**
 * Created by evelina on 26/10/2016.
 */

public interface DriverInterface {

    String registrationNumber();

    @SuppressLint("NewApi") default String vehicle() {
        return "bicycle";
    }
}
