package com.example.recyclerviewdvir;

public class Items {
    public int getimageview;
    String text;
    int image;
    private int textforiamge;

    public Items(String text, int image) {
        this.text = text;
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public int getImage() {
        return image;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setImage(int image) {
        this.image = image;
    }


    public int getTextforiamge() {
        return textforiamge;
    }

    public void setTextforiamge(int textforiamge) {
        this.textforiamge = textforiamge;
    }
}
