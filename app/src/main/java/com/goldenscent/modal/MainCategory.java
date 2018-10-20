package com.goldenscent.modal;

public class MainCategory {

    private String title;
    private int imgResId;


    public MainCategory(String title, int img) {
        this.title = title;
        imgResId = img;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgResId() {
        return imgResId;
    }

    public void setImgResId(int imgResId) {
        this.imgResId = imgResId;
    }

}
