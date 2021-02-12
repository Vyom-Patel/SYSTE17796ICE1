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

        // Create a new scanner
        Scanner input = new Scanner(System.in);

        // Set array list
        int[] tempList = new int[14];

        // Prompt user for input and store input
        System.out.println("Enter the hightest temperature of each day for a week (starting on Sunday): ");
        for (int i = 0; i < tempList.length; i++) {
            tempList[i] = input.nextInt();
        }

        // Averages temperature - @@@@@@@ ASK WHY IT THERE ARE SO MANY DECIMALS ON THE SIDE WHEN AVERAGE ALL 1's
        double calcAvg = calcAvg(tempList);
        System.out.printf("The average temperature of the week is: %.2f degree %n", calcAvg);

        // Display hottest temperature
        /*    int calcMax = calcMax(tempList);
        System.out.println("The highest temperature of the week is: " + calcMax + " degree");
         */
 /*  // Display coldest temperature
        int minTemp = minTemp(tempList);
        System.out.println("The coldest temperature of the week is: " + minTemp + " degree");

        int[] maxTempList = searchTemp(tempList, maxTemp);

        for (int i = 0; i < maxTempList.length; i++) {
            System.out.print("The hottest days of the week are: " + maxTempList[i]);

            System.out.print(weekDay(tempList, maxTemp));
        }
    } */
    }
// Average the temperature

    public static double calcAvg(int[] array) {
        int tempTotal = array[0];

        // Total temperature values
        for (int i = 0; i < array.length; i++) {

            tempTotal = array[i] + tempTotal;

        }

        // Return temperature average.
        return ((double) tempTotal / array.length);
    }
    /*
// Get hottest temperature
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
/*
// Get coldest temperature
    public static int minTemp(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
     */
}
