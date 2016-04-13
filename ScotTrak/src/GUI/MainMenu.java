/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import scottrak.Classes.Individual;

/**
 *
 * @author Eric
 */
public class MainMenu extends javax.swing.JFrame implements Observer{

    private DefaultTableModel mod1;
    private DefaultTableModel mod2;
    private DefaultTableModel mod3;
    private DefaultTableModel mod4;
    
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        
        this.setTitle("ScotTrak");
        jTextField1.setText("");
        jTextField1.requestFocusInWindow();
        
        
        mod1 = (DefaultTableModel) IndividualTable.getModel();
        mod2 = (DefaultTableModel) CorpOrgTable.getModel();
        mod3 = (DefaultTableModel) DonationsTable.getModel();
        mod4 = (DefaultTableModel) jTable1.getModel();
        
        /*
        DBcon db = new DBcon();
        db.View("SELECT Fname, Minit, Lname,"
                + "Street, "
                + "City, State, ZipCode, "
                + "Phone, "
                + "EmailAddress,"
                + "UserStatus, Solicitation "
                + " FROM Individual left outer join Donor on (Individual.DonorID = Donor.DonorID)",new DBaction(){
                    @Override
                    public void DBactRS(ResultSet rs) {
                        try {
                            
                            String[] res = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
                                rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)};
                            
                            mod1.addRow(res);
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    @Override
                    public void DBactSRS(Statement s) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                    
                });
        */
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        IndividualTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        CorpOrgTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        DonationsTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IndividualTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        jScrollPane1.setViewportView(IndividualTable);

        jTabbedPane1.addTab("Individual", jScrollPane1);

        CorpOrgTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        jScrollPane2.setViewportView(CorpOrgTable);

        jTabbedPane1.addTab("Corporation/Organization", jScrollPane2);

        DonationsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane4.setViewportView(DonationsTable);

        jTabbedPane1.addTab("Donations - Individual", jScrollPane4);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane5.setViewportView(jTable1);

