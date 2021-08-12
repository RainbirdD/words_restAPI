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
}
