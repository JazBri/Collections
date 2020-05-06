package com.company;

import java.util.Scanner;

import static com.company.Exercises.showFirstExercise;
import static com.company.Exercises.showSecondExercise;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What exercise do you want to see? 1 - 10 -> ");
        int exercise = scan.nextInt();
        switch(exercise){
            case 1 : showFirstExercise();
                break;
            case 2 : showSecondExercise();
                break;
            default:
                System.out.println('F');
        }


    }
}
