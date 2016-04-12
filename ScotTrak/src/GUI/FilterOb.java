/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Observable;
import scottrak.Classes.Campaign;

/**
 *
 * @author Eric
 */
public class FilterOb extends Observable {
    
    private String camp;
    
    public FilterOb(){
        
    }
    
    public FilterOb(String c){
        this.camp = c;
    }
    
    public void setCamp(String ca){
        this.camp = ca;
        setChanged();
        notifyObservers(this.camp);
    }
    
}
