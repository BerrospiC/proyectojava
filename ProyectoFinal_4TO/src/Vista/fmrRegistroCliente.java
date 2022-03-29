
package Vista;

import Controlador.ArchivoRegistroCliente;
import Controlador.ListaDobleRegistroCliente;
import Modelo.RegistroCliente;
import com.sun.prism.paint.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class fmrRegistroCliente extends javax.swing.JFrame {
    ListaDobleRegistroCliente lista = new ListaDobleRegistroCliente();
    ArchivoRegistroCliente objFile = new ArchivoRegistroCliente();
  String[] cab = {"Codigo", "Nombres", "Apellidos", "Estado Civil", "Sexo","Ruc","Celular","DNI","Edad"};
    DefaultTableModel modelo = new DefaultTableModel(null, cab);
    RegistroCliente ObjClie;
  FondoPanel fondo = new FondoPanel();
        String code; 
        String nomb; 
        String apell; 
        String estado; 
        String sexo; 
        String ruc; 
        String cel;
        String dni;
        String edad;
    
    public fmrRegistroCliente() {
        this.setContentPane(fondo);
        initComponents();
      
        jtabla.setModel(modelo);
        cargarArchivo();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbsexo = new javax.swing.JComboBox<>();
        txtruc = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        txtcodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        cmbestadocivil = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cmbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Su Sexo :", "MASCULINO", "FEMENINA" }));
        cmbsexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo:"));

        txtruc.setBorder(javax.swing.BorderFactory.createTitledBorder("Ruc:"));

        txtcelular.setBorder(javax.swing.BorderFactory.createTitledBorder("Celular:"));

        txtdni.setBorder(javax.swing.BorderFactory.createTitledBorder("Dni:"));

        txtedad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad:"));

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtcodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo:"));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtnombres.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombres:"));

        txtapellidos.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellidos:"));

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        cmbestadocivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su EstadoCivil:", "Soltero", "Casado", "Viudo", "Divorciado" }));
        cmbestadocivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado Civil:"));

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jtabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtabla);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE CLIENTES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombres, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtruc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(77, 77, 77)
                                        .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbsexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbestadocivil, 0, 224, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(77, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbestadocivil, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbsexo, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (!lista.Validacion(txtcodigo.getText())) {
            capturarEntradas();
            
            lista.insertarFinal(new RegistroCliente(code, nomb, apell, estado, sexo, ruc , cel,dni, edad));
            
            mostrarTabla(0);
            
            try {
                objFile.insertar(new RegistroCliente(code, nomb, apell, estado, sexo, ruc , cel,dni, edad));
            } catch (Exception e) {
            }
            
            
    }                                                 
    
    else            
            JOptionPane.showMessageDialog(this, "El codigo " + txtcodigo.getText() + " ya existe");
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
             String cod = txtcodigo.getText();
        ObjClie = lista.buscarAtras(cod);
        
        if (ObjClie != null) {
            txtnombres.setText(ObjClie.getNombres());
            txtapellidos.setText(ObjClie.getApellidos());
            cmbestadocivil.setSelectedItem(ObjClie.getEstadoCivil());
            cmbsexo.setSelectedItem(ObjClie.getSexo());
            txtruc.setText(ObjClie.getRuc());
            txtcelular.setText(ObjClie.getCelular());
            txtdni.setText(ObjClie.getDni());
            txtedad.setText(ObjClie.getEdad());
            
        } else {
            JOptionPane.showMessageDialog(this, "El codigo " + cod + " no existe");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        capturarEntradas();
        if (JOptionPane.showConfirmDialog(this, "Esta seguro de actualizar") == 0) {
            if (lista.actualizar(new RegistroCliente(code, nomb, apell, estado, sexo, ruc , cel,dni, edad))) {
                JOptionPane.showMessageDialog(this, "Se actualizó correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "No se actualizó ya que el código no existe");
            }
            mostrarTabla(0);
            
            try {
                objFile.actualizar(lista.listarAdel());
            } catch (Exception e) {
            }
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
            String cod = txtcodigo.getText();
        if (JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar") == 0) {
            if (lista.eliminar(cod)) {
                JOptionPane.showMessageDialog(this, "Se eliminó correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "No se eliminó ya que el código no existe");
            }
            mostrarTabla(0);
            
            try {
                objFile.actualizar(lista.listarAdel());
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_btnEliminarActionPerformed
    private void mostrarTabla(int tipo) {  //0.listarAdel  1. listarAtras
        modelo.setRowCount(0); //limpiar tabla
        switch (tipo) {
            case 0: {
                for (RegistroCliente p : lista.listarAdel()) {
                    Object[] fila = {p.getCodigo(), p.getNombres(),p.getApellidos(), p.getEstadoCivil(), p.getSexo(), p.getRuc(),p.getCelular(),p.getDni(),p.getEdad()};
                    modelo.addRow(fila);
                }
            }
            break;
            case 1: {
                for (RegistroCliente p : lista.listarAtras()) {
                    Object[] fila = {p.getCodigo(), p.getNombres(),p.getApellidos(), p.getEstadoCivil(), p.getSexo(), p.getRuc(),p.getCelular(),p.getDni(),p.getEdad()};
                    modelo.addRow(fila);
                }
            }
            break;
        }
        
    }
    private void capturarEntradas() {
        code = txtcodigo.getText();
        nomb = txtnombres.getText();
        apell = txtapellidos.getText();
        estado = cmbestadocivil.getSelectedItem().toString();
        sexo = cmbsexo.getSelectedItem().toString();
        ruc = txtruc.getText();
        cel= txtcelular.getText();
        dni= txtdni.getText();
        edad=txtedad.getText();
        
    }
     
   
    
    
    private void cargarArchivo() {
        try {
            objFile.leer();
            for (RegistroCliente p : objFile.array) {
                Object[] fila = {p.getCodigo(), p.getNombres(),p.getApellidos(), p.getEstadoCivil(), p.getSexo(), p.getRuc(),p.getCelular(),p.getDni(),p.getEdad()};
                modelo.addRow(fila);
                lista.insertarFinal(p);  //sincronización entre archivo de texto y la estructura de datos.
            }
        } catch (Exception e) {
        }
    }
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
            java.util.logging.Logger.getLogger(fmrRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fmrRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fmrRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fmrRegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmrRegistroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbestadocivil;
    private javax.swing.JComboBox<String> cmbsexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabla;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtruc;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel
    {
        private Image imagen;
        
       @Override
       public void paint(Graphics g)
        {
    imagen = new ImageIcon(getClass().getResource("/Imagenes/cliente.jpg")).getImage();
            
           g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            
            setOpaque(false);
            
           super.paint(g);
       
    }

}
}