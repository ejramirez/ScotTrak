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
public class Individual extends AbDonor implements Donor {

    private FullName name;
    private String prefName;
    private String title;
    
    public Individual(){
        
    }
    
    public Individual(FullName n, String pfn, String t, Address ad, PhoneNumber p, String e, UserStatus Ustatus, boolean sol) {
        super(ad, p, e, Ustatus, sol);
        this.name = n;
        this.prefName = pfn;
        this.title = t;
    }

    @Override
    public String toString(){
        return this.name.toString() + " " + this.prefName + " " + this.title + " " + super.toString();
    }
    
    @Override
    public boolean equals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the name
     */
    public FullName getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(FullName name) {
        this.name = name;
    }

    /**
     * @return the prefName
     */
    public String getPrefName() {
        return prefName;
    }

    /**
     * @param prefName the prefName to set
     */
    public void setPrefName(String prefName) {
        this.prefName = prefName;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
}
