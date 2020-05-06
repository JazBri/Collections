package com.company.exercice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListClass {
    private List <Integer> listInteger;

    public ListClass() {
         this.listInteger= new ArrayList<>();
    }

    public List<Integer> getListInteger() {
        return listInteger;
    }

    public void setListInteger(List<Integer> listInteger) {
        this.listInteger = listInteger;
    }

    public void addNumber (Integer num){
        this.listInteger.add(num);
    }

    public void deleteNumber(Integer num){
        this.listInteger.remove(num);
    }

    public void iterateForEach(){
        for(Integer i : listInteger){
            System.out.println(i);
        }
    }

    public void iterateFor(){
        for(int i = 0; i < listInteger.size(); i++){
            System.out.println(listInteger.get(i));
        }
    }

    public void sortArray(){
        Collections.sort(listInteger);
    }

    public void reverseArray(){
        Collections.reverse(listInteger);
    }

    @Override
    public String toString() {
        return "listInteger=" + listInteger;
    }
}
