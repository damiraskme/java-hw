/* 
    Author: Damir Zhabatayev
    Due Date: January 30, 2023
    Purpose: This Java program outputs distance between two points
    Credits: I finished this program independently by my own and had no help from other people or resources. 
*/

package hw1;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Please enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1-y2), 2));
        System.out.printf("The distance between these two points is: %.2f", distance);
        input.close();
    }
}
