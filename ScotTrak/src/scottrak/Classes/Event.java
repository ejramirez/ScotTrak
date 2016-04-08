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
public class Event {
    
    private String eventName;
    private Date eventDate;
    private String description;
    private USD moneyAccu;
    private String campTitle;
    
    public Event(){
    
    }
    
    public Event(String eveName, Date ed, String desc, USD ma, String ct){
        this.eventName = eveName;
        this.eventDate = ed;
        this.description = desc;
        this.moneyAccu = ma;
        this.campTitle = ct;
    }
    
    @Override
    public String toString(){
        return this.getEventName() + " " + this.getEventDate().toString() + " " + this.getDescription() + " " + this.getMoneyAccu().toString() + " " + 
                this.getCampTitle();
    }

    /**
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName) {
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

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the moneyAccu
     */
    public USD getMoneyAccu() {
        return moneyAccu;
    }

    /**
     * @param moneyAccu the moneyAccu to set
     */
    public void setMoneyAccu(USD moneyAccu) {
        this.moneyAccu = moneyAccu;
    }

    /**
     * @return the campTitle
     */
    public String getCampTitle() {
        return campTitle;
    }

    /**
     * @param campTitle the campTitle to set
     */
    public void setCampTitle(String campTitle) {
        this.campTitle = campTitle;
    }
    
}
