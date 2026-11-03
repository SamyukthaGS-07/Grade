package org.example;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x, avg;
        char grade;
        avg = 0.0F;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Mark " + (i + 1) + " : ");
            x = sc.nextFloat();
            avg += x;
        }
        avg = avg / 3;
        if (avg >= 90) grade = 'A';
        else if (avg >= 75) grade = 'B';
        else if (avg >= 50) grade = 'C';
        else grade = 'F';

        System.out.println("\nGrade: " + grade);
    }
}