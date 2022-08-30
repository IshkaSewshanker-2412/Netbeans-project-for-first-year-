/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenthousecolourandnumber;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ishka
 */
public class StudentHouseColourAndNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarations
        //declaring vriables for student name
        String firstName;
        String secondName;
        String thirdName;
        //declaring variables for student colour
        String firstNameColor;
        String secondNameColor;
        String thirdNameColor;
        
        //initializing random methof
        Random randomNumber = new Random();
        
        //initializing colours to house
        String [] houseColours = {"RED", "BLUE", "WHITE"};
        
        //asking students for their name by displaing input
        firstName = JOptionPane.showInputDialog("Please enter the first student name");
        secondName = JOptionPane.showInputDialog("Please enter the second student name");
        thirdName = JOptionPane.showInputDialog("Please enter the third student name");
         
        firstNameColor = houseColours[randomNumber.nextInt(3)];
        secondNameColor = houseColours[randomNumber.nextInt(3)];
        thirdNameColor = houseColours[randomNumber.nextInt(3)];
        //displaying the results
        displayStudentHouseColourAndNumber(firstName, firstNameColor, secondName, secondNameColor, thirdName, thirdNameColor);
       
    }
    //declaring method to display the colour and student number results
    public static void displayStudentHouseColourAndNumber(String firstName, String firstColour, 
                                                         String secondName, String secondColour, String thirdName, String thirdColour){
        Random randomNumber = new Random();
        
       
        //displaying the final result
        JOptionPane.showMessageDialog(null, firstName + " assigned to the " + firstColour
                                                    + " house with the student number " + firstColour + randomNumber.nextInt(1000-10)+ 10 + "\n" +
                                         secondName + " assigned to the " + secondColour
                                                    + " house with the student number " + secondColour + randomNumber.nextInt(1000-10)+ 10 + "\n" +
                                          thirdName + " assigned to the " + thirdColour 
                                                    + " house with the student number " + thirdColour + randomNumber.nextInt(1000-10)+ 10);
                
    }
    
    
}
