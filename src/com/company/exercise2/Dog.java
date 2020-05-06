package com.company.exercise2;

public class Dog extends Species implements  ISprintable{

    public Dog() {
        super();
        this.speed = 20;
        this.distance = 200;

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
        return "Dog{" +
                "speed=" + speed +
                ", distance=" + distance +
                ", run = " + run(distance) +
                '}';
    }
}
