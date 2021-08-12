package com.example.TestTask.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Filter {
    List<String> filtered = new ArrayList<>();
    Map<String, List> inputMap = new HashMap<>();

    public Map<String, List> filtBy(ArrayList<String> arrayList){

        //if array is empty
        if (arrayList.get(0)!="" && arrayList.get(0)!=" " ) {
            System.out.println(arrayList.get(0));
            filtered.add(arrayList.get(0));




            //main filter
            for (int i = 0; i < arrayList.size()-1; i++) {

                if(arrayList.get(i+1)==null){


                }

                //loop
                if (arrayList.get(i).charAt(arrayList.get(i).length() - 1) == arrayList.get(i + 1).charAt(0)) {

                    filtered.add(arrayList.get(i+1));

                    System.out.println(arrayList.get(i + 1));

                } else
                    break;


            }
            inputMap.put("words", filtered);
            return inputMap;

        } else
           return inputMap;


    }


}
