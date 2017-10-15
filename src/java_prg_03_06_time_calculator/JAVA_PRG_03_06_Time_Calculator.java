/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_03_06_time_calculator;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * Write a program that asks the user to enter a number of seconds.
 * 
 *  - There are 60 seconds in a minute. If the number of seconds entered by
 *    the user is greater than or equal to 60, the program should display the
 *    number of minutes in that many seconds.
 *  - There are 3,600 seconds in an hour. If the number of seconds is greater
 *    than or equal to 3,600, the program should display the number of hours in
 *    that many seconds.
 *  - There are 86,400 seconds in a day. If the number of seconds entered by
 *    the user is greater than or equal to 86,400, the program should display
 *    the number of days in that many seconds.
 */
public class JAVA_PRG_03_06_Time_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define static comparison constants
        final int INT_SECONDS_MINUTES = 60;
        final int INT_SECONDS_HOURS = 3600;
        final int INT_SECONDS_DAYS = 86400;
        
        // Declare to hold parsed user input
        int intUserSeconds;
        
        // Declare to hold converted seconds value
        float fltSecondsConverted;
        
        // Declare for user input and response
        String strUserSeconds;
        String strResponse;
        
        // Prompt for user input
        strUserSeconds = JOptionPane.showInputDialog("Please enter a number " +
                "of seconds.");
        
        // Convert user input to integer value
        intUserSeconds = Integer.parseInt(strUserSeconds);
        
        // Determine range of intUserSeconds and perform conversion if necessary
        // Then format and output result for the user
        if(intUserSeconds >= 0 && intUserSeconds < INT_SECONDS_MINUTES)
        {
            JOptionPane.showMessageDialog(null, "That is " + intUserSeconds +
                    "seconds.");
        }
        else if(intUserSeconds >= INT_SECONDS_MINUTES && intUserSeconds < INT_SECONDS_HOURS)
        {
            fltSecondsConverted = (float)intUserSeconds / (float)INT_SECONDS_MINUTES;
            strResponse = String.format("That is %,.1f minutes.", fltSecondsConverted);
            JOptionPane.showMessageDialog(null, strResponse);
        }
        else if(intUserSeconds >= INT_SECONDS_HOURS && intUserSeconds < INT_SECONDS_DAYS)
        {
            fltSecondsConverted = (float)intUserSeconds / (float)INT_SECONDS_HOURS;
            strResponse = String.format("That is %,.1f hours.", fltSecondsConverted);
            JOptionPane.showMessageDialog(null, strResponse);
        }
        else if(intUserSeconds >= INT_SECONDS_DAYS)
        {
            fltSecondsConverted = (float)intUserSeconds / (float)INT_SECONDS_DAYS;
            strResponse = String.format("That is %,.2f days.", fltSecondsConverted);
            JOptionPane.showMessageDialog(null, strResponse);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "There was an error calculating " +
                    "your result.");
        }
        
        // For JOptionPane
        System.exit(0);
    }
    
}
