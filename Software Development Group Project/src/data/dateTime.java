/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import frames.home;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Beatrice Antoniu - w1688177
 */
//Beatrice Antoniu
public class dateTime {
    
    public static void displayData() {
        
        Timer updateTimer;
        int DELAY = 100;
        //Local Time and Date display
        updateTimer = new Timer(DELAY, (ActionEvent e) -> {
            Date currentTime = new Date();
            //Format of date and time
            String formatTimeStr = "hh:mm aa";
            String formatDateStr = "dd/MM/yyyy";
            DateFormat formatTime = new SimpleDateFormat(formatTimeStr);
            DateFormat formatDate = new SimpleDateFormat(formatDateStr);
            //Set time and date to strings
            String formattedTimeStr = formatTime.format(currentTime);
            String formattedDateStr = formatDate.format(currentTime);
            
            home.time.setText(formattedTimeStr);
            home.date.setText(formattedDateStr);
        });
        
        //start counting
        updateTimer.start();
    }
}
