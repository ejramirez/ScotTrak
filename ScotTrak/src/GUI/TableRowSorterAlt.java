/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Eric
 */
public class TableRowSorterAlt {
    
    private JTextField textField;
    private DocumentListener docListener;
    private DefaultTableModel defTableModel;
    private JTable table;
    private RowSorter rowSort;
    
    public TableRowSorterAlt(){
    
    }
    
    public TableRowSorterAlt(JTextField tf, JTable tab, DefaultTableModel dtm, RowSorter roso, DocumentListener dl){
        
        this.textField = tf;
        this.table = tab;
        this.defTableModel = dtm;
        this.docListener = dl;
        this.rowSort = roso;
        
        
    }
    
    public void setSearch(){
        
        this.rowSort = new javax.swing.table.TableRowSorter<>(this.defTableModel);
        this.table.setRowSorter(this.rowSort);
        
        
        this.textField.getDocument().addDocumentListener(this.docListener);
        
    }
    
/*
    new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
               String text = tf.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
               
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jTextField1.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        }
    */
}
