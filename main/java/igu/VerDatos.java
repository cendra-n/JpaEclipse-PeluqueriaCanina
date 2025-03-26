package igu;

//autor : Nadia Cendra

import java.util.List;
import logica.Controladora;
import javax.swing.table.DefaultTableModel;
import logica.Mascota;
import javax.swing.JOptionPane;


public class VerDatos extends javax.swing.JFrame {
    Controladora control= null; //como buena practica poner siempre valor a la variable global en los Jframe para que no haya errores
    
    public VerDatos() { //constructor
        control = new Controladora();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tonoVerde = new javax.swing.JLabel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        imagenLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panelFondo.setBackground(new java.awt.Color(204, 204, 204));
        panelFondo.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        tonoVerde.setBackground(new java.awt.Color(204, 204, 204));
        tonoVerde.setFont(new java.awt.Font("Sitka Banner", 3, 24)); // NOI18N
        tonoVerde.setForeground(new java.awt.Color(255, 255, 255));
        tonoVerde.setText("Ver datos de las mascotas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(tonoVerde)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tonoVerde)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTabla.setBackground(new java.awt.Color(204, 204, 204));

        tablaMascotas.setBackground(new java.awt.Color(204, 204, 204));
        tablaMascotas.setForeground(new java.awt.Color(0, 0, 0));
        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 51)));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/borrar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 51)));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 51)));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        imagenLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logochico.png"))); // NOI18N

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagenLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnEditar)
                        .addGap(27, 27, 27)
                        .addComponent(btnBorrar)
                        .addGap(31, 31, 31)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(imagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // este evento va a llamar a un metodo que cargara la tabla mientras se abre la ventana 
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose(); //cierra esta ventana actual
        Principal prin = new Principal(); //nueva instancia de principal
        prin.setVisible(true); //se muestra principal
        prin.setLocationRelativeTo(null); //principal se muestra en el centro
        //boton para volver
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
       //verificar si la tabla, no esta vacia
       if(tablaMascotas.getRowCount() > 0){ 
           //verificar que se haya seleccionado una fila para eliminar
          if(tablaMascotas.getSelectedRow() != -1){ //-1 indica que no hubo selección, ya que se arranca desde 0
              //guardo en la variable el valor que esta en la fila y columna 0 de la tabla de mascotas, este era string y se parseo a int antes de guardar
              int numCliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(),0))); 
              //llamo al método borrar
              control.borrarMascota(numCliente);
              JOptionPane.showMessageDialog(null, "Se elimino la mascota de la bd", "Borrado exitoso", JOptionPane.INFORMATION_MESSAGE);
              cargarTabla(); //vuelve a cargar la tabla pero esta vez actualizada, luego de la eliminacion
            }
            else{
               JOptionPane.showMessageDialog(null, "No selecciono ninguna fila para eliminar", "Alerta", JOptionPane.ERROR_MESSAGE);
            }
        }
       else{
          JOptionPane.showMessageDialog(null, "No hay registros para borrar", "Tabla Vacia", JOptionPane.ERROR_MESSAGE);
       }
       
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       if(tablaMascotas.getRowCount() > 0){ 
            //verificar que se haya seleccionado una fila para editar
           if(tablaMascotas.getSelectedRow() != -1){//-1 indica que no hubo selección, ya que se arranca desde 0
               //id de la mascota a editar
              int numCliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(),0))); 
              
              ModificarDatos pantallaModi = new ModificarDatos(numCliente); //instancia de la clase modificar datos
              pantallaModi.setVisible(true); //hacer visible la interfaz
              pantallaModi.setLocationRelativeTo(null); //colocarla en el centro sin relacion a ningun componente
              this.dispose(); //cierra ver datos, una vez que ya esta en modificar

           }
           else{
              JOptionPane.showMessageDialog(null, "No selecciono ninguna fila para editar", "Alerta", JOptionPane.ERROR_MESSAGE);

           }
       
       }
       else{
           JOptionPane.showMessageDialog(null, "No hay registros para editar", "Tabla Vacia", JOptionPane.ERROR_MESSAGE);
       }
            
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel imagenLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTable tablaMascotas;
    private javax.swing.JLabel tonoVerde;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //definir como queremos que sea el modelo de la tabla
       DefaultTableModel modeloTabla = new DefaultTableModel(){ //agregaremos que no se pueda acceder a la tabla sino es por los botones
           
           //no permite que las filas y columnas sean editables
           @Override // no mostraba las tablas porque no habiamos puesto override aca ya que era un metodo heredado y lo sobre escribimos para moldear filas y columnas
           public boolean isCellEditable(int row, int column){
              return false;
           }
           
       }; // se declaro como parte del default table model por eso pusimos ; al final
       
       //se establece el nombre de las columnas
       String [] titulos = {"Num", "Nombre", "Raza", "Color", "Alergico", "At.Especial", "Dueño","Dni", "Celu"};
       modeloTabla.setColumnIdentifiers(titulos); //seteamos el nombre de las columnas
       //modeloTabla es el molde
       
       //cargar los datos desde la bd
       List <Mascota> listaMascotas = control.traerMascotas(); //llamo a la logica y que esta luego se comunique con la persistencia
       
       //recorrer la lista y mostrar cada uno de los elementos de la tabla
       if(listaMascotas != null){
           //por cada objeto de tipo mascota
          for (Mascota animal: listaMascotas){
              //hacemos un vector de tipo objet para que puedan convivir todos los tipos de datos de mascota
              Object [] mascota = {animal.getNumCliente(), animal.getNombrePerro(), animal.getRaza(), animal.getColor(),
              animal.getAlergico(), animal.getAtencionEspecial(), animal.getUnDuenio().getNombreDuenio(),
              animal.getUnDuenio().getDniDuenio(), animal.getUnDuenio().getCelDuenio()}; //debo poner ; al cerrar ya que estoy declando un vector
              
              modeloTabla.addRow(mascota); //EL MODELO  esta compuesta por la fila de objetos
             
            }
            //ahora tablaMascotas(variable del jframe, cuadrado de la igu) recibe el modelo de tabla que se hizo
            tablaMascotas.setModel(modeloTabla); //la variable es seteada con el modelo personalizado que se hizo
          
        }
       
       
    }
}
