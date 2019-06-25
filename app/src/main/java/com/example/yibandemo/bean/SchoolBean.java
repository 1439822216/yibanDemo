package com.example.yibandemo.bean;

public class SchoolBean {
    private String title;
    private String content;
    private String source;
    private Integer image;

    public SchoolBean() {
    }

    public SchoolBean(String title, String content, String source, Integer image) {
        this.title = title;
        this.content = content;
        this.source = source;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
