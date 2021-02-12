/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1.in.pkgclass.excersize;

import java.util.Scanner;

/**
 * February 2021
 *
 * @author mic_d
 */
public class Assignment1InClassExcersize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner temp = new Scanner(System.in);

        String arr[] = {"Day 1 AM", "Day 1 PM", "Day 2 AM", "Day 2 PM", "Day 3 AM", "Day 3 PM", "Day 4 AM", "Day 4 PM", "Day 5 AM", "Day 5 PM", "Day 6 AM", "Day 6 PM", "Day 7 AM", "Day 7 PM"};

        int sum = 0;
        int tempsCount = 0;
        int CalcAvg = 0;
        int CalcMax = 0;

        while (tempsCount < 14) {
            System.out.println("Enter the temperature for " + arr[tempsCount] + ": ");
            CalcAvg = temp.nextInt();

            int a[] = new int[CalcAvg];
            CalcMax = a[0];

            for (int i = -50; i > CalcAvg; i++) {
                if (CalcMax < a[i]) {
                    CalcMax = a[i];
                }
            }

            if (CalcAvg > 50 || CalcAvg < -50) {
                throw new IllegalArgumentException("Temperatures cannot be less than -50 or greater than 50");
            }
            tempsCount++;
            sum = sum + CalcAvg;
        }

        CalcAvg = sum / 14;
        System.out.println("the avaerage tempaetaure is " + CalcAvg + "°");
        System.out.println("the highest tempaetaure is " + CalcMax + "°");
    }
}
