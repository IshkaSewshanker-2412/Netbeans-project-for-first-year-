/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageposting;

/**
 *
 * @author ishka
 */
public class deliveryDetails {
    //declarations
    private int town;
    private int weight;
    private int CourierCompany;
    
    //setting town
    public void setTown (int x)
    {
        this.town = x;
    }
    
    //getting town
    public int getTown()
    {
        return town;
    }
    
    //setting weight 
    public void  setWeight (int a)
    {
        this.weight = a;
    }
    
    //getting weight
    public int getWeight()
    {
        return weight;
    }
    
    //setting name of courier company chosen
    public void setCourierCompany(int y)
    {
        this.CourierCompany = y;
    }
    
    //getting name of courier company chosen
    public int getCourierCompany()
    {
        return CourierCompany;
    }
    
    
}
