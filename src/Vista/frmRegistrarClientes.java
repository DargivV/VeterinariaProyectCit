/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Acer
 */
public class frmRegistrarClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistrarClientes
     */
    public frmRegistrarClientes() {
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
        txt_nombre = new javax.swing.JTextField();
        txt_apellidoP = new javax.swing.JTextField();
        txt_apellidoM = new javax.swing.JTextField();
        txt_DNI = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jdtc_FechaNacimiento = new com.toedter.calendar.JDateChooser();
        txt_direccion = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_RCliente = new javax.swing.JTable();
        btn_Actualisar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REGISTRO CLIENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "NOMBRES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 220, 50));

        txt_apellidoP.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellidoP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_apellidoP.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellidoP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "APELLIDO PATERNO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(txt_apellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 170, 50));

        txt_apellidoM.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellidoM.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_apellidoM.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellidoM.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "APELLIDO MATERNO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(txt_apellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 180, 50));

        txt_DNI.setBackground(new java.awt.Color(255, 255, 255));
        txt_DNI.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_DNI.setForeground(new java.awt.Color(0, 0, 0));
        txt_DNI.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DNI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(txt_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, 50));

        txt_telefono.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(0, 0, 0));
        txt_telefono.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TELEFONO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 150, 50));

        jdtc_FechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        jdtc_FechaNacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "FECHA NACIMIENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jdtc_FechaNacimiento.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(jdtc_FechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, 180, 50));

        txt_direccion.setBackground(new java.awt.Color(255, 255, 255));
        txt_direccion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(0, 0, 0));
        txt_direccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DIRECCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 330, 50));

        txt_correo.setBackground(new java.awt.Color(255, 255, 255));
        txt_correo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_correo.setForeground(new java.awt.Color(0, 0, 0));
        txt_correo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CORREO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        txt_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 260, 50));

        btn_buscar.setBackground(new java.awt.Color(204, 204, 255));
        btn_buscar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_buscar.setForeground(new java.awt.Color(0, 0, 0));
        btn_buscar.setText("BUSCAR");
        btn_buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, 120, 40));

        btn_registrar.setBackground(new java.awt.Color(204, 255, 204));
        btn_registrar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrar.setText("REGISTRAR");
        btn_registrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, 110, 40));

        btn_eliminar.setBackground(new java.awt.Color(255, 204, 204));
        btn_eliminar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 80, 100, 40));

        tbl_RCliente.setBackground(new java.awt.Color(255, 255, 255));
        tbl_RCliente.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbl_RCliente.setForeground(new java.awt.Color(0, 0, 0));
        tbl_RCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_RCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 1170, 360));

        btn_Actualisar.setBackground(new java.awt.Color(204, 255, 255));
        btn_Actualisar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_Actualisar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Actualisar.setText("ACTUALIZAR");
        btn_Actualisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btn_Actualisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 140, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Actualisar;
    public javax.swing.JButton btn_buscar;
    public javax.swing.JButton btn_eliminar;
    public javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public com.toedter.calendar.JDateChooser jdtc_FechaNacimiento;
    public javax.swing.JTable tbl_RCliente;
    public javax.swing.JTextField txt_DNI;
    public javax.swing.JTextField txt_apellidoM;
    public javax.swing.JTextField txt_apellidoP;
    public javax.swing.JTextField txt_correo;
    public javax.swing.JTextField txt_direccion;
    public javax.swing.JTextField txt_nombre;
    public javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
