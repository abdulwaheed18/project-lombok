package com.waheedtechblog.lombok.model;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Val example
 *
 * We can use val as the type of a local variable declaration instead of actually writing the type and It will also be made final.
 * This feature works on local variables and on foreach loops only, not on fields. The initializer expression is required.
 */
public class LombokValExample {

    public String exampleWithoutVal() {
        final ArrayList<String> list = new ArrayList<String>();
        list.add("http://www.waheedtechblog.com");

        final HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (final Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }

        final String site = list.get(0);
        return site.toLowerCase();
    }

    public String exampleWithVal() {
        val list = new ArrayList<String>();
        list.add("http://www.waheedtechblog.com");

        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf("%d: %s\n", entry.getKey(), entry.getValue());
        }
        val site = list.get(0);
        return site.toLowerCase();
    }
}
