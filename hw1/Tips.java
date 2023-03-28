/* 
    Author: Damir Zhabatayev
    Due Date: January 30, 2023
    Purpose: This Java program outputs gratuity rate and total
    Credits: I finished this program independently by my own and had no help from other people or resources. 
*/

package hw1;

import java.util.Scanner;

public class Tips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        double gratuity_rate = (subtotal * gratuity) / 100;
        double total = gratuity_rate + subtotal;
        System.out.printf("The gratuity is $%.2f and total is $%.2f", gratuity_rate, total);
        input.close();    
    }
}
