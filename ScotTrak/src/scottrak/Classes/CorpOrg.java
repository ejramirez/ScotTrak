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
public class CorpOrg extends AbDonor implements Donor {

    private String corpOrg;
    private FullName contact;
    
    public CorpOrg(String co, FullName con, Address ad, PhoneNumber p, String e, UserStatus Ustatus, boolean sol) {
        super(ad, p, e, Ustatus, sol);
        this.corpOrg = co;
        this.contact = con;
    }
    
    public String toString(){
        return this.corpOrg + " " + this.contact.toString() + " " + super.toString();
    }

    @Override
    public boolean equals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the corpOrg
     */
    public String getCorpOrg() {
        return corpOrg;
    }

    /**
     * @param corpOrg the corpOrg to set
     */
    public void setCorpOrg(String corpOrg) {
        this.corpOrg = corpOrg;
    }

    /**
     * @return the contact
     */
    public FullName getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(FullName contact) {
        this.contact = contact;
    }
    
}
