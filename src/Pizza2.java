/*
 * Feb. 24, 2020
 * First Selection Program
 * Erika Graham
 */

/**
 *
 * @author ergra0573
 */
public class Pizza2 extends javax.swing.JFrame {

    /**
     * Creates new form Pizza2
     */
    public Pizza2() {
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

        lblIconOlive = new javax.swing.JLabel();
        lblTaxOut = new javax.swing.JLabel();
        lblSubtotalOut = new javax.swing.JLabel();
        lblGrandtotalOut = new javax.swing.JLabel();
        lblPrintOut = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblDiameter = new javax.swing.JLabel();
        txtDiameter = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        lblGrandTotal = new javax.swing.JLabel();
        lblolives = new javax.swing.JLabel();
        lblTaxes = new javax.swing.JLabel();
        lblanchovies = new javax.swing.JLabel();
        lblSubtotal1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTaxOut.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 25)); // NOI18N
        lblTaxOut.setText("$0.00");

        lblSubtotalOut.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 25)); // NOI18N
        lblSubtotalOut.setText("$0.00");

        lblGrandtotalOut.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 25)); // NOI18N
        lblGrandtotalOut.setText("$0.00");

        lblPrintOut.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // NOI18N

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        lblTitle.setText("Putrid Pizza");

        lblDiameter.setBackground(new java.awt.Color(0, 0, 0));
        lblDiameter.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // NOI18N
        lblDiameter.setText("Diameter of Pizza (cm):");

        txtDiameter.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // NOI18N

        btnCalculate.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblGrandTotal.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 25)); // NOI18N
        lblGrandTotal.setText("Grand Total:");

        lblolives.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 25)); // NOI18N
        lblolives.setIcon(new javax.swing.ImageIcon(getClass().getResource("/olives 2.jpg"))); // NOI18N

        lblTaxes.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 25)); // NOI18N
        lblTaxes.setText("Taxes(13%):");

        lblanchovies.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 25)); // NOI18N
        lblanchovies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anchovies.jpg"))); // NOI18N

        lblSubtotal1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 25)); // NOI18N
        lblSubtotal1.setText("Subtotal:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblanchovies)
                    .addComponent(lblolives, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSubtotal1)
                                .addGap(47, 47, 47)
                                .addComponent(lblSubtotalOut))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTaxes)
                                    .addComponent(lblGrandTotal))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGrandtotalOut)
                                    .addComponent(lblTaxOut))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCalculate)
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDiameter)
                                .addGap(33, 33, 33)
                                .addComponent(txtDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67))))
            .addComponent(lblPrintOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDiameter)
                            .addComponent(txtDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(btnCalculate))
                    .addComponent(lblanchovies, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSubtotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSubtotalOut))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTaxes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTaxOut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGrandtotalOut)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblolives, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(lblPrintOut, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        //declaring variables
        int pizza = 0;
        final double LABOUR = 0.75;
        final double RENT = 0.99;
        double diameter = 0;
        
        //prompt the user
        diameter  = Double.parseDouble(txtDiameter.getText());
        
        //more variables
        double ingredients  = 0.50 * diameter ;
        final double TAX = 0.13;
        double subTotal = 0;
        double taxes = 0;
        double grandTotal = 0;
        
        //calculations
        subTotal = LABOUR + RENT + ingredients;
        taxes = subTotal * TAX;
        grandTotal = subTotal + taxes;

        //rounding calculations
        subTotal = subTotal * 100;
        subTotal = Math.round(subTotal);
        subTotal = subTotal / 100;

        taxes = taxes * 100;
        taxes = Math.round(taxes);
        taxes = taxes / 100;

        grandTotal = grandTotal * 100;
        grandTotal = Math.round(grandTotal);
        grandTotal = grandTotal / 100;
        
        lblSubtotalOut.setText(String.valueOf(subTotal));
        lblGrandtotalOut.setText(String.valueOf(grandTotal));
        lblTaxOut.setText(String.valueOf(taxes));

        //if statements
        if ((diameter>=1)&&(diameter<=15))
        {
            lblPrintOut.setText("We are going to make you a cute little pizza!");
        }
        else if ((diameter >= 20)&& (diameter<=40))
        {
            lblPrintOut.setText("This will be delicious!");
        }
        else if((diameter > 40))
        {
            lblPrintOut.setText("Whoa, big pizza! You might need a truck to get this home!");
        }

    }//GEN-LAST:event_btnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(Pizza2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pizza2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pizza2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pizza2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizza2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JLabel lblDiameter;
    private javax.swing.JLabel lblGrandTotal;
    private javax.swing.JLabel lblGrandtotalOut;
    private javax.swing.JLabel lblIconOlive;
    private javax.swing.JLabel lblPrintOut;
    private javax.swing.JLabel lblSubtotal1;
    private javax.swing.JLabel lblSubtotalOut;
    private javax.swing.JLabel lblTaxOut;
    private javax.swing.JLabel lblTaxes;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblanchovies;
    private javax.swing.JLabel lblolives;
    private javax.swing.JTextField txtDiameter;
    // End of variables declaration//GEN-END:variables
}
