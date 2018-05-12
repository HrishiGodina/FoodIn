package com.example.hrishi.foodin.Adapters;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.io.Serializable;

/**
 * Created by hp on 08-03-2018.
 */

public class Order implements Serializable{

    private DatabaseReference mDatabase;

    private String item;
    private int cost;
    private int count = 0;

    public Order(){

    }

    public Order(String item, int cost, int count) {
        this.item = item;
        this.cost = cost;
        this.count = count;
    }

    private void writeNewOrder(String userId, String item, int cost, int count) {
        Order order = new Order(item, cost, count);
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("orders").child(userId).setValue(order);
    }

    public String getItem() {
        return item;
    }

    public int getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }
}
