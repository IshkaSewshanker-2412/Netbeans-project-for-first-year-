/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageposting;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author ishka
 */
public class PackagePosting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating object from delivery details class
        deliveryDetails myobj = new deliveryDetails ();
        //creating object for JOpitonPane
        JFrame frameObj = new JFrame();
        String chosenTown = "";
        String chosenWeightCategory = "";
        String chosenCourier= "";
        double priceCharged = 0;
       
        myobj.setTown(Integer.parseInt(JOptionPane.showInputDialog(frameObj,"Select the town the parcel will be delievered to \n"
                + "1. Cape Town \n"
                + "2. Durban \n"
                + "3. Pretoria")));
        
        //adding if statement 
        if (myobj.getTown() == 1)
        {
            chosenTown = "Cape Town";
        }
        
        else if (myobj.getTown()==2)
        {
            chosenTown = "Durban";
        }
        else if (myobj.getTown() == 3)
        {
            chosenTown = "Pretoria";
        }
        else 
        {
            chosenTown = "Invalid entry of town, please select number option provided with list of town names";
        }
        
        //Asking the user for weight category
        myobj.setWeight(Integer.parseInt(JOptionPane.showInputDialog(frameObj,"Select the weight category of the parcel to be delivered to: " + chosenTown + "\n"
                + "1. 0kg - 4kg \n"
                + "2. 5kg - 9kg \n"
                + "3. Over 10kg")));
        
        //adding if statements for the chosen weight category
        if (myobj.getWeight()==1)
        {
            chosenWeightCategory = "0kg - 4kg";
            priceCharged = 300;
        }
        else if (myobj.getWeight()==2)
        {
            chosenWeightCategory = "5kg - 9kg";
            priceCharged = 500;
        }
        else if (myobj.getWeight() ==3)
        {
            chosenWeightCategory = "Over 10kg";
            priceCharged = 700;
        }
        else 
        {
            chosenWeightCategory = "Invalid entry of chosen weight category, please select number option provided with list of weights";
        }
        
        //asking user for the chosen courier company
        myobj.setCourierCompany(Integer.parseInt(JOptionPane.showInputDialog(frameObj,"Select the courier company to deliver the parcel weight of " + chosenWeightCategory + " " + "to " + chosenTown + "\n"
                + "1. ABC Couriers \n"
                + "2. Fast Track \n"
                + "3. Rest Assured")));
        //adding if statements for chosen courier company
        if (myobj.getCourierCompany()==1)
        {
            chosenCourier = "ABC Couriers";
        }
        else if (myobj.getCourierCompany()==2)
        {
            chosenCourier = "Fast Track";  
        }
        else if (myobj.getCourierCompany()==3)
        {
            chosenCourier = "Rest Assured";
        }
        else 
        {
            chosenCourier = "Invalid entry of chosen courier company, please select number option provided with list of courier company names";
        }
        //print method to display town
        printDeliveryReport(chosenTown,chosenWeightCategory,priceCharged,chosenCourier);
    }

    private static void printDeliveryReport(String chosenTown,String chosenWeightCategory, double priceCharged, String chosenCourier) 
    {   
        //declaring date 
        DateFormat dateFormat = new SimpleDateFormat("yyyy/mm//dd HH:mm:ss");
        Calendar currentDate = Calendar.getInstance();
        String dateWithTime = dateFormat.format(currentDate.getTime());
        //declaring variables 
        double vat;
        double totalAmount;
        //calculating vat charged 
        vat = priceCharged * 0.14;
        totalAmount = vat + priceCharged ;
        //printing out the report 
        System.out.println("DELIVERY REPORT - created on " + dateWithTime);
        System.out.println("************************************************");
        System.out.println("TOWN: \t\t" + chosenTown + "\n"
                            + "WEIGHT: \t" + chosenWeightCategory +"\n"
                            + "PRICE: \t\t" + priceCharged + "\n"
                            + "VAT: \t\t"  + vat + "\n"
                            + "TOTAL DUE: \t" + totalAmount +"\n"
                            + "COURIER: \t" + chosenCourier);
        System.out.println("************************************************");
                            
    }
    
    
    
}
