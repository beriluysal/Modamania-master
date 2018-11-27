package com.modart.modamania.model;

public class HomeFeedModel {


    int postImage;
    String title;
    int userImage;
    String date;
    String username;
    String likeCount;
    String commentCount;
    String viewedCount;
    boolean isLike;
    boolean isInMyCollection;

    public HomeFeedModel(int postImage,
                         String title, int userImage, String date, String username, String likeCount,
                         String commentCount, String viewedCount, boolean isLike, boolean isInMyCollection) {
        this.postImage = postImage;
        this.title = title;
        this.userImage = userImage;
        this.date = date;
        this.username = username;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
        this.viewedCount = viewedCount;
        this.isLike = isLike;
        this.isInMyCollection = isInMyCollection;
    }

    public int getPostImage() {
        return postImage;
    }

    public int getUserImage() {
        return userImage;
    }

    public String getTitle() {
        return title;
    }



    public String getDate() {
        return date;
    }

    public String getUsername() {
        return username;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public String getViewedCount() {
        return viewedCount;
    }

    public boolean isLike() {
        return isLike;
    }

    public boolean isInMyCollection() {
        return isInMyCollection;
    }
}
