package com.project.ui;


public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage_Manager
     */
    public HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        buttonViewProfile = new javax.swing.JButton();
        buttonInsertPetsInfo = new javax.swing.JButton();
        buttonViewPetsInfo = new javax.swing.JButton();
        buttonManagement = new javax.swing.JButton();
        buttonViewCustomersInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonInserCustInfo = new javax.swing.JButton();
        buttonEditProfile = new javax.swing.JButton();
        buttonEditStatistics = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        labelRescued = new javax.swing.JLabel();
        labelTransferred = new javax.swing.JLabel();
        labelAdopted = new javax.swing.JLabel();
        labelPurchased = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        buttonViewProfile.setBackground(new java.awt.Color(0, 51, 51));
        buttonViewProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonViewProfile.setText("View Profile");
        buttonViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewProfileActionPerformed(evt);
            }
        });

        buttonInsertPetsInfo.setBackground(new java.awt.Color(0, 51, 51));
        buttonInsertPetsInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonInsertPetsInfo.setText("Insert Pets Info");
        buttonInsertPetsInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertPetsInfoActionPerformed(evt);
            }
        });

        buttonViewPetsInfo.setBackground(new java.awt.Color(0, 51, 51));
        buttonViewPetsInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonViewPetsInfo.setText("View Pets Info");
        buttonViewPetsInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewPetsInfoActionPerformed(evt);
            }
        });

        buttonManagement.setBackground(new java.awt.Color(0, 51, 51));
        buttonManagement.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonManagement.setText("Adoption/Purchase & Payment Process Management");
        buttonManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonManagementActionPerformed(evt);
            }
        });

        buttonViewCustomersInfo.setBackground(new java.awt.Color(0, 51, 51));
        buttonViewCustomersInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonViewCustomersInfo.setText("View Customers Info");
        buttonViewCustomersInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewCustomersInfoActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dashboard");

        buttonInserCustInfo.setBackground(new java.awt.Color(0, 51, 51));
        buttonInserCustInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonInserCustInfo.setText("Insert Customers Info");
        buttonInserCustInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInserCustInfoActionPerformed(evt);
            }
        });

        buttonEditProfile.setBackground(new java.awt.Color(0, 51, 51));
        buttonEditProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonEditProfile.setText("Edit Profile");
        buttonEditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditProfileActionPerformed(evt);
            }
        });

        buttonEditStatistics.setBackground(new java.awt.Color(0, 51, 51));
        buttonEditStatistics.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonEditStatistics.setText("Edit Statistics");
        buttonEditStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditStatisticsActionPerformed(evt);
            }
        });

        buttonExit.setBackground(new java.awt.Color(0, 51, 51));
        buttonExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonExit.setText("Exit");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        labelRescued.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelRescued.setForeground(new java.awt.Color(255, 255, 255));
        labelRescued.setText("Rescued");

        labelTransferred.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTransferred.setForeground(new java.awt.Color(255, 255, 255));
        labelTransferred.setText("Transferred");

        labelAdopted.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelAdopted.setForeground(new java.awt.Color(255, 255, 255));
        labelAdopted.setText("Adopted");

        labelPurchased.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelPurchased.setForeground(new java.awt.Color(255, 255, 255));
        labelPurchased.setText("Purchase");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Amount");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonEditProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(buttonEditStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(labelRescued, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(labelTransferred, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                        .addComponent(labelAdopted, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(labelPurchased, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(buttonInsertPetsInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                            .addComponent(buttonViewPetsInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(buttonViewProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(buttonViewCustomersInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(buttonInserCustInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(buttonManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                                .addGap(31, 31, 31)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonEditStatistics)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonEditProfile)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonViewProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonInserCustInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInsertPetsInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonViewCustomersInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonViewPetsInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRescued, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTransferred, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAdopted, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPurchased, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(buttonExit)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewProfileActionPerformed
        // TODO add your handling code here:
        new ViewProfile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonViewProfileActionPerformed

    private void buttonInsertPetsInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertPetsInfoActionPerformed
        // TODO add your handling code here:
        new InsertPetInfo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonInsertPetsInfoActionPerformed

    private void buttonViewPetsInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewPetsInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonViewPetsInfoActionPerformed

    private void buttonManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonManagementActionPerformed
        // TODO add your handling code here:
        new Adoption_PurchaseInfo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonManagementActionPerformed

    private void buttonViewCustomersInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewCustomersInfoActionPerformed
        // TODO add your handling code here:
        new ViewCustInfo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonViewCustomersInfoActionPerformed

    private void buttonInserCustInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInserCustInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonInserCustInfoActionPerformed

    private void buttonEditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditProfileActionPerformed
        // TODO add your handling code here:
        new EditProfile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonEditProfileActionPerformed

    private void buttonEditStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditStatisticsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditStatisticsActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExitActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditProfile;
    private javax.swing.JButton buttonEditStatistics;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonInserCustInfo;
    private javax.swing.JButton buttonInsertPetsInfo;
    private javax.swing.JButton buttonManagement;
    private javax.swing.JButton buttonViewCustomersInfo;
    private javax.swing.JButton buttonViewPetsInfo;
    private javax.swing.JButton buttonViewProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAdopted;
    private javax.swing.JLabel labelPurchased;
    private javax.swing.JLabel labelRescued;
    private javax.swing.JLabel labelTransferred;
    // End of variables declaration//GEN-END:variables
}
