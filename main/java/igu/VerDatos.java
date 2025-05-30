package igu;

/**
 * Clase que representa la interfaz gráfica para visualizar y gestionar los datos de mascotas.
 * Permite ver, editar, borrar y filtrar registros de mascotas y sus dueños.
 */
import java.util.List;
import logica.Controladora;
import javax.swing.table.DefaultTableModel;
import logica.Mascota;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableModel;



public class VerDatos extends javax.swing.JFrame {
    /**
     * Instancia de Controladora para manejar la lógica de negocio
     */
    Controladora control= null; 
    private TableRowSorter<TableModel> sorter;

    public VerDatos() { 
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
        txtMascotaBuscador = new javax.swing.JTextField();
        txtDuenoBuscador = new javax.swing.JTextField();
        tituloBuscarDuenio = new javax.swing.JLabel();
        tituloBuscarMasco = new javax.swing.JLabel();
        btnBuscarDuenio = new javax.swing.JButton();
        btnBuscarMascota = new javax.swing.JButton();
        btnLimpiarFiltro = new javax.swing.JButton();

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
                .addGap(273, 273, 273)
                .addComponent(tonoVerde)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tonoVerde)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelTabla.setBackground(new java.awt.Color(204, 204, 204));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 102));

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
        btnVolver.setMaximumSize(new java.awt.Dimension(39, 20));
        btnVolver.setMinimumSize(new java.awt.Dimension(39, 20));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        imagenLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logochico.png"))); // NOI18N

        txtMascotaBuscador.setBackground(new java.awt.Color(255, 255, 255));
        txtMascotaBuscador.setForeground(new java.awt.Color(0, 0, 0));

        txtDuenoBuscador.setBackground(new java.awt.Color(255, 255, 255));
        txtDuenoBuscador.setForeground(new java.awt.Color(0, 0, 0));

        tituloBuscarDuenio.setForeground(new java.awt.Color(0, 0, 0));
        tituloBuscarDuenio.setText("Buscar por dueño:");

        tituloBuscarMasco.setForeground(new java.awt.Color(0, 0, 0));
        tituloBuscarMasco.setText("Buscar por nombre de mascota: ");

        btnBuscarDuenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/buscar.png"))); // NOI18N
        btnBuscarDuenio.setText("Buscar");
        btnBuscarDuenio.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 51)));
        btnBuscarDuenio.setPreferredSize(new java.awt.Dimension(73, 25));
        btnBuscarDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDuenioActionPerformed(evt);
            }
        });

        btnBuscarMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/buscar.png"))); // NOI18N
        btnBuscarMascota.setText("Buscar");
        btnBuscarMascota.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 51)));
        btnBuscarMascota.setPreferredSize(new java.awt.Dimension(73, 25));
        btnBuscarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMascotaActionPerformed(evt);
            }
        });

        btnLimpiarFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/limpiar.png"))); // NOI18N
        btnLimpiarFiltro.setText("Limpiar Filtros");
        btnLimpiarFiltro.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 51)));
        btnLimpiarFiltro.setMaximumSize(new java.awt.Dimension(39, 20));
        btnLimpiarFiltro.setMinimumSize(new java.awt.Dimension(39, 20));
        btnLimpiarFiltro.setPreferredSize(new java.awt.Dimension(73, 25));
        btnLimpiarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                        .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDuenoBuscador, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                            .addComponent(txtMascotaBuscador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarDuenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(122, 122, 122))
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloBuscarDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloBuscarMasco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiarFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagenLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(tituloBuscarMasco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMascotaBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addComponent(btnLimpiarFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnBuscarDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addComponent(tituloBuscarDuenio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDuenoBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addGap(27, 27, 27)
                        .addComponent(btnBorrar)
                        .addGap(31, 31, 31)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(imagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
     /**
     * Método que se ejecuta al abrir la ventana.
     * Carga los datos en la tabla automáticamente.
     * @param evt Evento de apertura de ventana
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

     /**
     * Método que maneja el evento del botón Volver.
     * Cierra la ventana actual y muestra la ventana Principal.
     * @param evt Evento de acción del botón
     */
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose(); 
        Principal prin = new Principal(); 
        prin.setVisible(true); 
        prin.setLocationRelativeTo(null); 
        
    }//GEN-LAST:event_btnVolverActionPerformed
    
     /**
     * Método que maneja el evento del botón Borrar.
     * Elimina el registro seleccionado después de confirmación.
     * @param evt Evento de acción del botón
     */
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        if (tablaMascotas.getRowCount() > 0) {
           if (tablaMascotas.getSelectedRow() != -1) {

              
               Object[] opciones = {"Sí", "No"};
               int respuesta = JOptionPane.showOptionDialog(
                   null,
                   "¿Está seguro que desea eliminar el registro?",
                   "Confirmar eliminación",
                   JOptionPane.YES_NO_OPTION,
                   JOptionPane.QUESTION_MESSAGE,
                   null,
                   opciones,
                   opciones[1]
               );

               if (respuesta == JOptionPane.YES_OPTION) {
                   int numCliente = Integer.parseInt(
                       String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0))
                   );

                   control.borrarMascota(numCliente);

                   JOptionPane.showMessageDialog(
                       null,
                       "Se eliminó la mascota de la base de datos",
                       "Borrado exitoso",
                       JOptionPane.INFORMATION_MESSAGE
                   );

                   cargarTabla();
               }
           } else {
               JOptionPane.showMessageDialog(
                   null,
                   "No seleccionó ninguna fila para eliminar",
                   "Alerta",
                   JOptionPane.ERROR_MESSAGE
               );
           }
       } else {
           JOptionPane.showMessageDialog(
               null,
               "No hay registros para borrar",
               "Tabla vacía",
               JOptionPane.ERROR_MESSAGE
           );
       }
    }//GEN-LAST:event_btnBorrarActionPerformed
    
    /**
     * Método que maneja el evento del botón Editar.
     * Abre la ventana de modificación con los datos del registro seleccionado.
     * 
     * @param evt Evento de acción del botón
     */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       if(tablaMascotas.getRowCount() > 0){ 
           if(tablaMascotas.getSelectedRow() != -1){
               //id de la mascota a editar
              int numCliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(),0))); 
              
              ModificarDatos pantallaModi = new ModificarDatos(numCliente); 
              pantallaModi.setVisible(true); 
              pantallaModi.setLocationRelativeTo(null); 
              this.dispose();

           }
           else{
              JOptionPane.showMessageDialog(null, "No selecciono ninguna fila para editar", "Alerta", JOptionPane.ERROR_MESSAGE);

           }
       
       }
       else{
           JOptionPane.showMessageDialog(null, "No hay registros para editar", "Tabla Vacia", JOptionPane.ERROR_MESSAGE);
       }
            
    }//GEN-LAST:event_btnEditarActionPerformed
    
    /**
     * Método que maneja el evento del botón Buscar por Mascota.
     * Filtra la tabla por el nombre de la mascota.
     * @param evt Evento de acción del botón
     */
    private void btnBuscarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMascotaActionPerformed
        String textoMasco = txtMascotaBuscador.getText().trim();
        if (textoMasco.length() == 0) {
            sorter.setRowFilter(null); 
        } else {
      
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + textoMasco, 1));
        }

    }//GEN-LAST:event_btnBuscarMascotaActionPerformed
   
    /**
     * Método que maneja el evento del botón Buscar por Dueño.
     * Filtra la tabla por el nombre del dueño.
     * @param evt Evento de acción del botón
     */
    private void btnBuscarDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDuenioActionPerformed
        String textoDuenio = txtDuenoBuscador.getText().trim();
        if (textoDuenio.length() == 0) {
          sorter.setRowFilter(null); 
        } else {
      
          sorter.setRowFilter(RowFilter.regexFilter("(?i)" + textoDuenio, 6));
       }
    }//GEN-LAST:event_btnBuscarDuenioActionPerformed

    private void btnLimpiarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarFiltroActionPerformed
        sorter.setRowFilter(null);
        txtDuenoBuscador.setText("");
        txtMascotaBuscador.setText("");
    }//GEN-LAST:event_btnLimpiarFiltroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscarDuenio;
    private javax.swing.JButton btnBuscarMascota;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpiarFiltro;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel imagenLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTable tablaMascotas;
    private javax.swing.JLabel tituloBuscarDuenio;
    private javax.swing.JLabel tituloBuscarMasco;
    private javax.swing.JLabel tonoVerde;
    private javax.swing.JTextField txtDuenoBuscador;
    private javax.swing.JTextField txtMascotaBuscador;
    // End of variables declaration//GEN-END:variables
   
    /**
    * Método privado que carga y configura la tabla de mascotas con datos desde la base de datos.
    * Realiza las siguientes operaciones:
    * 
    * 1. Crea un modelo de tabla personalizado que impide la edición directa de celdas
    * 2. Establece los títulos de las columnas según la estructura de datos
    * 3. Obtiene la lista completa de mascotas desde la capa de lógica
    * 4. Recorre la lista y construye filas con los datos de cada mascota y su dueño
    * 5. Configura un TableRowSorter para permitir filtrado y ordenamiento
    * 6. Aplica un renderizador personalizado que resalta las filas que requieren atención especial
    * 
    * La estructura de columnas es:
    * 0 - Número de cliente (ID)
    * 1 - Nombre de la mascota
    * 2 - Raza
    * 3 - Color
    * 4 - Indicador de alergias (SI/NO)
    * 5 - Indicador de atención especial (SI/NO)
    * 6 - Nombre del dueño
    * 7 - DNI del dueño
    * 8 - Celular del dueño
    * 
    * Las filas que tienen "SI" en atención especial se muestran con fondo gris para destacarlas visualmente.
    * 
    * @implNote Este método se ejecuta automáticamente al abrir la ventana (formWindowOpened)
    * y también después de operaciones que modifican los datos (borrado).
    */
    private void cargarTabla() {
           DefaultTableModel modeloTabla = new DefaultTableModel(){ 
           
           @Override  
           public boolean isCellEditable(int row, int column){
              return false;
           }
           
       }; 
       
       String [] titulos = {"Num", "Nombre", "Raza", "Color", "Alergico", "At.Especial", "Dueño","Dni", "Celu"};
       modeloTabla.setColumnIdentifiers(titulos); 
     
       List <Mascota> listaMascotas = control.traerMascotas(); 
       
       if(listaMascotas != null){
            for (Mascota animal: listaMascotas){
              Object [] mascota = {animal.getNumCliente(), animal.getNombrePerro(), animal.getRaza(), animal.getColor(),
              animal.getAlergico(), animal.getAtencionEspecial(), animal.getUnDuenio().getNombreDuenio(),
              animal.getUnDuenio().getDniDuenio(), animal.getUnDuenio().getCelDuenio()}; 
              
              modeloTabla.addRow(mascota); 
             
            }
           
            tablaMascotas.setModel(modeloTabla); 
            sorter = new TableRowSorter<>(modeloTabla);
            tablaMascotas.setRowSorter(sorter);
            
            tablaMascotas.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {    
             @Override
             public java.awt.Component getTableCellRendererComponent(
             javax.swing.JTable table, Object value, boolean isSelected,
             boolean hasFocus, int row, int column) {

                 java.awt.Component c = super.getTableCellRendererComponent(
                 table, value, isSelected, hasFocus, row, column);

                 int modelRow = table.convertRowIndexToModel(row);

                 DefaultTableModel model = (DefaultTableModel) table.getModel();

                 String atencionEspecial = (String) model.getValueAt(modelRow, 5);

                  if ("SI".equalsIgnoreCase(atencionEspecial)) {
                      c.setBackground(new java.awt.Color(153,153,153)); 
                  } else {
                      c.setBackground(java.awt.Color.WHITE);
                  }

                    return c;
             }
            });
        }
       
       
    }
}
