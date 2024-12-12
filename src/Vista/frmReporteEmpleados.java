/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author Acer
 */
public class frmReporteEmpleados extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmReporteEmpleados
     */
    public frmReporteEmpleados() {
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
        jdtc_FechaNacimiento = new com.toedter.calendar.JDateChooser();
        cbx_Turno = new javax.swing.JComboBox<>();
        cbx_TipoEmpleado = new javax.swing.JComboBox<>();
        cbx_TipoBusqueda = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_RPEmpleados = new javax.swing.JTable();
        btn_consultar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REPORTE EMPLEADOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "NOMBRES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 190, 50));

        txt_apellidoP.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellidoP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_apellidoP.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellidoP.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "APELLIDO PATERNO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(txt_apellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 150, 50));

        txt_apellidoM.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellidoM.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_apellidoM.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellidoM.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "APELLIDO MATERNO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(txt_apellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 160, 50));

        jdtc_FechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        jdtc_FechaNacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "F. NACIMIENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jdtc_FechaNacimiento.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(jdtc_FechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 140, 50));

        cbx_Turno.setBackground(new java.awt.Color(255, 255, 255));
        cbx_Turno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbx_Turno.setForeground(new java.awt.Color(0, 0, 0));
        cbx_Turno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_Turno.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TURNO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(cbx_Turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 70, 110, 50));

        cbx_TipoEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        cbx_TipoEmpleado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbx_TipoEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        cbx_TipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_TipoEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TIPO EMPLEADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        cbx_TipoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_TipoEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(cbx_TipoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 150, 50));

        cbx_TipoBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        cbx_TipoBusqueda.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbx_TipoBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        cbx_TipoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_TipoBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TIPO DE BUSQUEDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.add(cbx_TipoBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 70, 150, 50));

        tbl_RPEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        tbl_RPEmpleados.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbl_RPEmpleados.setForeground(new java.awt.Color(0, 0, 0));
        tbl_RPEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_RPEmpleados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 1170, 420));

        btn_consultar.setBackground(new java.awt.Color(204, 255, 204));
        btn_consultar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_consultar.setForeground(new java.awt.Color(0, 0, 0));
        btn_consultar.setText("CONSULTAR");
        btn_consultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btn_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 110, 30));

        btn_nuevo.setBackground(new java.awt.Color(204, 255, 255));
        btn_nuevo.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_nuevo.setForeground(new java.awt.Color(0, 0, 0));
        btn_nuevo.setText("NUEVO");
        btn_nuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void cbx_TipoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_TipoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_TipoEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_consultar;
    public javax.swing.JButton btn_nuevo;
    public javax.swing.JComboBox<String> cbx_TipoBusqueda;
    public javax.swing.JComboBox<String> cbx_TipoEmpleado;
    public javax.swing.JComboBox<String> cbx_Turno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public com.toedter.calendar.JDateChooser jdtc_FechaNacimiento;
    public javax.swing.JTable tbl_RPEmpleados;
    public javax.swing.JTextField txt_apellidoM;
    public javax.swing.JTextField txt_apellidoP;
    public javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
