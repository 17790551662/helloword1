package com.hxp.java;

import java.util.ArrayList;
import java.util.List;

public class HelloWord {

    private static List lsit;

    public static void main(String[] args) {

        //region Description
        try {
            System.out.print("hello wordrrrrrrrrrrrr !!");

            lsit = new ArrayList();

            ArrayList<Object> list = new ArrayList<>();

            list.remove(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //endregion
    }

}
