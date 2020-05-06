package com.company.exercise2;

public class Robot extends Species implements  ISprintable{
    public Robot() {
        super();
        this.speed = 30;
        this.distance = 510;
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
        return "Robot{" +
                "speed=" + speed +
                ", distance=" + distance +
                ", run = " + run(distance) +
                '}';
    }
}
