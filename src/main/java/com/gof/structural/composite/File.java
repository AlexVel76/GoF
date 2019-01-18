package com.gof.structural.composite;

import java.util.Collections;

public class File implements Item {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void print(int level) {
        System.out.println(String.join("", Collections.nCopies(level, "  ")) + "-" + this.name);
    }
}
