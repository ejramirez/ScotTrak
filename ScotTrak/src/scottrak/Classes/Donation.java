/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scottrak.Classes;

import java.sql.Date;

/**
 *
 * @author Eric
 */
public class Donation{
    
    private Pledges pled;
    
    private int DonationID;
    private int DonorID;
    
    private Donor don;
    private USD amount;
    private Date dat;
    private String notes;
    private Campaign campTitle;
    private Event eventName;
    private Date eventDate;

    public Donation(){
    
    }
    
    public Donation(Donor d, USD am, Date dd, String no, Campaign ct, Event en, Date ed){
        this.don = d;
        this.amount = am;
        this.dat = dd;
        this.notes = no;
        this.campTitle = ct;
        this.eventName = en;
        this.eventDate = ed;
    }
    
    @Override
    public String toString(){
        return this.don.toString() + " " + this.amount.toString() + " " + this.dat.toString() + " " + this.notes + " " + this.campTitle
                + " " + this.eventName + " " + this.eventDate.toString();
    }
    
    /**
     * @return the don
     */
    public Donor getDon() {
        return don;
    }

    /**
     * @param don the don to set
     */
    public void setDon(Donor don) {
        this.don = don;
    }

    /**
     * @return the amount
     */
    public USD getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(USD amount) {
        this.amount = amount;
    }

    /**
     * @return the dat
     */
    public Date getDat() {
        return dat;
    }

    /**
     * @param dat the dat to set
     */
    public void setDat(Date dat) {
        this.dat = dat;
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @return the campTitle
     */
    public String getCampTitle() {
        return campTitle.getCampaignTitle();
    }

    /**
     * @param campTitle the campTitle to set
     */
    public void setCampTitle(Campaign campTitle) {
        this.campTitle = campTitle;
    }

    /**
     * @return the eventName
     */
    public String getEventName() {
        return eventName.getEventName();
    }

    /**
     * @param eventName the eventName to set
     */
    public void setEventName(Event eventName) {
        this.eventName = eventName;
    }

    /**
     * @return the eventDate
     */
    public Date getEventDate() {
        return eventDate;
    }

    /**
     * @param eventDate the eventDate to set
     */
    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }
    
}
