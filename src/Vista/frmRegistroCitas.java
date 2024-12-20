/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Acer
 */
public class frmRegistroCitas extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmRegistrarCitas
     */
    public frmRegistroCitas() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jdtc_FechaCita = new com.toedter.calendar.JDateChooser();
        cbx_Doctor = new javax.swing.JComboBox<>();
        btn_buscar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_RCitas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txa_Motivo = new javax.swing.JTextArea();
        btn_actualizar = new javax.swing.JButton();
        txt_CodMascota = new javax.swing.JTextField();
        cbx_tipo_cita = new javax.swing.JComboBox<>();
        txt_codigoCita = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 620));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REGISTRO CITAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, -1));

        jdtc_FechaCita.setBackground(new java.awt.Color(255, 255, 255));
        jdtc_FechaCita.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "FECHA CITA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jdtc_FechaCita.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(jdtc_FechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 170, 50));

        cbx_Doctor.setBackground(new java.awt.Color(255, 255, 255));
        cbx_Doctor.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbx_Doctor.setForeground(new java.awt.Color(0, 0, 0));
        cbx_Doctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_Doctor.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DOCTOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(cbx_Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 170, 50));

        btn_buscar.setBackground(new java.awt.Color(204, 204, 255));
        btn_buscar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar.setText("BUSCAR");
        btn_buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 80, 90, 50));

        btn_guardar.setBackground(new java.awt.Color(204, 255, 204));
        btn_guardar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_guardar.setForeground(new java.awt.Color(0, 0, 0));
        btn_guardar.setText("GUARDAR");
        btn_guardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 80, 110, 50));

        btn_Eliminar.setBackground(new java.awt.Color(255, 204, 204));
        btn_Eliminar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Eliminar.setText("ELIMINAR");
        btn_Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 140, 90, 50));

        tbl_RCitas.setBackground(new java.awt.Color(255, 255, 255));
        tbl_RCitas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbl_RCitas.setForeground(new java.awt.Color(0, 0, 0));
        tbl_RCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_RCitas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 1170, 360));

        txa_Motivo.setBackground(new java.awt.Color(255, 255, 255));
        txa_Motivo.setColumns(20);
        txa_Motivo.setForeground(new java.awt.Color(0, 0, 0));
        txa_Motivo.setRows(5);
        txa_Motivo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "MOTIVO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane2.setViewportView(txa_Motivo);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, -1, 120));

        btn_actualizar.setBackground(new java.awt.Color(204, 255, 255));
        btn_actualizar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_actualizar.setForeground(new java.awt.Color(0, 0, 0));
        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 140, 110, 50));

        txt_CodMascota.setBackground(new java.awt.Color(255, 255, 255));
        txt_CodMascota.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_CodMascota.setForeground(new java.awt.Color(0, 0, 0));
        txt_CodMascota.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CODIGO MASCOTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(txt_CodMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, 50));

        cbx_tipo_cita.setBackground(new java.awt.Color(255, 255, 255));
        cbx_tipo_cita.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbx_tipo_cita.setForeground(new java.awt.Color(0, 0, 0));
        cbx_tipo_cita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_tipo_cita.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TIPO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(cbx_tipo_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 170, 50));

        txt_codigoCita.setBackground(new java.awt.Color(255, 255, 255));
        txt_codigoCita.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_codigoCita.setForeground(new java.awt.Color(0, 0, 0));
        txt_codigoCita.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CODIGO CITA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        txt_codigoCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoCitaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_codigoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void txt_codigoCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoCitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Eliminar;
    public javax.swing.JButton btn_actualizar;
    public javax.swing.JButton btn_buscar;
    public javax.swing.JButton btn_guardar;
    public javax.swing.JComboBox<String> cbx_Doctor;
    public javax.swing.JComboBox<String> cbx_tipo_cita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public com.toedter.calendar.JDateChooser jdtc_FechaCita;
    public javax.swing.JTable tbl_RCitas;
    public javax.swing.JTextArea txa_Motivo;
    public javax.swing.JTextField txt_CodMascota;
    public javax.swing.JTextField txt_codigoCita;
    // End of variables declaration//GEN-END:variables
}
