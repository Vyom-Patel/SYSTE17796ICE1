/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author VYOM
 */
public class Main {

    public static void main(String[] args) {

        // Creates a scanner
        Scanner input = new Scanner(System.in);

        // Sets an array list
        int[] tempList = new int[14];

        // Prompt user for input
        System.out.println("Enter the temperatures collected in a week ");
        for (int i = 0; i < tempList.length; i++) {
            tempList[i] = input.nextInt();
        }

        // Display Average Tempratures
        double calcAvg = calcAvg(tempList);
        System.out.printf("The average temperature of the week is: %.2f degree %n", calcAvg);

        // Display maximum temperature
        int calcMax = calcMax(tempList);
        System.out.println("The maximum temperature of the week is: " + calcMax + " degree");

    }

    //Calculates  Average temperature
    public static double calcAvg(int[] array) {
        int tempTotal = array[0];

        // Total temperature values
        for (int i = 0; i < array.length; i++) {
            tempTotal = array[i] + tempTotal;
        }
        // Return average temprature
        return ((double) tempTotal / array.length);
    }

    // Get maximum temperature
    public static int calcMax(int[] array) {
        int max = array[0];

        // Check and replace max temp
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        return max;
    }

}
