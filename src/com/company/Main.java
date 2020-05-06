package com.company;

import java.util.Scanner;

import static com.company.Exercises.showFirstExercise;
import static com.company.Exercises.showSecondExercise;
import static com.company.Exercises.showThirdExercise;
import static com.company.Exercises.showFourthExercise;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What exercise do you want to see? 1 - 6 -> ");
        int exercise = scan.nextInt();
        switch(exercise){
            case 1 : showFirstExercise();
                break;
            case 2 : showSecondExercise();
                break;
            case 3 : showThirdExercise();
                break;
            case 4 : showFourthExercise();
                break;
            default:
                System.out.println('F');
        }


    }
}
