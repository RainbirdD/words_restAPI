package com.example.TestTask;

import com.example.TestTask.Controller.Filter;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Words1Test {
    Filter filter = new Filter();
    Map<String,  ArrayList> actualMap = new HashMap<>();






    @Test
    public void wordsShouldWork(){


        ArrayList<String> arrayList = new ArrayList<>() {{
            add("fish");
            add("horse");
            add("egg");
            add("goose");
            add("eagle");
        }};


        ArrayList<String> actual = new ArrayList<>() {{
            add("fish");
            add("horse");
            add("egg");
            add("goose");
            add("eagle");

        }};

        actualMap.put("words", actual);


        Assert.assertEquals(filter.filtBy(arrayList), actualMap);
    }






}