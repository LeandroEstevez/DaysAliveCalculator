/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysalivecalculator;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author leandroestevez
 */
public class DaysAliveCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Logger log = Logger.getGlobal();
        
        log.setLevel(Level.OFF);
        
        int monthNumber = 0;
        
        String month = JOptionPane.showInputDialog("Enter the month you were born: ");
        
        monthNumber = Integer.parseInt(month);
       
        
        while(monthNumber <= 0 || monthNumber > 12) {

            month = JOptionPane.showInputDialog("Please enter an integer number bettwen 1 and 12: ");
            
            monthNumber = Integer.parseInt(month);
        
        }
        
        
        int dayNumber = 0;
        
        String day = JOptionPane.showInputDialog("Enter the day you were born: ");
        
        dayNumber = Integer.parseInt(day);
       
        
        while(dayNumber <= 0 || dayNumber >= 32) {

            day = JOptionPane.showInputDialog("Please enter a number greater than 0 and smaller than 32: ");
            
            dayNumber = Integer.parseInt(day);
        
        }
        
        
        int yearNumber = 0;
        
        String year = JOptionPane.showInputDialog("Enter the year you were born: ");
        
        yearNumber = Integer.parseInt(year);
       
        
        while(yearNumber <= 1899 || yearNumber >= 2020) {

            year = JOptionPane.showInputDialog("Please enter a number greater than 1899 and smaller than 2020: ");
            
            yearNumber = Integer.parseInt(year);
        
        }
        
        
        Day today = new Day();
        
        Day birthDate = new Day(yearNumber, monthNumber, dayNumber);
        
        int daysAlive = today.daysFrom(birthDate);
        
        JOptionPane.showMessageDialog(null, "You have been alive " + daysAlive + " days.");
        
    }
    
}
