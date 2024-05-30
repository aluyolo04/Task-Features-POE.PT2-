/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task_features;

import javax.swing.JOptionPane;

/**
 *
 * @author ngcwa
 */
public class Task_features {

    public static void main(String[] args) {
        Tasks tks = new Tasks();
        String taskDescription;
        String developerDetails;
        String taskDuration;
        String taskName = null;
        String taskStatus = "coming soon";
        
       
        JOptionPane.showMessageDialog(null, "Welcome to EasyKhanban!");
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Option1: Add Task" + "\nOption2: Show Report" + "\nOption3: Quit"));
            if (menu == 1){
                JOptionPane.showInputDialog(null, "How many tasks would you like to enter?");
                tks.taskName = JOptionPane.showInputDialog(null, "Enter the name of your task");
                tks.taskNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your task number"));
                    tks.taskNumber++;
                taskDescription = JOptionPane.showInputDialog(null, "Please enter a description for your task");
                while (!tks.checktaskDescription(taskDescription)) {
                    JOptionPane.showMessageDialog(null,"Please enter a task description that is less than 50 characters");
                taskDescription = JOptionPane.showInputDialog(null, "Please enter a description for your task");
                }
                JOptionPane.showMessageDialog(null, "Task successfully captured");
                }
                developerDetails = JOptionPane.showInputDialog(null, "Please enter your First and Last Name");
                taskDuration = JOptionPane.showInputDialog(null,"Please enter the estimated duration of your task(in hours)");
                int statusMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "What status is your task at?:" + "\nStatus1: To Do" + "\nStatus2: Done" + "\nStatus3: Doing"));
                JOptionPane.showMessageDialog(null, "Your taskID is: " + tks.taskID);
            if (menu == 2){
                JOptionPane.showMessageDialog(null, "Coming Soon!");}
            if (menu == 3){    
                JOptionPane.showMessageDialog(null, "Goodbye!");}
            System.exit(0);
            
    }
}
/*Refferences:
1. n.a,n.d,Manipulating Characters in a String(1.0-SNAPSHOT)[Comuter program].https://docs.oracle.com/javase/tutorial/java/data/manipstrings.html .(28 April 2024)
2 Lajos Arpad.2022.Printing multiple user input from a loop(1.0-SNAPSHOT)[Computer Program].https://stackoverflow.com/questions/72426601/printing-multiple-user-input-from-a-loop . (28 April 2024)
*/