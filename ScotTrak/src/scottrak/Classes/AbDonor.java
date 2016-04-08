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
public abstract class AbDonor implements Donor{
    
    private Address addr;
    private PhoneNumber pn;
    private String email;
    private UserStatus status;
    private boolean soli;
    //private Preferred pre;
    private int DonorID;
    private boolean sameAsGiven; //Preferred
    
    public AbDonor(Address ad, PhoneNumber p, String e, UserStatus Ustatus, boolean sol){
        this.addr = ad;
        this.pn = p;
        this.email = e;
        this.status = Ustatus;
        this.soli = sol;
    }
    
    @Override
    public String toString(){
        return this.getAddr().toString() + " " + this.getPn().toString() + " " + this.getEmail() + " " + this.getStatus().name() + " " + this.isSoli();
    }
    
    public void setPreferred(boolean q){
        setSameAsGiven(q);
    }

    /**
     * @return the addr
     */
    public Address getAddr() {
        return addr;
    }

    /**
     * @param addr the addr to set
     */
    public void setAddr(Address addr) {
        this.addr = addr;
    }

    /**
     * @return the pn
     */
    public PhoneNumber getPn() {
        return pn;
    }

    /**
     * @param pn the pn to set
     */
    public void setPn(PhoneNumber pn) {
        this.pn = pn;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the status
     */
    public UserStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(UserStatus status) {
        this.status = status;
    }

    /**
     * @return the soli
     */
    public boolean isSoli() {
        return soli;
    }

    /**
     * @param soli the soli to set
     */
    public void setSoli(boolean soli) {
        this.soli = soli;
    }

    /**
     * @return the DonorID
     */
    public int getDonorID() {
        return DonorID;
    }

    /**
     * @param DonorID the DonorID to set
     */
    public void setDonorID(int DonorID) {
        this.DonorID = DonorID;
    }

    /**
     * @return the sameAsGiven
     */
    public boolean isSameAsGiven() {
        return sameAsGiven;
    }

    /**
     * @param sameAsGiven the sameAsGiven to set
     */
    public void setSameAsGiven(boolean sameAsGiven) {
        this.sameAsGiven = sameAsGiven;
    }
    
}
