/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package logicbuddy;
import java.awt.Color;
import java.awt.datatransfer.*;
import java.awt.Toolkit;
import java.net.URI;
import javax.swing.JLabel;
/**
 *
 * @author Harry Nisbet
 * @ver 1.0.3a
 */
public class logicBuddyUI extends javax.swing.JFrame
{
private  String ver = "1.0.5";
URI applicationAddress;
//"http://www.microsun.co.uk";


    /**
     * Creates new form logicBuddyUI
     */
    public logicBuddyUI()
    {
        initComponents();
        jLabel14.setText("codeBuddy Ver: " + getVersion());
        jLabel15.setText("by H.Nisbet");
        jLabel16.setText("");
        try
        {
          applicationAddress=new URI("http://www.microsun.co.uk");  
        } catch (Exception e)
        {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("codeBuddy."));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("∧");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setText("∨");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setText("¬");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setText("→");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setText("∀");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setText("∃");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setText("∈");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setText("∉");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setText("⊂");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setText("⊆");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setText("∅");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setText("∪");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setText("∩");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setText("jLabel14");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                jLabel14MouseExited(evt);
            }
        });

        jLabel15.setText("jLabel15");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                jLabel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                jLabel15MouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("X");
        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBox1.setText("Keep on top");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)))
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
    {//GEN-HEADEREND:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel1MouseClicked
    {//GEN-HEADEREND:event_jLabel1MouseClicked
        // TODO add your handling code here:
        doLabelActions(jLabel1, "Logical Conjunction, AND.");    
    }//GEN-LAST:event_jLabel1MouseClicked
private void doLabelActions(JLabel lbl, String description)
{
    removeLabelBorders();
    lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(WIDTH));
    String myString = lbl.getText();
    jLabel16.setText(myString);
    copyToClipboard(myString);
    jTextArea1.setText(description);
}
    private void copyToClipboard(String cpyStr)
{
 StringSelection stringSelection = new StringSelection(cpyStr);
Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
clipboard.setContents(stringSelection, null);   
}
    private void removeLabelBorders()
{
   jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
   jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
   jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
   jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
   jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
   jLabel6.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
   jLabel7.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
   jLabel8.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
   jLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
   jLabel10.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
   jLabel11.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
   jLabel12.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
   jLabel13.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
}
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel2MouseClicked
    {//GEN-HEADEREND:event_jLabel2MouseClicked
        // TODO add your handling code here:
        doLabelActions(jLabel2, "Logical Disjunction (inclusive), OR.");
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel3MouseClicked
    {//GEN-HEADEREND:event_jLabel3MouseClicked
        // TODO add your handling code here:
        doLabelActions(jLabel3, "Negation, NOT.");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel4MouseClicked
    {//GEN-HEADEREND:event_jLabel4MouseClicked
        // TODO add your handling code here:
        doLabelActions(jLabel4, "Implies; IF...THEN.");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel5MouseClicked
    {//GEN-HEADEREND:event_jLabel5MouseClicked
        // TODO add your handling code here:
        doLabelActions(jLabel5, "Universal Quantification; For all, For any, For each.");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel6MouseClicked
    {//GEN-HEADEREND:event_jLabel6MouseClicked
        // TODO add your handling code here:
        doLabelActions(jLabel6, "Existential Quantification; There exists.");
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel7MouseClicked
    {//GEN-HEADEREND:event_jLabel7MouseClicked
        // TODO add your handling code here:
        doLabelActions(jLabel7, "Membership; is an element of.");
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel8MouseClicked
    {//GEN-HEADEREND:event_jLabel8MouseClicked
        // TODO add your handling code here:
        doLabelActions(jLabel8, "Membership; is NOT an element of");
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel9MouseClicked
    {//GEN-HEADEREND:event_jLabel9MouseClicked
        // TODO add your handling code here:
        doLabelActions(jLabel9, "Subset; is contained in, A ⊆ B AND A is equal to B");
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel10MouseClicked
    {//GEN-HEADEREND:event_jLabel10MouseClicked
        // TODO add your handling code here:
        doLabelActions(jLabel10, "Proper Subset; is contained in, A ⊆ B AND A is NOT equal to B");
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel11MouseClicked
    {//GEN-HEADEREND:event_jLabel11MouseClicked
        // TODO add your handling code here:
        doLabelActions(jLabel11, "Empty Set.");
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel12MouseClicked
    {//GEN-HEADEREND:event_jLabel12MouseClicked
        // TODO add your handling code here:
        doLabelActions(jLabel12, "Set Union; The union of two sets is a set containing all the members of those two sets (and no other members).");
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel13MouseClicked
    {//GEN-HEADEREND:event_jLabel13MouseClicked
        // TODO add your handling code here:
        doLabelActions(jLabel13, "Set Intersection; The intersection of two sets is the set of elements which are common members of each of the two sets..");
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel14MouseClicked
    {//GEN-HEADEREND:event_jLabel14MouseClicked
        // TODO add your handling code here:
        openBrowser();
        
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel15MouseClicked
    {//GEN-HEADEREND:event_jLabel15MouseClicked
        // TODO add your handling code here:
        openBrowser();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel14MouseEntered
    {//GEN-HEADEREND:event_jLabel14MouseEntered
        // TODO add your handling code here:
        jLabel14.setForeground(Color.blue);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel14MouseExited
    {//GEN-HEADEREND:event_jLabel14MouseExited
        // TODO add your handling code here:
        jLabel14.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel15MouseEntered
    {//GEN-HEADEREND:event_jLabel15MouseEntered
        // TODO add your handling code here:
        jLabel15.setForeground(Color.blue);
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel15MouseExited
    {//GEN-HEADEREND:event_jLabel15MouseExited
        // TODO add your handling code here:
        jLabel15.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel15MouseExited

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBox1ActionPerformed
    {//GEN-HEADEREND:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected())
        {
            this.setAlwaysOnTop(true);
        }
        else
        {
           this.setAlwaysOnTop(false); 
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed
private void openBrowser()
{
  try
        {
            java.awt.Desktop.getDesktop().browse(applicationAddress);
            
        } catch (Exception e)
        {
        }  
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("_Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(logicBuddyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(logicBuddyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(logicBuddyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(logicBuddyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new logicBuddyUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
private String getVersion()
{
    return ver;
}
}
