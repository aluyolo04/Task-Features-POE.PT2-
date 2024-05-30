/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task_features;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngcwa
 */
public class Tasks {
        int menu;
        String taskName;
        int taskNumber;
        String taskDescription;
        String developerDetails;
        int taskDuration;
        String taskID;
        String taskStatus;
        
        private static int taskCounter = 0;
        
        static boolean checktaskDescription(String taskDescription){
            if (taskDescription.length()<= 50){
                return true;
            }else{
                 return false;  
                 //this method is used to check wether the description of the task meets the required number of charcters of ni more than 50 characters
            }
        }
        
        public static String createTaskID(String taskName, String developerDetails){
            taskCounter++;
            String firstCharacters = taskName.substring(0,2).toUpperCase();
            String threeLastCharacters = developerDetails.substring(developerDetails.length()-3).toUpperCase();
            return String.format("%s:%d:%s",firstCharacters, taskCounter, threeLastCharacters);
            //This code is ude to creat an id for the task using substrings to take characters from the task name, task number and the developer details.
        }           
        }

/*Referances:

*/
