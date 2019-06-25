package com.example.yibandemo.bean;

public class GridBean {
    private String title;
    private Integer image;

    public GridBean() {
    }

    public GridBean(String title, Integer image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
