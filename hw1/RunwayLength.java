/* 
    Author: Damir Zhabatayev
    Due Date: January 30, 2023
    Purpose: This Java program outputs minimal lenght for runway
    Credits: I finished this program independently by my own and had no help from other people or resources. 
*/

package hw1;

import java.util.Scanner;

public class RunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the speed and acceleration:");
        double speed = input.nextDouble();
        double accel = input.nextDouble();
        double lenght = speed * speed / (2 * accel);
        System.out.println("The minimum runway length for this airplane is: " + String.format("%.2f", lenght));
        input.close();

    }
    
}
