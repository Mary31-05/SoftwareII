/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package co.edu.unicauca.mvc.vistas.evaluador;

import co.edu.unicauca.mvc.controladores.ArticuloServicio;
import co.edu.unicauca.mvc.modelos.Articulo;
import co.edu.unicauca.mvc.modelos.Autor;
import co.edu.unicauca.mvc.utilidades.Utilidades;
import java.util.ArrayList;

/**
 *
 * @author SANTIAGO DORADO
 */
public class VtnEvaluarPaper extends javax.swing.JFrame {
    private ArticuloServicio objSArticulo;
    private int id;
    
    /**
     * Creates new form evaluarPaper
     */
    public VtnEvaluarPaper(ArticuloServicio objSArticulo, int id) {
        initComponents();
        this.objSArticulo = objSArticulo;
        this.id = id;
        llenarDatos();
    }
    
    public void llenarDatos(){
        Articulo articulo = objSArticulo.consultarArticulo(id);
        StringBuilder autoresConcatenados = new StringBuilder();
        for (Autor autor : articulo.getAutores()) {
            if (autoresConcatenados.length() > 0) {
                autoresConcatenados.append(" - "); // Agregar una coma como separador
            }
            autoresConcatenados.append(autor.getNombre()).append(" ").append(autor.getApellido());
        }
        
        
        lblId.setText(""+articulo.getIdArticulo());
        lblTitulo.setText(articulo.getTitulo());
        lblResumen.setText(articulo.getResumen());
        lblPalabras.setText(articulo.getPalabrasClave());
        lblAutores.setText("" + autoresConcatenados);
        lblConferencia.setText(articulo.getObjConferencia().getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelCentral = new javax.swing.JPanel();
        jPanelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPalabras = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblAutores = new javax.swing.JLabel();
        lblResumen = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblConferencia = new javax.swing.JLabel();
        jPanelEvaluar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentarios = new javax.swing.JTextArea();
        btnEvaluar = new javax.swing.JButton();
        jPanelInferior = new javax.swing.JPanel();

        jPanelSuperior.setPreferredSize(new java.awt.Dimension(0, 30));

        jLabel1.setText("Evaluar Paper");

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelCentral.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Id:");

        lblId.setText("id");

        jLabel4.setText("Titulo: ");

        jLabel6.setText("Resumen:");

        lblTitulo.setText("titulo");

        jLabel7.setText("Palabras clave: ");

        lblPalabras.setText("palabras");

        jLabel9.setText("Autores: ");

        lblAutores.setText("autores");

        lblResumen.setText("resumen");

        jLabel12.setText("Conferencia: ");

        lblConferencia.setText("conferencia");

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDatosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelDatosLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblConferencia))
                        .addGroup(jPanelDatosLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelDatosLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblTitulo))
                        .addGroup(jPanelDatosLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(lblId))
                        .addGroup(jPanelDatosLayout.createSequentialGroup()
                            .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanelDatosLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(41, 41, 41)))
                            .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAutores)
                                .addComponent(lblPalabras))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
            .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelDatosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblId))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(lblTitulo))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelDatosLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(78, 78, 78)
                            .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(lblPalabras))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(lblAutores)))
                        .addComponent(lblResumen, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(lblConferencia))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanelCentral.add(jPanelDatos, java.awt.BorderLayout.PAGE_START);

        jLabel14.setText("Comentarios:");

        txtComentarios.setColumns(20);
        txtComentarios.setRows(5);
        jScrollPane1.setViewportView(txtComentarios);

        btnEvaluar.setText("Evaluar");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEvaluarLayout = new javax.swing.GroupLayout(jPanelEvaluar);
        jPanelEvaluar.setLayout(jPanelEvaluarLayout);
        jPanelEvaluarLayout.setHorizontalGroup(
            jPanelEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEvaluarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEvaluarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEvaluar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelEvaluarLayout.setVerticalGroup(
            jPanelEvaluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEvaluarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEvaluar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCentral.add(jPanelEvaluar, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanelInferiorLayout = new javax.swing.GroupLayout(jPanelInferior);
        jPanelInferior.setLayout(jPanelInferiorLayout);
        jPanelInferiorLayout.setHorizontalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        jPanelInferiorLayout.setVerticalGroup(
            jPanelInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        String comentario;
        boolean bandera;
        
        comentario = txtComentarios.getText();
        Articulo articulo = objSArticulo.consultarArticulo(id);
        bandera = articulo.addComentario(comentario);
        
        if (bandera == true) {
            Utilidades.mensajeExito("Registro exitoso", "Registro exitoso");
            objSArticulo.cambiarEstado(id, 2);
            dispose();
        } else {
            Utilidades.mensajeError("Comentario no almacenado", "Error al almacenar el comentario");
        }
    }//GEN-LAST:event_btnEvaluarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelEvaluar;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAutores;
    private javax.swing.JLabel lblConferencia;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPalabras;
    private javax.swing.JLabel lblResumen;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtComentarios;
    // End of variables declaration//GEN-END:variables
}
