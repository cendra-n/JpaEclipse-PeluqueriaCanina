package igu;

import javax.swing.JOptionPane;
import logica.Controladora;
import logica.Mascota;

/**
 *
 * @author Nadia Cendra
 * 
 */
public class ModificarDatos extends javax.swing.JFrame {
    Controladora control = null;
     Mascota masco; //la declaro como global para poder usarla en guardar y cargarDatos
    int numCliente;
        
    public ModificarDatos(int numCliente) {
        control = new Controladora();
        
        initComponents(); 
        
        cargarDatos(numCliente);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoTotal = new javax.swing.JPanel();
        tono = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        txtnombreM = new javax.swing.JLabel();
        txtraza = new javax.swing.JLabel();
        txtcolor = new javax.swing.JLabel();
        txtalergico = new javax.swing.JLabel();
        txtatencion = new javax.swing.JLabel();
        txtnameD = new javax.swing.JLabel();
        txtdnid = new javax.swing.JLabel();
        txtobservacion = new javax.swing.JLabel();
        txtNombreM = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        comboAlergico = new javax.swing.JComboBox<>();
        comboAtencion = new javax.swing.JComboBox<>();
        txtNombreD = new javax.swing.JTextField();
        txtDniD = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaObservacion = new javax.swing.JTextArea();
        txtcelular1 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        panelimagen = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoTotal.setBackground(new java.awt.Color(204, 204, 204));

        tono.setBackground(new java.awt.Color(0, 51, 51));
        tono.setForeground(new java.awt.Color(51, 51, 51));

        titulo.setBackground(new java.awt.Color(204, 204, 204));
        titulo.setFont(new java.awt.Font("Sitka Banner", 3, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Modificar Datos");

        javax.swing.GroupLayout tonoLayout = new javax.swing.GroupLayout(tono);
        tono.setLayout(tonoLayout);
        tonoLayout.setHorizontalGroup(
            tonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tonoLayout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tonoLayout.setVerticalGroup(
            tonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tonoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelDatos.setBackground(new java.awt.Color(204, 204, 204));
        panelDatos.setForeground(new java.awt.Color(0, 0, 0));

        txtnombreM.setFont(new java.awt.Font("Sitka Banner", 3, 14)); // NOI18N
        txtnombreM.setForeground(new java.awt.Color(0, 0, 0));
        txtnombreM.setText("Nombre Mascota:");

        txtraza.setFont(new java.awt.Font("Sitka Banner", 3, 14)); // NOI18N
        txtraza.setForeground(new java.awt.Color(0, 0, 0));
        txtraza.setText("Raza:");

        txtcolor.setFont(new java.awt.Font("Sitka Banner", 3, 14)); // NOI18N
        txtcolor.setForeground(new java.awt.Color(0, 0, 0));
        txtcolor.setText("Color:");

        txtalergico.setFont(new java.awt.Font("Sitka Banner", 3, 14)); // NOI18N
        txtalergico.setForeground(new java.awt.Color(0, 0, 0));
        txtalergico.setText("Alergico/a:");

        txtatencion.setFont(new java.awt.Font("Sitka Banner", 3, 14)); // NOI18N
        txtatencion.setForeground(new java.awt.Color(0, 0, 0));
        txtatencion.setText("Atención Especial:");

        txtnameD.setFont(new java.awt.Font("Sitka Banner", 3, 14)); // NOI18N
        txtnameD.setForeground(new java.awt.Color(0, 0, 0));
        txtnameD.setText("Nombre Dueño:");

        txtdnid.setFont(new java.awt.Font("Sitka Banner", 3, 14)); // NOI18N
        txtdnid.setForeground(new java.awt.Color(0, 0, 0));
        txtdnid.setText("Dni Dueño:");

        txtobservacion.setFont(new java.awt.Font("Sitka Banner", 3, 14)); // NOI18N
        txtobservacion.setForeground(new java.awt.Color(0, 0, 0));
        txtobservacion.setText("Observaciones:");

        txtNombreM.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreM.setForeground(new java.awt.Color(0, 0, 0));

        txtRaza.setBackground(new java.awt.Color(255, 255, 255));
        txtRaza.setForeground(new java.awt.Color(0, 0, 0));

        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setForeground(new java.awt.Color(0, 0, 0));

        comboAlergico.setBackground(new java.awt.Color(255, 255, 255));
        comboAlergico.setForeground(new java.awt.Color(0, 0, 0));
        comboAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

        comboAtencion.setBackground(new java.awt.Color(255, 255, 255));
        comboAtencion.setForeground(new java.awt.Color(0, 0, 0));
        comboAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SI", "NO" }));

        txtNombreD.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreD.setForeground(new java.awt.Color(0, 0, 0));

        txtDniD.setBackground(new java.awt.Color(255, 255, 255));
        txtDniD.setForeground(new java.awt.Color(0, 0, 0));

        areaObservacion.setBackground(new java.awt.Color(255, 255, 255));
        areaObservacion.setColumns(20);
        areaObservacion.setForeground(new java.awt.Color(0, 0, 0));
        areaObservacion.setRows(5);
        jScrollPane1.setViewportView(areaObservacion);

        txtcelular1.setFont(new java.awt.Font("Sitka Banner", 3, 14)); // NOI18N
        txtcelular1.setForeground(new java.awt.Color(0, 0, 0));
        txtcelular1.setText("Celular Dueño:");

        txtCelular.setBackground(new java.awt.Color(255, 255, 255));
        txtCelular.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnombreM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtraza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcolor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtalergico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtatencion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnameD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtdnid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtobservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtcelular1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDniD, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelDatosLayout.createSequentialGroup()
                            .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(235, 235, 235))
                        .addComponent(txtRaza, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtColor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombreD, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombreM)
                    .addComponent(txtNombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtraza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcolor))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtalergico)
                    .addComponent(comboAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtatencion)
                    .addComponent(comboAtencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnameD)
                    .addComponent(txtNombreD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdnid)
                    .addComponent(txtDniD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcelular1))
                .addGap(22, 22, 22)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtobservacion)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelimagen.setBackground(new java.awt.Color(204, 204, 204));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logoFinal (1).png"))); // NOI18N

