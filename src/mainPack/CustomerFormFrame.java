package mainPack;

import props.Customer;

public class CustomerFormFrame extends javax.swing.JFrame {

    private DashboardFrame dashboardFrame;
    private Customer selectedCustomer;
    private boolean isUpdating = false;

    public CustomerFormFrame() {
        initComponents();
    }

    public CustomerFormFrame(DashboardFrame parentFrame) {
        initComponents();
        dashboardFrame = parentFrame;
        labelFormTitle.setText("Müşteri Kayıt");

    }

    public CustomerFormFrame(DashboardFrame parentFrame, Customer customer) {
        initComponents();
        isUpdating = true;
        labelFormTitle.setText("Müşteri Güncelle");
        dashboardFrame = parentFrame;
        selectedCustomer = customer;

        txtCustomerName.setText(customer.getName());
        txtCustomerSurname.setText(customer.getSurName());
        txtCustomerPhoneNumber.setText(customer.getPhoneNumber());
        txtCustomerAddress.setText(customer.getAddress());

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
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerSurname = new javax.swing.JTextField();
        txtCustomerPhoneNumber = new javax.swing.JTextField();
        txtCustomerAddress = new javax.swing.JTextField();
        buttonCustomerAdd = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();
        labelNotify = new javax.swing.JLabel();
        labelFormTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(312, 380));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(312, 380));

        txtCustomerName.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true), "Adı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txtCustomerSurname.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true), "Soyadı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txtCustomerPhoneNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true), "Telefon", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txtCustomerAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true), "Adres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        buttonCustomerAdd.setBackground(new java.awt.Color(51, 153, 255));
        buttonCustomerAdd.setForeground(new java.awt.Color(255, 255, 255));
        buttonCustomerAdd.setText("Onayla");
        buttonCustomerAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustomerAddActionPerformed(evt);
            }
        });

        buttonClose.setBackground(new java.awt.Color(255, 255, 255));
        buttonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconPack/icon_close.png"))); // NOI18N
        buttonClose.setBorderPainted(false);
        buttonClose.setContentAreaFilled(false);
        buttonClose.setFocusPainted(false);
        buttonClose.setFocusable(false);
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        labelNotify.setBackground(new java.awt.Color(255, 255, 255));
        labelNotify.setForeground(new java.awt.Color(255, 51, 51));
        labelNotify.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelFormTitle.setBackground(new java.awt.Color(255, 255, 255));
        labelFormTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelFormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonCustomerAdd)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(txtCustomerSurname, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(txtCustomerPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(txtCustomerAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(labelFormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
            .addComponent(labelNotify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(buttonClose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(labelFormTitle)
                .addGap(18, 18, 18)
                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCustomerSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCustomerPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(buttonCustomerAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNotify)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed

        dashboardFrame.setEnabled(true);
        dispose();
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void buttonCustomerAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustomerAddActionPerformed

        String name = txtCustomerName.getText().trim();
        String surName = txtCustomerSurname.getText().trim();
        String phoneNumber = txtCustomerPhoneNumber.getText().trim();
        String address = txtCustomerAddress.getText().trim();

        if (name.isEmpty()) {
            labelNotify.setText("Lütfen müşteri ismini girin!");
            txtCustomerName.requestFocus();

        } else if (surName.isEmpty()) {
            labelNotify.setText("Lütfen müşteri soy ismini girin!");
            txtCustomerSurname.requestFocus();

        } else if (phoneNumber.isEmpty()) {
            labelNotify.setText("Lütfen müşteri telefon numarasını girin!");
            txtCustomerPhoneNumber.requestFocus();

        } else if (address.isEmpty()) {
            labelNotify.setText("Lütfen müşteri adresini girin!");
            txtCustomerAddress.requestFocus();

        } else {

            int status;
            DB db = new DB();
            if (isUpdating) {
                status = db.updateCustomer(selectedCustomer.getId(), name, surName, phoneNumber, address);
            } else {
                status = db.addCustomer(name, surName, phoneNumber, address);
            }
            db.close();
            if (status > 0) {
                dashboardFrame.refreshCustomerTable();
                dashboardFrame.setEnabled(true);
                dispose();
            } else {
                labelNotify.setText("Bu telefon numarası daha önce kaydedilmiş!");
            }

        }
    }//GEN-LAST:event_buttonCustomerAddActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerFormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerFormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerFormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerFormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerFormFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonCustomerAdd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFormTitle;
    private javax.swing.JLabel labelNotify;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtCustomerPhoneNumber;
    private javax.swing.JTextField txtCustomerSurname;
    // End of variables declaration//GEN-END:variables
}
