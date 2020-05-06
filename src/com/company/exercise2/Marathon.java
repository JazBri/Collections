package com.company.exercise2;

import java.util.ArrayList;

public final class Marathon {
    private ArrayList<Species> marathonList;

    public  Marathon() {
        this.marathonList = new ArrayList<>();
    }

    public void setMarathonList(ArrayList<Species> marathonList) {
        this.marathonList = marathonList;
    }

    public void addSpecies(Species s){
        this.marathonList.add(s);
    }

    public  void getList(){
        for ( Species i : marathonList){
            System.out.println(i.toString());
        }

    }
}
