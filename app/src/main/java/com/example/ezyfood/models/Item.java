package com.example.ezyfood.models;

import java.io.Serializable;

public class Item implements Serializable {
    private int imageId;
    private String name;
    private int price;

    public Item(int imageResource, String name, int price) {
        this.imageId = imageResource;
        this.name = name;
        this.price = price;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
