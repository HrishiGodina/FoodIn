package com.example.hrishi.foodin.Adapters;

/**
 * Created by hp on 08-03-2018.
 */

public class Item {
    public void setItem(String item) {
        this.item = item;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private String item;
    private int cost;
    private int count = 0;

    public Item(String item, int cost, int count) {
        this.item = item;
        this.cost = cost;
        this.count = count;
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
