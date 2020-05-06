package com.company.exercise2;

public class Human extends Species implements  ISprintable{
    public Human() {
        super();
        this.speed = 10;
        this.distance = 456;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    @Override
    public Double run(Double distance) {
        return (distance / speed);
    }

    @Override
    public String toString() {
        return "Human{" +
                "speed=" + speed +
                ", distance=" + distance +
                ", run = " + run(distance) +
                '}';
    }
}
