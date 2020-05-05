package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ListMap {
    private Map<Integer, String> mapInteger = new HashMap<Integer, String>();

    public ListMap(Map<Integer, String> mapInteger) {
        this.mapInteger = mapInteger;
    }

    public ListMap() {
    }

    public Map<Integer, String> getMapInteger() {
        return mapInteger;
    }

    public void putMap(Integer k, String v){
        mapInteger.put(k, v);
    }

    public Map<Integer, String> getMap(){
        return this.mapInteger;
    }

    public void deleteForKey(Integer k){
        this.mapInteger.remove(k);
    }

    public void setMapInteger(Map<Integer, String> mapInteger) {
        this.mapInteger = mapInteger;
    }

    public void iterateLambda(){
        this.mapInteger.forEach((k, v) -> System.out.println(k + " " + v));
    }

    public void iterateEntry(){
        for(Map.Entry<Integer, String> entry : mapInteger.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
