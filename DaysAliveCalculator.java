/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysalivecalculator;

import java.util.Scanner;

/**
 *
 * @author leandroestevez
 */
public class DaysAliveCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        int month = 0;
        
        System.out.print("Enter the month you were born: ");
        
        month = input.nextInt();
        
        System.out.println();
        
        while(month <= 0 || month > 12) {

            System.out.print("Please enter a number greater than 0 and equal or smaller than 12: ");

            month = input.nextInt();
            
            System.out.println();

        }
        
        
        int day = 0;
        
        System.out.print("Enter the day you were born: ");
        
        day = input.nextInt();
        
        System.out.println();
        
        while(day <= 0 || day >= 32) {

            System.out.print("Please enter a number greater than 0 and smaller than 32: ");

            day = input.nextInt();
            
            System.out.println();

        }
        
        
        int year = 0;
        
        System.out.print("Enter the year you were born: ");
        
        year = input.nextInt();
        
        System.out.println();
        
        while(year <= 1899 || year >= 2020) {

            System.out.print("Please enter a number greater than 1899 and smaller than 2020: ");

            year = input.nextInt();
            
            System.out.println();

        }
        
        
        Day today = new Day();
        
        Day birthDate = new Day(year, month, day);
        
        int daysAlive = today.daysFrom(birthDate);
        
        System.out.print("You have been alive " + daysAlive + " days.");
        
    }
    
}
