package com.gof.behavioral.iterator;

public class Client {
    public static void main(String[] args) {
        CustomArray array = new CustomArray(3);
        array.insert(7);
        array.insert(4);
        array.insert(8);


        try {
            array.pause(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        CustomIterator iter = array.getIterator();
        long i=0l;
        while (true)
        {
            try {
                Thread.sleep(1000*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            i++;
            try {
                array.pause(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }





}
