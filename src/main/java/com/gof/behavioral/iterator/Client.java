package com.gof.behavioral.iterator;

public class Client {
    public static void main(String[] args) {
        CustomCollection array = new CustomArray(3);
        array.insert(7);
        array.insert(4);
        array.insert(8);


        CustomIterator iter = array.getIterator();
        while (iter.hasNext())
        {
            System.out.print(iter.next() + " ");
        }
    }
}
