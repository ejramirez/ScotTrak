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
public class Campaign {
    
    private String campaignTitle;
    private Date startDate;
    private Date endDate;
    private String description;
    private USD goal;
    
    public Campaign(){
    
    }
    
    public Campaign(String ct, Date sd, Date ed, String desc, USD g){
        this.campaignTitle = ct;
        this.startDate = sd;
        this.endDate = ed;
        this.description = desc;
        this.goal = g;
    }

    @Override
    public String toString(){
        return this.campaignTitle + " " + this.startDate.toString() + " " + this.endDate.toString() + " " + this.description + " " +
                this.goal.toString();
    }
    
    /**
     * @return the campaignTitle
     */
    public String getCampaignTitle() {
        return campaignTitle;
    }

    /**
     * @param campaignTitle the campaignTitle to set
     */
    public void setCampaignTitle(String campaignTitle) {
        this.campaignTitle = campaignTitle;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
     * @return the goal
     */
    public USD getGoal() {
        return goal;
    }

    /**
     * @param goal the goal to set
     */
    public void setGoal(USD goal) {
        this.goal = goal;
    }
    
}
