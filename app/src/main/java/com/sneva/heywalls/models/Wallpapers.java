package com.sneva.heywalls.models;

public class Wallpapers {

    String image, name, tags;

    public Wallpapers() {

    }

    public Wallpapers(String image, String name, String tags) {
        this.image = image;
        this.name = name;
        this.tags = tags;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
