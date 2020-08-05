/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysalivecalculator;

import static java.lang.System.exit;
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
    
        getDate();
        
    }
    
    public static int checkDate(String date) {
        
        // Check length
        if(date.length() != 10) {
            
            return 0;
            
        }
        
        // Check for "/"
        if(!(date.substring(2, 3).equals("/") && date.substring(5, 6).equals("/"))) {
                
            return 0;
                
        }
        
        // Check that all characters are digits
        for(int i = 0; i < date.length(); i++) {
            
            if(i == 2 || i == 5) {
                continue;
            }
            
            if(!Character.isDigit(date.charAt(i))) {
                return 0;
            }
            
        }
        
        // Check if month is valid
        int month = Integer.parseInt(date.substring(0, 2));
        
        if(month > 12 || month <= 0) {
                
            return 0;
                
        }
        
        // Check if day is valid
        int day = Integer.parseInt(date.substring(3, 5));
        
        if(day > 31 || day <= 0) {
                
            return 0;
                
        }
        
        // Check if year is valid
        int year = Integer.parseInt(date.substring(6));
        
        if(year > 2020 || year < 1899) {
                
            return 0;
                
        }
              
        return 1;
        
    }
    
    public static int getMonth(String date) {
        
        int month = Integer.parseInt(date.substring(0, 2));
        
        return month;
        
    }
    
    public static int getDay(String date) {
        
        int day = Integer.parseInt(date.substring(3, 5));
        
        return day;
        
    }
    
    public static int getYear(String date) {
        
        int year = Integer.parseInt(date.substring(6));
        
        return year;
        
    }
    
    public static int calculateDays(String date) {
        
        int days = 0;
        
        return days;
    }
    
    public static void getDate() {
        
        String date = JOptionPane.showInputDialog("Enter the date you were born in the format mm/dd/yyyy");
        
        if(date == null) {
            
            JOptionPane.showMessageDialog(null, "Thank you for using Days Alive Calculator");
            
            exit(0);
            
        } else {
            
            int valid = checkDate(date);
            
            if(valid == 0) {
            
                JOptionPane.showMessageDialog(null, "Please enter a valid date in the format mm/dd/yyyy");
                getDate();
            
            } else {
                
                int month = getMonth(date);
                int day = getDay(date);
                int year = getYear(date);
                
                Day today = new Day();
                        
                Day birthDate = new Day(year, month, day);
                        
                int daysAlive = today.daysFrom(birthDate);
                
                JOptionPane.showMessageDialog(null, "You have been alive " + daysAlive + " days.");
                
                exit(0);
                
            }
            
        }
        
    }
    
}