        javax.swing.GroupLayout panelimagenLayout = new javax.swing.GroupLayout(panelimagen);
        panelimagen.setLayout(panelimagenLayout);
        panelimagenLayout.setHorizontalGroup(
            panelimagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelimagenLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelimagenLayout.setVerticalGroup(
            panelimagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelimagenLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBotones.setBackground(new java.awt.Color(204, 204, 204));

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setFont(new java.awt.Font("Segoe UI Semilight", 3, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI Semilight", 3, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardarCambios.setBackground(new java.awt.Color(153, 153, 153));
        btnGuardarCambios.setFont(new java.awt.Font("Segoe UI Semilight", 3, 18)); // NOI18N
        btnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Guardar.png"))); // NOI18N
        btnGuardarCambios.setText("Guardar cambios");
        btnGuardarCambios.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout fondoTotalLayout = new javax.swing.GroupLayout(fondoTotal);
        fondoTotal.setLayout(fondoTotalLayout);
        fondoTotalLayout.setHorizontalGroup(
            fondoTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelimagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoTotalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        fondoTotalLayout.setVerticalGroup(
            fondoTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoTotalLayout.createSequentialGroup()
                .addComponent(tono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoTotalLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(panelimagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoTotalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        //
        this.dispose(); //cierra esta ventana actual
        Principal prin = new Principal(); //nueva instancia de principal
        prin.setVisible(true); //se muestra principal
        prin.setLocationRelativeTo(null); //principal se muestra en el centro
        //boton para volver
    }//GEN-LAST:event_btnVolverActionPerformed

    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // este boton limpia los datos cargados
        txtNombreM.setText(" "); //pone un vacio en el campo name mascota
        txtRaza.setText(" ");
        txtColor.setText(" ");
        comboAlergico.setSelectedIndex(0); //setea el valor del combo box, lo vuelve a la posicion inicial
        comboAtencion.setSelectedIndex(0);
        txtNombreD.setText(" "); //pone un vacio en el nombre del dueño
        txtDniD.setText(" "); //dni dueño
        txtCelular.setText(" ");
        areaObservacion.setText(" "); //pone en vacio el textArea
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        //datos mascota
        String nombreMas = txtNombreM.getText(); //nombre mascota
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String alergico= (String) comboAlergico.getSelectedItem(); //el resultado lo castea y lo pasa a string antes de pasarlo a la variable
        String atencion = (String) comboAtencion.getSelectedItem();
        String observacion = areaObservacion.getText();
        
        //datos dueño
        String nombreDue = txtNombreD.getText();//nombre dueño
        String dniDuenio= txtDniD.getText();
        String celular = txtCelular.getText();
        
        
        //metodo gral que va a modificar mascota pero también va a recibir los datos del dueño 
         control.modificarDatos(masco,nombreMas,raza,color,alergico,atencion, nombreDue,dniDuenio, celular, observacion);
        
         //salio todo bien
         JOptionPane.showMessageDialog(null, "La información fue Editada con éxito en la BD.", "Edición exitosa", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaObservacion;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> comboAlergico;
    private javax.swing.JComboBox<String> comboAtencion;
    private javax.swing.JPanel fondoTotal;
    private javax.swing.JLabel imagen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelimagen;
    private javax.swing.JLabel titulo;
    private javax.swing.JPanel tono;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDniD;
    private javax.swing.JTextField txtNombreD;
    private javax.swing.JTextField txtNombreM;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JLabel txtalergico;
    private javax.swing.JLabel txtatencion;
    private javax.swing.JLabel txtcelular1;
    private javax.swing.JLabel txtcolor;
    private javax.swing.JLabel txtdnid;
    private javax.swing.JLabel txtnameD;
    private javax.swing.JLabel txtnombreM;
    private javax.swing.JLabel txtobservacion;
    private javax.swing.JLabel txtraza;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int numCliente) {
       this.masco = control.traerUnaMascota(numCliente);
        
        txtNombreM.setText(masco.getNombrePerro()); 
        txtRaza.setText(masco.getRaza());
        txtColor.setText(masco.getColor());
        txtNombreD.setText(masco.getUnDuenio().getNombreDuenio()); 
        txtDniD.setText(String.valueOf(masco.getUnDuenio().getDniDuenio()));
        txtCelular.setText(masco.getUnDuenio().getCelDuenio());
        areaObservacion.setText(masco.getObservaciones()); 
        
        if(masco.getAlergico().equalsIgnoreCase("SI")){ // VALOR 0 ES EL GUION - del comboBox
           comboAlergico.setSelectedIndex(1); 
        }
        else{
            comboAlergico.setSelectedIndex(2); 
        }
            
        if(masco.getAtencionEspecial().equalsIgnoreCase("SI")){ // VALOR 0 ES EL GUION -
           comboAtencion.setSelectedIndex(1);
        }
        else{
            comboAtencion.setSelectedIndex(2);
        }
        
    }
}
