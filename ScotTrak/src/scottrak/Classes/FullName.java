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
public class FullName {
    
    private String fname;
    private String minit;
    private String lname;
    
    public FullName(String f, String m, String l){
        fname = f;
        minit = m;
        lname = l;
    }
    
    public String toString(){
        return getFname() + " " + getMinit() + " " + getLname();
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the minit
     */
    public String getMinit() {
        return minit;
    }

    /**
     * @param minit the minit to set
     */
    public void setMinit(String minit) {
        this.minit = minit;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }
    
}
