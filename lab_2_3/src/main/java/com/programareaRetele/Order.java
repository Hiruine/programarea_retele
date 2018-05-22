package com.programareaRetele;

import java.text.SimpleDateFormat;

public class Order {

    public String orderId;
    public String categoryId;
    public SimpleDateFormat dateCreated;
    public double totalPrice;


    public Order(String orderId, String categoryId, SimpleDateFormat dateCreated, double totalPrice) {
        this.orderId = orderId;
        this.categoryId = categoryId;
        this.dateCreated = dateCreated;
        this.totalPrice = totalPrice;
    }
}


