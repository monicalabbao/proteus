package com.flipkart.layoutengine.demo.models;

import com.google.gson.annotations.SerializedName;

/**
 * Data
 *
 * @author aditya.sharat
 */
public class Data {

    @SerializedName("user")
    public User user;

    @SerializedName("data")
    public MetaData metaData;
}
