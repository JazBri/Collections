package com.company.exercise3;

import java.util.ArrayList;

public final class Exercise3 {

    public static void removeEvenLength(ArrayList<String>arrayString){
        for ( int i = 0; i < arrayString.size(); i++){


           if( (arrayString.get(i)).length() % 2 == 0 ){
               System.out.println(arrayString.get(i));
                arrayString.remove(arrayString.get(i));

            }


        }
    };

    public static void showEvenLength(ArrayList<String>arrayString){
        for (String i : arrayString) {
            System.out.println(i);
        }
    }
}
