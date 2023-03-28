/* 
    Author: Damir Zhabatayev
    Due Date: January 30, 2023
    Purpose: This Java program outputs feet to meters convert
    Credits: I finished this program independently by my own and had no help from other people or resources. 
*/

package hw1;

import java.util.Scanner;

public class FeetToMeters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a value for feet:");
        double feet = input.nextDouble();
        final double convert = 0.305;
        double meters = feet * convert;
        System.out.printf("%.2f feet is %.2f meters", feet, meters);
        input.close();
    }
}
