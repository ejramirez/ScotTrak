/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Eric
 */
public interface DBaction {
    
    public void DBactSRS(Statement s);
    
    /**
     * This is the action that the ResultSet will do.
     * 
     * @param rs 
     */
    public void DBactRS(ResultSet rs); //Add query type later on
    
}
