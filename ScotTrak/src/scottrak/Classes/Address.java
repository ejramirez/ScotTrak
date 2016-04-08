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
public class Address {
    
    private String street;
    private String city;
    private States state;
    private int zip;
    
    public Address(){
    
    }
    
    public Address(String st, String ci, States sta, int zi){
        street = st;
        city = ci;
        state = sta;
        zip = zi;
    }
    
    public String toString(){
        return this.getStreet() + " " + this.getCity() + " " + this.getState().name() + " " + this.getZip();
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public States getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(States state) {
        this.state = state;
    }

    /**
     * @return the zip
     */
    public int getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(int zip) {
        this.zip = zip;
    }
    
}
