/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffsalaries;

/**
 *
 * @author ishka
 */
public class Details {
    //declaring variables
    private int idNum;
    private String firstName;
    private String surname;
    private double salary;
    double newSalary;
    double increasedAmount;
    double salaryIncrease;
    //salary dedcutions
    double taxAmount;
    double medicalAid;
    double carAllowance;
    double uifAmount;
    double totalDeduction;
    double deductionAmount;
    double remainingAmountAfterDeduction;
    
    //initializing get and set methods 
    
    //getting IDnum
    public int getIDnum()
    {
        return idNum;
    }
    
    //setting IDnum
    public void setIDnum(int IDnum)
    {
        this.idNum = IDnum;
    }
    
    //getting FirstName of employee
    public String getFirstName()
    {
        return firstName;
    }
    
    //setting FirstName of employee
    public void setFirstName(String FirstName)
    {
        this.firstName = FirstName;
    }
    
      //getting LastName of employee
    public String getSurname()
    {
        return surname;
    }
    
    //setting LastName of employee
    public void setSurname(String Surname)
    {
        this.surname = Surname;
    }
    
    //getting employee Salary
    public double getSalary()
    {
        return salary;
    }
    //setting employee Salary
    public void setSalary (double Salary)
    {
        this.salary = Salary;
    }
    
    //getting updated salary
    public double getUpdatedSalary()
    {
        newSalary = salary * 0.10 + salary;
        return newSalary;
    }
    
   //getting increased Amount
   public double getIncreasedAmount()
   {
        
       increasedAmount =  newSalary *0.10;
       return increasedAmount;
   }
   
   //getting tax amount
   public double getTaxamount()
   {
       taxAmount = newSalary * 0.18; //calculating tax amount
       return taxAmount;
   }
   
   //getting medical aid
   public double getMedicalAid()
   {
       medicalAid = newSalary * 0.125;
       return medicalAid;
   }
  
   //getting car allowance
   public double getCarAllowance()
   {
       carAllowance = newSalary * 0.08;
       return carAllowance;
   }
  
   //getting uif
   public double getUIF()
   {
       uifAmount = newSalary * 0.02; //calculating uif
       return uifAmount;
   }
   
  //getting remaining amount after the deductions
   public double getremainingamountafterDeduction()
   {
        totalDeduction = taxAmount + medicalAid + carAllowance + uifAmount; //calculating total dedcution amount
        remainingAmountAfterDeduction = newSalary - totalDeduction; //calculating remaining amount after deductions
       return remainingAmountAfterDeduction;
   }
   
  
   
   
}
