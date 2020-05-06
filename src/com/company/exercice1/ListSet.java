package com.company.exercice1;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ListSet {
    private Set<Integer> setList = new TreeSet<Integer>();

    public ListSet(Set<Integer> setList) {
        this.setList = setList;
    }

    public ListSet() {
    }

    public Set<Integer> getSetList() {
        return setList;
    }

    public void setSetList(Set<Integer> setList) {
        this.setList = setList;
    }

    public void addSet(Integer num){
        this.setList.add(num);
    }

    public void deleteSet(Integer num){
        this.setList.remove(num);
    }

    public void iterateForEach(){
        for (Integer i : setList){
            System.out.println(i);
        }
    }
    public void iterateIterator(){
        Iterator<Integer> itr = setList.iterator();
        while (itr.hasNext()){
            Integer n = itr.next();
            System.out.println(n);
        }
    }
}
