package com.company;

import com.company.exercice1.ListClass;
import com.company.exercice1.ListMap;
import com.company.exercice1.ListSet;

public final class Exercises {
    public static void showFirstExercise(){
        //ArrayList
        ListClass listInteger = new ListClass();
        //Add
        listInteger.addNumber(8);
        listInteger.addNumber(9);
        listInteger.addNumber(5);
        listInteger.addNumber(7);
        //Show
        System.out.println(listInteger.getListInteger());
        //Delete
        listInteger.deleteNumber(9);
        System.out.println(listInteger.getListInteger());
        System.out.println(listInteger.toString());
        //Iterate
        System.out.println("For Each");
        listInteger.iterateForEach();
        System.out.println("For");
        listInteger.iterateFor();
        //Sort
        System.out.println("Sort");
        listInteger.sortArray();
        listInteger.iterateFor();
        //Reverse
        System.out.println("Reverse");
        listInteger.reverseArray();
        listInteger.iterateForEach();

        //HashMap
        ListMap listMap = new ListMap();
        //Add
        listMap.putMap(2, "Two");
        listMap.putMap(1, "One");
        listMap.putMap(3, "Tree");
        //Show
        System.out.println(listMap.getMapInteger());
        //Delete
        listMap.deleteForKey(1);
        System.out.println(listMap.getMapInteger());
        //Iterate
        System.out.println("Arrow");
        listMap.iterateArrow();
        System.out.println("Entry");
        listMap.iterateEntry();
        //Sort
        //Reverse

        //TreeSet
        ListSet listSet = new ListSet();
        //Add
        listSet.addSet(52);
        listSet.addSet(8);
        listSet.addSet(7);
        listSet.addSet(52);
        listSet.addSet(4);
        //Show
        System.out.println(listSet.getSetList());
        //Delete
        listSet.deleteSet(8);
        System.out.println(listSet.getSetList());
        //Iterate
        System.out.println("For Each");
        listSet.iterateForEach();
        System.out.println("Iterator");
        listSet.iterateIterator();
        //Sort
        //Reverse
    }

    public static void showSecondExercise(){}
}
