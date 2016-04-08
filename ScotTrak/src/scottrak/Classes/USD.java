/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scottrak.Classes;

/**
 *
 * @author Eric
 */
public class USD {
    
    private double dollarAmount;
    
    public USD(double da){
        dollarAmount = da;
    }
    
    @Override
    public String toString(){
        return "$" + this.dollarAmount;
    }
}
