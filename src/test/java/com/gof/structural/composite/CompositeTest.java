package com.gof.structural.composite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompositeTest {

    @Test
    void print() {
        Folder f1 = new Folder("folder 1");
        Folder f2 = new Folder("folder 2");
        Folder f3 = new Folder("folder 3");
        Folder f4 = new Folder("folder 4");
        Folder f5 = new Folder("folder 5");

        File file1 = new File("file 1");
        File file2 = new File("file 2");
        File file3 = new File("file 3");
        File file4 = new File("file 4");
        File file5 = new File("file 5");

        f1.add(f2.add(f4));
        f5.add(f4.add(f3));

        f1.add(f5);

        f2.add(file1, file4, file5);
        f1.add(file1, file2);

        f1.print(0);
    }
}