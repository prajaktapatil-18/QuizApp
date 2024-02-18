package com.example.quiz_app.model;

public class ModelClass {

    String title,desp;

    public ModelClass() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    public ModelClass(String title, String desp) {
        this.title = title;
        this.desp = desp;
    }
}
