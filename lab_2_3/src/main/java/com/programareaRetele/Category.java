package com.programareaRetele;

public class Category {

    private int id;
    private String name;
    private int categoryId;

    //nullable


    public Category(int id, String name, int categoryId) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
        this.categoryId = 0;
    }



}
