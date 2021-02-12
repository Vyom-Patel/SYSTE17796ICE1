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
        

        // Averages temperature 
        double calcAvg = calcAvg(tempList);
        System.out.printf("The average temperature of the week is: %.2f degree %n", calcAvg);
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


}


