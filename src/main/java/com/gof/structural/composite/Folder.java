package com.gof.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Folder implements Item  {
    private String name;

    private List<Item> items = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public Item add(Item item) {
        this.items.add(item);
        return this;
    }

    public void add(Item ... item) {
        this.items.addAll(new ArrayList<Item>(Arrays.asList(item)));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public void print(int level) {
        System.out.println(String.join("", Collections.nCopies(level, "  ")) + "*" + getName());
        items.forEach(leaf -> leaf.print(level+1));
    }

}
