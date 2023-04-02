package e.commerce.with.java.ant;

import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jimit
 */
public class Product_Carousel extends javax.swing.JFrame {
    Connection con=null;
    int count=0;
    String ml=null;
    /**
     * Creates new form Product_Carousel
     */
    public Product_Carousel() {
        initComponents();
        populateJTable();
    }
    public Product_Carousel(String em,int crt){
        initComponents();
        ml=em;
        count=crt;
        System.out.println(count);
        jButton2.setText("Cart ("+count+")" );
        populateJTable();
    }
    
    
    public void populateJTable(){
        Product_Fetch mq = new Product_Fetch();
        ArrayList<Products> list = mq.BindTable();
        String[] columnName = {"Sr. No.","Image","Name","Description","Price","Action"};
        Object[][] rows = new Object[list.size()][6];
        for(int i = 0; i < list.size(); i++)
        {
            rows[i][0] = list.get(i).getID();
            
            if(list.get(i).getMyImage() != null)
            {
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMyImage()).getImage()
                .getScaledInstance(150, 120, Image.SCALE_SMOOTH) );   

               rows[i][1] = image;
            }
            else
            {
                rows[i][1] = null;
            }
            
            rows[i][2] = list.get(i).getName();
            rows[i][3] = list.get(i).getDesc();
            rows[i][4] = list.get(i).getPrice();
            rows[i][5] = list.get(i).getAct();
        }
        
        Table_Model_1 model = new Table_Model_1(rows, columnName);
        
     
        
        jTable1.setModel(model);
        jTable1.setRowHeight(120);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(204, 0, 0));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Exit");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(51, 153, 255));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton16.setText("Sign Out");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cart (0)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Product Carousel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(474, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addContainerGap(474, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton15)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton16)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(18, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(431, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        int result;
        result=JOptionPane.showConfirmDialog(null, "Do you really want to exit the app ?",null, JOptionPane.YES_NO_OPTION);
        if (result==JOptionPane.YES_OPTION)
        {
            try
                {
                  MySQL_Connection c1= new MySQL_Connection();
                  con=c1.connect();
                  Statement stmt= (Statement) con.createStatement();
                  String query="truncate table cart";
                  stmt.executeUpdate(query);
                }
            catch(SQLException x)
                {
                  JOptionPane.showMessageDialog(this, "An Error occured: "+x);
                }
            System.exit(0);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int result;
        result= JOptionPane.showConfirmDialog(null, "Do you really want to Sign out ?",null, JOptionPane.YES_NO_OPTION);
        if (result==JOptionPane.YES_OPTION)
        {
            try
                {
                  MySQL_Connection c1= new MySQL_Connection();
                  con=c1.connect();
                  Statement stmt= (Statement) con.createStatement();
                  String query="truncate table cart";
                  stmt.executeUpdate(query);
                }
            catch(SQLException x)
                {
                  JOptionPane.showMessageDialog(this, "An Error occured: "+x);
                }
            new Sign_in().setVisible(true);
            Product_Carousel u = new Product_Carousel();
            u.setVisible(false);
            dispose();
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Cart(ml,count).setVisible(true);
        Product_Carousel r = new Product_Carousel();
        r.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        JTable source = (JTable)evt.getSource();
        int t=0;
        int row = source.rowAtPoint( evt.getPoint() );
        int column = source.columnAtPoint( evt.getPoint() );
        System.out.println(row+" "+column);
        String s=source.getModel().getValueAt(row, column)+"";
        if(column==5)
        {
            try
                {
                  MySQL_Connection c1= new MySQL_Connection();
                  con=c1.connect();
                  Statement stmt= (Statement) con.createStatement();
                  String query1="Select * from cart;";
                  ResultSet rs= stmt.executeQuery(query1);
                  int t2=row+1;
                  while(rs.next())
                    {
                        int pn=rs.getInt("CId");
                        if(pn==t2)
                            t=1;
                    }
                  if(t==0)
                  {
                      String query="Insert into cart(CId) values('"+t2+"');";            
                      stmt.executeUpdate(query);
                  }
                  else
                  {
                      String query="Update cart set CQuantity=CQuantity+1 where CId="+t2+";";            
                      stmt.executeUpdate(query);
                  }
                  count=count+1;
                  jButton2.setText("Cart ("+count+")" );
                  JOptionPane.showMessageDialog(this, "Item Succesfully Added to the Cart !");
                }
            catch(SQLException x)
                {
                  JOptionPane.showMessageDialog(this, "An Error occured: "+x);
                }
        }    
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Product_Carousel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product_Carousel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product_Carousel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_Carousel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_Carousel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
