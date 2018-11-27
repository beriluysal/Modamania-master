package com.modart.modamania.model;

public class TrendOneModel {

    int userImage;
    String username;

    public TrendOneModel(int userImage, String username) {
        this.userImage = userImage;
        this.username = username;
    }

    public int getUserImage() {
        return userImage;
    }

    public String getUsername() {
        return username;
    }
}
