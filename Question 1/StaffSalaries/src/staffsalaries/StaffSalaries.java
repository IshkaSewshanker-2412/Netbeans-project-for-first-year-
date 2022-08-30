/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffsalaries;
import java.util.Scanner;
/**
 *
 * @author ishka
 */
public class StaffSalaries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initiliazing scanner
        Scanner sc = new Scanner (System.in);
        //declaring variable for salary deductions
        String increasedDeductions;
       
        //creating object for details class
        Details objectDetails = new Details();

       //Asking user for their ID Information
        System.out.print("Enter the employee number>>");
        
       //setting the idnum through objects
        objectDetails.setIDnum(sc.nextInt());
       
        //Asking the user for their first name 
        System.out.print("Enter employee first name>>" );
        
        //setting the first name through objects
        objectDetails.setFirstName(sc.next());
       
         //Asking the user for their last name 
        System.out.print("Enter employee last name>>");
        
        //setting the last name through objects
        objectDetails.setSurname(sc.next());
        
        //Asking employee for their newSalary amount
        System.out.print("Enter employee salary to be increased>>");
         
        //setting the salary
        objectDetails.setSalary(sc.nextInt());
         
        
        // Printing out the Employee Detalis Report
        printDetails(objectDetails.getIDnum(), objectDetails.getFirstName(), objectDetails.getSurname(), objectDetails.getSalary(), objectDetails.getUpdatedSalary(), objectDetails.getIncreasedAmount());
         increasedDeductions = sc.next();
         if (increasedDeductions.equals("1"))
         {
             salaryDeductions(objectDetails.getSalary(), objectDetails.getTaxamount(), objectDetails.getMedicalAid(),
                              objectDetails.getCarAllowance(), objectDetails.getUIF() , objectDetails.getremainingamountafterDeduction());
         }
         else 
         {
             System.out.println("**************************");
             System.out.println("Application complete");
         }
    }
        //declaring method to print details
    private static void printDetails(int iDnum, String firstName, String surname, double salary, double updatedSalary, double increasedAmount) {
            //displaying employee details report
        System.out.println("EMPLOYEE DETAILS REPORT");
        System.out.println("**************************");
        System.out.println("EMPLOYEE NUMBER: "  + iDnum);
        System.out.println("EMPLOYEE FIRST NAME: " + firstName);
        System.out.println("EMPLOYEE SURNAME: " + surname);
        System.out.println("ORIGINAL SALARY: " + salary);
        System.out.println("INCREASE SALARY: " + updatedSalary);
        System.out.println("INCREASED AMOUNT: " + increasedAmount);
        System.out.println("**************************");
        System.out.println("");
        
        //Askig user if they would like to continue
        System.out.println("Would you like to see the increased with deductions? Enter (1) to view the report or any other key to exit.");
     
    
}
    //declaring method to display salary deductions
    private static void salaryDeductions(double salary, double taxAmount, double medicalAid, double carAllowance, double uifAmount, double  remainingAmountAfterDeduction ) {
        System.out.println("");
        System.out.println("EMPLOYEE DEDUCTIONS REPORT ");
        System.out.println("**************************");
        System.out.println("SALARY:                                  R" + salary);
        System.out.println("TAX:                                     R" + taxAmount);
        System.out.println("MEDICAL AID:                             R" + medicalAid);
        System.out.println("CAR ALLOWANCE:                           R" + carAllowance);
        System.out.println("UIF:                                     R" + uifAmount);
        System.out.println("TAKE HOME PAY:                           R" + remainingAmountAfterDeduction);
        System.out.println("**************************");
        System.out.println("Application complete");
    }
}
