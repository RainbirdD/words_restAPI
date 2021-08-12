package com.example.TestTask.Controller;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("words")
public class WordsController {
   static Filter filter = new Filter();

    //Input??
    ArrayList<String> arrayList = new ArrayList<>() {{
        add("cat");
        add("tom");
        add("math");
        add("khawk");
        add("pill");
        add("love");
        add("rules");
    }};







    public Map<String, List> inputMap = new HashMap<>(){{
        put("words", arrayList);
    }};

    @GetMapping("show")
    public Map<String, List> showWords(){
        return inputMap;
    }


    @GetMapping("filter")
    public Map<String, List> filtered() {

        filter.filtBy(arrayList);
        return filter.inputMap;
    }

/*
        //new arr to put in map
        ArrayList<String> newList = new ArrayList<>();

        //checkout not empty arr
        if (!arrayList.isEmpty()) {
            System.out.println(arrayList.get(0));
            newList.add(arrayList.get(0));
        } else
            System.out.println(arrayList);

        //main filter
        for (int i = 0; i < arrayList.size(); i++) {

            //loop
            if (arrayList.get(i).charAt(arrayList.get(i).length() - 1) == arrayList.get(i + 1).charAt(0)
                    &&
                    arrayList.get(i + 1).charAt(0) == arrayList.get(i).charAt(arrayList.get(i).length() - 1)) {

                newList.add(arrayList.get(i+1));

                System.out.println(arrayList.get(i + 1));

            } else
                break;


        }
        inputMap.put("words", newList);
        return inputMap;*/









}
