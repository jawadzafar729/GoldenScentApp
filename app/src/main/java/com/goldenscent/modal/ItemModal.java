package com.goldenscent.modal;

public class ItemModal {

    private String title;
    private int imgResId;
    private String name;
    private String brand;
    private String price;
    private String discount;

    public ItemModal(String title, int imgResId, String name, String brand, String price, String discount) {
        this.title = title;
        this.imgResId = imgResId;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.discount = discount;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

}
