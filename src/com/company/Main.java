package com.company;

import java.util.Scanner;

import static com.company.Exercises.showFirstExercise;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What exercise do you want to see? 1 - 10 -> ");
        int exercise = scan.nextInt();
        switch(exercise){
            case 1 : showFirstExercise();
                break;
            default:
                System.out.println('F');
        }


    }
}
