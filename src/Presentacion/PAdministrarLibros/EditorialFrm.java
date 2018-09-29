/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.PAdministrarLibros;

import Negocio.NAdministrarLibros.EditorialNegocio;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mauriballes
 */
public class EditorialFrm extends javax.swing.JFrame {

    /**
     * Creates new form EditorialFrm
     */
    private EditorialNegocio m_EditorialNegocio;

    public EditorialFrm() {
        initComponents();
        this.setTitle("Gestionar Editorial");
        this.setLocationRelativeTo(null);
        m_EditorialNegocio = new EditorialNegocio();
        inicializar();
    }

    public void eliminarEditorial() {
        int fila = tableEditoriales.getSelectedRow();
        DefaultTableModel editorialesUpdated = (DefaultTableModel) tableEditoriales.getModel();
        m_EditorialNegocio.eliminarEditorial(Integer.parseInt(editorialesUpdated.getValueAt(fila, 0).toString()));
        editorialesUpdated.removeRow(fila);
        textNombre.setText("");
        textDireccion.setText("");
        textTelefono.setText("");
    }

    public void inicializar() {
        obtenerEditoriales();
    }

    public void modificarEditorial() {
        String[] tableHeader = new String[]{"id", "nombre", "telefono", "direccion"};
        int fila = tableEditoriales.getSelectedRow();
        DefaultTableModel editorialesUpdated = (DefaultTableModel) tableEditoriales.getModel();
        m_EditorialNegocio.modificarEditorial(
                Integer.parseInt(editorialesUpdated.getValueAt(fila, Arrays.asList(tableHeader).indexOf("id")).toString()),
                textNombre.getText(),
                textDireccion.getText(),
                Integer.parseInt(textTelefono.getText()));
        editorialesUpdated.setValueAt(textNombre.getText(), fila, Arrays.asList(tableHeader).indexOf("nombre"));
        editorialesUpdated.setValueAt(textDireccion.getText(), fila, Arrays.asList(tableHeader).indexOf("direccion"));
        editorialesUpdated.setValueAt(textTelefono.getText(), fila, Arrays.asList(tableHeader).indexOf("telefono"));
    }

    public void obtenerEditoriales() {
        DefaultTableModel editoriales = m_EditorialNegocio.obtenerEditoriales();
        tableEditoriales.setModel(editoriales);
    }

    public void registrarEditorial() {
        int id = m_EditorialNegocio.registrarEditorial(
                textNombre.getText(),
                textDireccion.getText(),
                Integer.parseInt(textTelefono.getText()));
        DefaultTableModel editorialesUpdted = (DefaultTableModel) tableEditoriales.getModel();
        editorialesUpdted.addRow(new Object[]{
            id,
            textNombre.getText(),
            textTelefono.getText(),
            textDireccion.getText()
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonRegistrar = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();
        textDireccion = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        labelNombre = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEditoriales = new javax.swing.JTable();
        textTelefono = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonRegistrar.setText("Registrar");
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });

        buttonModificar.setText("Modificar");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });

        buttonEliminar.setText("Eliminar");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });

        labelNombre.setText("Nombre");

        labelDireccion.setText("Direccion");

        tableEditoriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Telefono", "Direccion"
            }
        ));
        tableEditoriales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEditorialesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEditoriales);

        labelTelefono.setText("Telefono");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(buttonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(149, 149, 149)
                        .addComponent(buttonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre)
                            .addComponent(labelDireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textDireccion))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegistrar)
                    .addComponent(buttonModificar)
                    .addComponent(buttonEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        registrarEditorial();
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void tableEditorialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEditorialesMouseClicked
        int fila = tableEditoriales.getSelectedRow();
        String[] tableHeader = new String[]{"id", "nombre", "telefono", "direccion"};
        DefaultTableModel editores = (DefaultTableModel) tableEditoriales.getModel();
        textNombre.setText(String.valueOf(editores.getValueAt(fila, Arrays.asList(tableHeader).indexOf("nombre"))));
        textDireccion.setText(String.valueOf(editores.getValueAt(fila, Arrays.asList(tableHeader).indexOf("direccion"))));
        textTelefono.setText(String.valueOf(editores.getValueAt(fila, Arrays.asList(tableHeader).indexOf("telefono"))));
    }//GEN-LAST:event_tableEditorialesMouseClicked

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        modificarEditorial();
    }//GEN-LAST:event_buttonModificarActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        eliminarEditorial();
    }//GEN-LAST:event_buttonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(EditorialFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorialFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorialFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorialFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorialFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JTable tableEditoriales;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    // End of variables declaration//GEN-END:variables
}