        jTabbedPane1.addTab("Donations - Corporation/Organization", jScrollPane5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        jButton1.setText("New Donor");

        jButton2.setText("Delete Donor");

        jTextField1.setText("jTextField1");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton4.setText("Filter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Update");

        jLabel4.setText("Type to Search:");

        jButton3.setText("Delete Donation");

        jButton6.setText("New Donation");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1)
                .addComponent(jButton2)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton4)
                .addComponent(jButton5)
                .addComponent(jLabel4)
                .addComponent(jButton3)
                .addComponent(jButton6))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Donor Information:");

        jLabel2.setText("Donor ID:");

        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(802, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Reports");

        jMenuItem2.setText("Generate Report");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Database");

        jMenuItem3.setText("Change Database");
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Tools");

        jMenuItem4.setText("Settings");
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Help");

        jMenuItem5.setText("About");
        jMenu6.add(jMenuItem5);

        jMenuItem6.setText("Documentation");
        jMenu6.add(jMenuItem6);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        new Filter().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        
        //RowSorter
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(this.mod1); //Change here
        IndividualTable.setRowSorter(rowSorter); //Change here
        
        jTextField1.getDocument().addDocumentListener(new DocumentListener(){ 
            @Override
            public void insertUpdate(DocumentEvent e) {
               String text = jTextField1.getText(); 

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null); //Change here
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text)); //Change here
                }
               
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jTextField1.getText(); 

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null); //Change here
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text)); //Change here
                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
        
        //RowSorter 1
        TableRowSorter<TableModel> rowSorter1 = new TableRowSorter<>(this.mod2); //Change here
        CorpOrgTable.setRowSorter(rowSorter1); //Change here
        
        jTextField1.getDocument().addDocumentListener(new DocumentListener(){ 
            @Override
            public void insertUpdate(DocumentEvent e) {
               String text = jTextField1.getText(); 

                if (text.trim().length() == 0) {
                    rowSorter1.setRowFilter(null); //Change here
                } else {
                    rowSorter1.setRowFilter(RowFilter.regexFilter("(?i)" + text)); //Change here
                }
               
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jTextField1.getText(); 

                if (text.trim().length() == 0) {
                    rowSorter1.setRowFilter(null); //Change here
                } else {
                    rowSorter1.setRowFilter(RowFilter.regexFilter("(?i)" + text)); //Change here
                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
        //RowSorter 2
        TableRowSorter<TableModel> rowSorter2 = new TableRowSorter<>(this.mod3); //Change here
        DonationsTable.setRowSorter(rowSorter2); //Change here
        
        jTextField1.getDocument().addDocumentListener(new DocumentListener(){ 
            @Override
            public void insertUpdate(DocumentEvent e) {
               String text = jTextField1.getText(); 

                if (text.trim().length() == 0) {
                    rowSorter2.setRowFilter(null); //Change here
                } else {
                    rowSorter2.setRowFilter(RowFilter.regexFilter("(?i)" + text)); //Change here
                }
               
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jTextField1.getText(); 

                if (text.trim().length() == 0) {
                    rowSorter2.setRowFilter(null); //Change here
                } else {
                    rowSorter2.setRowFilter(RowFilter.regexFilter("(?i)" + text)); //Change here
                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
        
        //RowSorter 3
        TableRowSorter<TableModel> rowSorter3 = new TableRowSorter<>(this.mod4); //Change here
        jTable1.setRowSorter(rowSorter3); //Change here
        
        jTextField1.getDocument().addDocumentListener(new DocumentListener(){ 
            @Override
            public void insertUpdate(DocumentEvent e) {
               String text = jTextField1.getText(); 

                if (text.trim().length() == 0) {
                    rowSorter3.setRowFilter(null); //Change here
                } else {
                    rowSorter3.setRowFilter(RowFilter.regexFilter("(?i)" + text)); //Change here
                }
               
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jTextField1.getText(); 

                if (text.trim().length() == 0) {
                    rowSorter3.setRowFilter(null); //Change here
                } else {
                    rowSorter3.setRowFilter(RowFilter.regexFilter("(?i)" + text)); //Change here
                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
    }//GEN-LAST:event_jTextField1KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CorpOrgTable;
    private javax.swing.JTable DonationsTable;
    private javax.swing.JTable IndividualTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        String[] camp = {(String) arg};
        
        mod1.addRow(camp);
        
        DBcon db = new DBcon();
        db.View("SELECT Fname, Minit, Lname,"
                + "Street, "
                + "City, State, ZipCode, "
                + "Phone, "
                + "EmailAddress,"
                + "UserStatus, Solicitation "
                + " FROM Individual left outer join Donor on (Individual.DonorID = Donor.DonorID)",new DBaction(){
                    @Override
                    public void DBactRS(ResultSet rs) {
                        try {
                            
                            String[] res = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
                                rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)};
                            
                            mod1.addRow(res);
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    @Override
                    public void DBactSRS(Statement s) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                    
                });
        
        
        db.View("SELECT OrgName, PrimaryContact,"
                    + "Street, "
                    + "City, State, ZipCode,"
                    + "Phone, "
                    + "EmailAddress,"
                    + "UserStatus, Solicitation"
                    + " FROM Corporate_Organization left outer join Donor on (Corporate_Organization.DonorID = Donor.DonorID)",new DBaction(){
                    @Override
                    public void DBactRS(ResultSet rs) {
                        try {
                            
                            String[] res = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
                                rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)};
                            
                            mod2.addRow(res);
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    @Override
                    public void DBactSRS(Statement s) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                    
                });
        
        
        db.View("SELECT I.Title, I.Fname, I.Minit, I.Lname, I.PreferredHouseholdName,"
                        + " D.CampaignTitle, D.Amount, D.DDate, D.Notes"
                        + " FROM Individual as I left outer join Donations as D on (I.DonorID = D.DonorID)",new DBaction(){
                    @Override
                    public void DBactRS(ResultSet rs) {
                        try {
                            
                            String[] res = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
                                rs.getString(7),rs.getString(8),rs.getString(9)};
                            
                            mod3.addRow(res);
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    @Override
                    public void DBactSRS(Statement s) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                    
                });
        
        db.View("SELECT C.OrgName, C.PrimaryContact,"
                        + " D.CampaignTitle, D.Amount, D.DDate, D.Notes"
                        + " FROM Corporate_Organization as C left outer join Donations as D on (C.DonorID = D.DonorID)",new DBaction(){
                    @Override
                    public void DBactRS(ResultSet rs) {
                        try {
                            
                            String[] res = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
                            
                            mod4.addRow(res);
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    @Override
                    public void DBactSRS(Statement s) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                    
                });
        
    }
}
