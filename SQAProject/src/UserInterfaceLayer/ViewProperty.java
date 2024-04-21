/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterfaceLayer;

/**
 *
 * @author arsalan
 */
public class ViewProperty extends javax.swing.JPanel {

    /**
     * Creates new form ViewProperty
     */
    public ViewProperty() {
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

        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        recieptTable = new javax.swing.JTable();
        btnDetails = new javax.swing.JButton();
        recieptAddProdError = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jPanel4.setLayout(null);

        recieptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Type", "Quantity", "Price", "Discount", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recieptTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane6.setViewportView(recieptTable);

        jPanel4.add(jScrollPane6);
        jScrollPane6.setBounds(20, 60, 1070, 390);

        btnDetails.setText("Details");
        btnDetails.setToolTipText("Remove Item");
        btnDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        jPanel4.add(btnDetails);
        btnDetails.setBounds(1000, 460, 90, 30);

        recieptAddProdError.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(recieptAddProdError);
        recieptAddProdError.setBounds(810, 130, 280, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any", "Location 1", "Location 2" }));
        jPanel4.add(jComboBox1);
        jComboBox1.setBounds(70, 10, 150, 30);

        jLabel1.setText("Location");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(20, 10, 50, 30);

        jLabel2.setText("Property Type");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(260, 10, 80, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any", "1", "2" }));
        jPanel4.add(jComboBox2);
        jComboBox2.setBounds(340, 10, 130, 30);

        jLabel3.setText("Price Range");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(510, 10, 70, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any", "1 - 10", "20 - 50" }));
        jPanel4.add(jComboBox3);
        jComboBox3.setBounds(580, 10, 130, 30);

        jLabel4.setText("Area Range");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(760, 10, 80, 30);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Any", "Area 1", "Area 2", "Area 3" }));
        jPanel4.add(jComboBox4);
        jComboBox4.setBounds(840, 10, 140, 30);

        jButton1.setText("Search");
        jPanel4.add(jButton1);
        jButton1.setBounds(1005, 10, 90, 30);

        jButton2.setText("Export To Excel");
        jPanel4.add(jButton2);
        jButton2.setBounds(30, 460, 160, 30);

        jButton3.setText("Sort by Date");
        jPanel4.add(jButton3);
        jButton3.setBounds(280, 460, 140, 30);

        jButton4.setText("Sort by Price");
        jPanel4.add(jButton4);
        jButton4.setBounds(440, 460, 130, 30);

        jButton5.setText("Sort by Area");
        jPanel4.add(jButton5);
        jButton5.setBounds(600, 460, 130, 30);

        jButton6.setText("Sort by Location");
        jPanel4.add(jButton6);
        jButton6.setBounds(760, 460, 120, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailsActionPerformed

    }//GEN-LAST:event_btnDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel recieptAddProdError;
    private javax.swing.JTable recieptTable;
    // End of variables declaration//GEN-END:variables
}
