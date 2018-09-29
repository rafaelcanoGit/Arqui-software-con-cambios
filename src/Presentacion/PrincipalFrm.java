/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Conexion;
import Presentacion.PAdministrarLibros.AutorFrm;
import Presentacion.PAdministrarLibros.CategoriaFrm;
import Presentacion.PAdministrarLibros.EditorialFrm;
import Presentacion.PAdministrarLibros.LibroFrm;
import Presentacion.PAdministrarPrestamos.BibliotecarioFrm;
import Presentacion.PAdministrarPrestamos.FichaPrestamoFrm;
import Presentacion.PAdministrarPrestamos.LectorFrm;

/**
 *
 * @author mauriballes
 */
public class PrincipalFrm extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalFrm
     */
    public PrincipalFrm() {
        initComponents();
        Conexion.getInstancia();
        this.setTitle("Biblioteca");
        this.setLocationRelativeTo(null);
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
        MenuBar = new javax.swing.JMenuBar();
        PrestamosMenu = new javax.swing.JMenu();
        BibliotecarioMenuItem = new javax.swing.JMenuItem();
        LectorMenuItem = new javax.swing.JMenuItem();
        FichaPrestamoMenuItem = new javax.swing.JMenuItem();
        LibrosMenu = new javax.swing.JMenu();
        LibroMenuItem = new javax.swing.JMenuItem();
        AutorMenuItem = new javax.swing.JMenuItem();
        EditorialMenuItem = new javax.swing.JMenuItem();
        CategoriaMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );

        PrestamosMenu.setText("Administrar Prestamos");

        BibliotecarioMenuItem.setText("Bibliotecario");
        BibliotecarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BibliotecarioMenuItemActionPerformed(evt);
            }
        });
        PrestamosMenu.add(BibliotecarioMenuItem);

        LectorMenuItem.setText("Lector");
        LectorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LectorMenuItemActionPerformed(evt);
            }
        });
        PrestamosMenu.add(LectorMenuItem);

        FichaPrestamoMenuItem.setText("Ficha de Prestamo");
        FichaPrestamoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FichaPrestamoMenuItemActionPerformed(evt);
            }
        });
        PrestamosMenu.add(FichaPrestamoMenuItem);

        MenuBar.add(PrestamosMenu);

        LibrosMenu.setText("Administrar Libros");

        LibroMenuItem.setText("Libro");
        LibroMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibroMenuItemActionPerformed(evt);
            }
        });
        LibrosMenu.add(LibroMenuItem);

        AutorMenuItem.setText("Autor");
        AutorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorMenuItemActionPerformed(evt);
            }
        });
        LibrosMenu.add(AutorMenuItem);

        EditorialMenuItem.setText("Editorial");
        EditorialMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditorialMenuItemActionPerformed(evt);
            }
        });
        LibrosMenu.add(EditorialMenuItem);

        CategoriaMenuItem.setText("Categoria");
        CategoriaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaMenuItemActionPerformed(evt);
            }
        });
        LibrosMenu.add(CategoriaMenuItem);

        MenuBar.add(LibrosMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(54, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BibliotecarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BibliotecarioMenuItemActionPerformed
        BibliotecarioFrm.main(null);
    }//GEN-LAST:event_BibliotecarioMenuItemActionPerformed

    private void LectorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LectorMenuItemActionPerformed
        LectorFrm.main(null);
    }//GEN-LAST:event_LectorMenuItemActionPerformed

    private void FichaPrestamoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FichaPrestamoMenuItemActionPerformed
        FichaPrestamoFrm.main(null);
    }//GEN-LAST:event_FichaPrestamoMenuItemActionPerformed

    private void LibroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibroMenuItemActionPerformed
        LibroFrm.main(null);
    }//GEN-LAST:event_LibroMenuItemActionPerformed

    private void AutorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorMenuItemActionPerformed
        AutorFrm.main(null);
    }//GEN-LAST:event_AutorMenuItemActionPerformed

    private void EditorialMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditorialMenuItemActionPerformed
        EditorialFrm.main(null);
    }//GEN-LAST:event_EditorialMenuItemActionPerformed

    private void CategoriaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaMenuItemActionPerformed
        CategoriaFrm.main(null);
    }//GEN-LAST:event_CategoriaMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AutorMenuItem;
    private javax.swing.JMenuItem BibliotecarioMenuItem;
    private javax.swing.JMenuItem CategoriaMenuItem;
    private javax.swing.JMenuItem EditorialMenuItem;
    private javax.swing.JMenuItem FichaPrestamoMenuItem;
    private javax.swing.JMenuItem LectorMenuItem;
    private javax.swing.JMenuItem LibroMenuItem;
    private javax.swing.JMenu LibrosMenu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu PrestamosMenu;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}