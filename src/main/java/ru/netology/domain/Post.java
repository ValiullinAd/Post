package ru.netology.domain;

public class Post {
    private int postId;
    private int postData;
    private int nameId;
    private int imageId;
    private int postTime;
    private int giveMeLike;
    private int forwardTo;
    private int viewId;


    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }
    public int getPostData() {
        return postData;
    }

    public void setPostData(int postData) {
        this.postData = postData;
    }

    public int getNameId() {
        return nameId;
    }

    public void setNameId(int nameId) {
        this.nameId = nameId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getPostTime() {
        return postTime;
    }

    public void setPostTime(int postTime) {
        this.postTime = postTime;
    }
    public int getGiveMeLike() {
        return giveMeLike;
    }

    public void setGiveMeLike(int giveMeLike) {
        this.giveMeLike = giveMeLike;
    }

    public int getForwardTo() {
        return forwardTo;
    }

    public void setForwardTo(int forwardTo) {
        this.forwardTo = forwardTo;
    }

    public int getViewId() {
        return viewId;
    }

    public void setViewId(int viewId) {
        this.viewId = viewId;
    }
}
