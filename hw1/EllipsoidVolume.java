/* 
    Author: Damir Zhabatayev
    Due Date: January 30, 2023
    Purpose: This Java program outputs Volume of an	ellipsoid
    Credits: I finished this program independently by my own and had no help from other people or resources. 
*/

package hw1;

public class EllipsoidVolume {
    public static void main(String[] args) {
        double a = 10.5;
        double b = 8.6;
        double c = 5.7;
        double volume = (4 * Math.PI * a * b * c)/3;
        System.out.printf("The volume for the Ellipsoid with axis %.1f, %.1f and %.1f is: %.2f", a, b, c, volume);
    }
}
