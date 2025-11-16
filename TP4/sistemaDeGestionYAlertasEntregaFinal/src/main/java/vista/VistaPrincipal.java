package vista;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ModeloCliente;
import modelo.ModeloClienteDAO;
import modelo.ModeloControl;
import modelo.ModeloControlDAO;
import modelo.ModeloNotificacionDAO;
import modelo.ModeloObligacion;
import modelo.ModeloObligacionDAO;
import modelo.ModeloPeriodo;
import modelo.ModeloPeriodoDAO;


public class VistaPrincipal extends javax.swing.JFrame {
    //Clientes
    ModeloCliente cliente = new ModeloCliente();
    ModeloClienteDAO clienteDAO = new ModeloClienteDAO();
    DefaultTableModel modeloTablaClientes = new DefaultTableModel();
    //Obligaciones
    ModeloObligacion obligacion = new ModeloObligacion();
    ModeloObligacionDAO obligacionDAO = new ModeloObligacionDAO();
    DefaultTableModel modeloTablaObligaciones = new DefaultTableModel();
    //Periodos
    ModeloPeriodo periodo = new ModeloPeriodo();
    ModeloPeriodoDAO periodoDAO = new ModeloPeriodoDAO();
    DefaultTableModel modeloTablaPeriodo = new DefaultTableModel();
    
    //Control
    ModeloControl control = new ModeloControl();
    ModeloControlDAO controlDAO = new ModeloControlDAO();
    DefaultTableModel modeloTablaControl = new DefaultTableModel();
    
    //Notificacion
    ModeloNotificacionDAO notificacionDAO = new ModeloNotificacionDAO();
    //DefaultTableModel modeloTablaControl = new DefaultTableModel();
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaPrincipal.class.getName());

    
    public VistaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnObligaciones = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnVencimientos = new javax.swing.JButton();
        btnNotificacion = new javax.swing.JButton();
        btnVencimientos1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        BotonLimpiarCliente = new javax.swing.JButton();
        BotonAgregarCliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textCuit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textRazon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboContribuyente = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        textInicio = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableClientes = new javax.swing.JTable();
        BotonEditarCliente = new javax.swing.JButton();
        BotonEliminarCliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        BotonEditarObligacion = new javax.swing.JButton();
        BotonEliminarObligacion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableObligacion = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablePeriodos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableControl = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        fechaSimulacion = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        BotonEjecucion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEMA DE GESTIÓN Y ALERTAS DE VENCIMIENTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 14, 1160, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NCS @ 2025 - 2026");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1150, 50));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 2, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Versión 1.0.0");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1150, 40));

        btnObligaciones.setText("OBLIGACIONES");
        btnObligaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObligacionesActionPerformed(evt);
            }
        });

        btnClientes.setText("CLIENTES");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnVencimientos.setText("PERIODOS");
        btnVencimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVencimientosActionPerformed(evt);
            }
        });

        btnNotificacion.setText("NOTIFICACION");
        btnNotificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificacionActionPerformed(evt);
            }
        });

        btnVencimientos1.setText("CONTROL");
        btnVencimientos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVencimientos1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVencimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnObligaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNotificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVencimientos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnObligaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVencimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVencimientos1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNotificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 470));

        jPanel2.setToolTipText("");
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BotonLimpiarCliente.setText("LIMPIAR");
        BotonLimpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarClienteActionPerformed(evt);
            }
        });

        BotonAgregarCliente.setText("AGREGAR");
        BotonAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarClienteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CLIENTE");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CUIT");

        textCuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCuitActionPerformed(evt);
            }
        });
        textCuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCuitKeyTyped(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RAZON SOCIAL");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EMAIL");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DIRECCION");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CONTRIBUYENTE");

        comboContribuyente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Responsable Inscripto", "Monotributo" }));
        comboContribuyente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboContribuyenteActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("INICIO ACTIVIDAD");

        TableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUIT", "RAZON SOCIAL", "EMAIL", "DIRECCION", "CONTRIBUYENTE", "INICIO ACTIVIDAD"
            }
        ));
        TableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableClientes);

        BotonEditarCliente.setText("EDITAR");
        BotonEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarClienteActionPerformed(evt);
            }
        });

        BotonEliminarCliente.setText("ELIMINAR");
        BotonEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textRazon)
                            .addComponent(textEmail)
                            .addComponent(textDireccion)
                            .addComponent(textCuit)
                            .addComponent(comboContribuyente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(BotonLimpiarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(BotonAgregarCliente)
                        .addGap(16, 16, 16)
                        .addComponent(BotonEditarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonEliminarCliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textRazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboContribuyente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(textCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(textInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonLimpiarCliente)
                    .addComponent(BotonAgregarCliente)
                    .addComponent(BotonEditarCliente)
                    .addComponent(BotonEliminarCliente))
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("CLIENTES", jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("OBLIGACION");

        BotonEditarObligacion.setText("EDITAR");

        BotonEliminarObligacion.setText("ELIMINAR");

        TableObligacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUIT", "NOMBRE", "DESCRIPCION"
            }
        ));
        jScrollPane2.setViewportView(TableObligacion);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(BotonEditarObligacion)
                .addGap(69, 69, 69)
                .addComponent(BotonEliminarObligacion)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEditarObligacion)
                    .addComponent(BotonEliminarObligacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("OBLIGACIONES", jPanel3);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PERIODOS");

        TablePeriodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OBLIGACION", "MES", "AÑO", "VENCIMIENTO"
            }
        ));
        jScrollPane3.setViewportView(TablePeriodos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE))
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        jTabbedPane1.addTab("PERIODOS", jPanel4);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("CONTROL");

        TableControl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OBLIGACION", "ESTADO", "FECHA ENVIO"
            }
        ));
        jScrollPane4.setViewportView(TableControl);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONTROL", jPanel5);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("SIMULADOR DE NOTIFICACION");

        jLabel12.setText("Seleccione un dia de simulacion");

        BotonEjecucion.setText("Ejecutar");
        BotonEjecucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEjecucionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaSimulacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(381, 381, 381))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addComponent(BotonEjecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(fechaSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BotonEjecucion)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("NOTIFICACION", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 1030, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public void listarClientes() throws ClassNotFoundException{
        List<ModeloCliente> listarCli = clienteDAO.listarClientes();
        modeloTablaClientes = (DefaultTableModel) TableClientes.getModel();
        
        Object[] obj = new Object[6];
        for(int i=0; i < listarCli.size();i++){
            obj[0] = listarCli.get(i).getCuit();
            obj[1] = listarCli.get(i).getRazonSocial();
            obj[2] = listarCli.get(i).getEmail();
            obj[3] = listarCli.get(i).getDireccion();
            obj[4] = listarCli.get(i).getContribuyente();
            obj[5] = listarCli.get(i).getInicioActividad();
            modeloTablaClientes.addRow(obj);
        }
        TableClientes.setModel(modeloTablaClientes);
    }
    
    public void limpiarTabla(){
        for(int i =0; i < modeloTablaClientes.getRowCount();i++){
            modeloTablaClientes.removeRow(i);
            i = i - 1;
        }
    }
    
    public void listarObligaciones() throws ClassNotFoundException{
        List<ModeloObligacion> listarObl = obligacionDAO.listarObligaciones();
        modeloTablaObligaciones = (DefaultTableModel) TableObligacion.getModel();
        
        Object[] obj = new Object[3];
        
        for(int i=0; i < listarObl.size();i++){
            obj[0] = listarObl.get(i).getCuit();
            obj[1] = listarObl.get(i).getNombre();
            obj[2] = listarObl.get(i).getDescripcion();
            modeloTablaObligaciones.addRow(obj);
        }
        TableObligacion.setModel(modeloTablaObligaciones);
    }
    
    public void limpiarTablaObligaciones(){
        for(int i =0; i < modeloTablaObligaciones.getRowCount();i++){
            modeloTablaObligaciones.removeRow(i);
            i = i - 1;
        }
    }
    
    public void listarPeriodos() throws ClassNotFoundException{
        List<ModeloPeriodo> listarPer = periodoDAO.listarPeriodos();
        modeloTablaPeriodo = (DefaultTableModel) TablePeriodos.getModel();
        
        Object[] obj = new Object[4];
        
        for(int i=0; i < listarPer.size();i++){
            obj[0] = listarPer.get(i).getNombreObligacion();
            obj[1] = listarPer.get(i).getMes();
            obj[2] = listarPer.get(i).getAnio();
            obj[3] = listarPer.get(i).getFechaVentcimiento();
            modeloTablaPeriodo.addRow(obj);
        }
        TablePeriodos.setModel(modeloTablaPeriodo);
    }
    
    public void limpiarTablaPeriodos(){
        for(int i =0; i < modeloTablaPeriodo.getRowCount();i++){
            modeloTablaPeriodo.removeRow(i);
            i = i - 1;
        }
    }
    
    public void listarControl() throws ClassNotFoundException{
        List<ModeloControl> listarCon = controlDAO.listarNofiticaciones();
        modeloTablaControl = (DefaultTableModel) TableControl.getModel();
        
        Object[] obj = new Object[3];
        
        for(int i=0; i < listarCon.size();i++){
            obj[0] = listarCon.get(i).getObligacion();
            obj[1] = listarCon.get(i).getEstado();
            obj[2] = listarCon.get(i).getFechaEnvio();
            modeloTablaControl.addRow(obj);
        }
        TableControl.setModel(modeloTablaControl);
    }
    
    public void limpiarTablaControl(){
        for(int i =0; i < modeloTablaControl.getRowCount();i++){
            modeloTablaControl.removeRow(i);
            i = i - 1;
        }
    }
    
    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        try {
            limpiarTabla();
            listarClientes();
            jTabbedPane1.setSelectedIndex(0);
            textInicio.setDate(new java.util.Date());
        } catch (ClassNotFoundException ex) {
            System.getLogger(VistaPrincipal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnNotificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificacionActionPerformed
        fechaSimulacion.setDate(new java.util.Date());
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_btnNotificacionActionPerformed

    private void btnVencimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVencimientosActionPerformed
        try {
            limpiarTablaPeriodos();
            listarPeriodos();
            jTabbedPane1.setSelectedIndex(2);
        } catch (ClassNotFoundException ex) {
            System.getLogger(VistaPrincipal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btnVencimientosActionPerformed

    private void btnObligacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObligacionesActionPerformed
        try {
            limpiarTablaObligaciones();
            listarObligaciones();
            jTabbedPane1.setSelectedIndex(1);
        } catch (ClassNotFoundException ex) {
            System.getLogger(VistaPrincipal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btnObligacionesActionPerformed

    private void BotonLimpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarClienteActionPerformed
        limpiarClientes();
    }//GEN-LAST:event_BotonLimpiarClienteActionPerformed

    private void BotonAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarClienteActionPerformed
        if(!"".equals(textCuit.getText()) || !"".equals(textRazon.getText()) || !"".equals(textEmail.getText()) || !"".equals(textDireccion.getText())){
            cliente.setCuit(Integer.parseInt(textCuit.getText()));
            cliente.setRazonSocial(textRazon.getText());
            cliente.setEmail(textEmail.getText());
            cliente.setDireccion(textDireccion.getText());
            cliente.setContribuyente(comboContribuyente.getSelectedItem().toString());
            Date formatoFecha = textInicio.getDate();
            long fecha = formatoFecha.getTime();
            java.sql.Date fechaSQL = new java.sql.Date(fecha);
            cliente.setInicioActividad(fechaSQL);
            try {
                clienteDAO.registrarCliente(cliente);
                limpiarTabla();
                listarClientes();
                JOptionPane.showMessageDialog(null, "Se registro el cliente correctamente");
                limpiarClientes();
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Verifique los campos");
        }
               
        
    }//GEN-LAST:event_BotonAgregarClienteActionPerformed

    private void textCuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCuitActionPerformed

    private void textCuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCuitKeyTyped
        // Modificao esta funcion para que solo admita numeros:
        int key = evt.getKeyChar();

        //Valido que el numero que se escriba este entre 0 y 9
        boolean numero = key >=48 && key <=57;
        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_textCuitKeyTyped

    private void comboContribuyenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboContribuyenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboContribuyenteActionPerformed

    private void btnVencimientos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVencimientos1ActionPerformed
        try {
            limpiarTablaControl();
            listarControl();
            jTabbedPane1.setSelectedIndex(3);
        } catch (ClassNotFoundException ex) {
            System.getLogger(VistaPrincipal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }//GEN-LAST:event_btnVencimientos1ActionPerformed

    private void TableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableClientesMouseClicked
        int filaSeleccionada = TableClientes.rowAtPoint(evt.getPoint());
        textCuit.setText(TableClientes.getValueAt(filaSeleccionada, 0).toString());
        textRazon.setText(TableClientes.getValueAt(filaSeleccionada, 1).toString());
        textEmail.setText(TableClientes.getValueAt(filaSeleccionada, 2).toString());
        textDireccion.setText(TableClientes.getValueAt(filaSeleccionada, 3).toString());
        
        
    }//GEN-LAST:event_TableClientesMouseClicked

    private void BotonEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarClienteActionPerformed
        if(!"".equals(textCuit.getText())){
            int confirmacion = JOptionPane.showConfirmDialog(null, "Confirmar la eliminacion");
            if(confirmacion == 0){
                int cuit = Integer.parseInt(textCuit.getText());
                clienteDAO.eliminarCliente(cuit);
                try {
                    limpiarTabla();
                    listarClientes();
                    limpiarClientes();
                } catch (ClassNotFoundException ex) {
                    System.getLogger(VistaPrincipal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            }
        }
    }//GEN-LAST:event_BotonEliminarClienteActionPerformed

    private void BotonEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarClienteActionPerformed
        if("".equals(textCuit.getText())){
            JOptionPane.showMessageDialog(null, "Seleccione una fila antes de editar");
        }else{
            cliente.setCuit(Integer.parseInt(textCuit.getText()));
            cliente.setRazonSocial(textRazon.getText());
            cliente.setEmail(textEmail.getText());
            cliente.setDireccion(textDireccion.getText());
            cliente.setContribuyente(comboContribuyente.getSelectedItem().toString());
            Date formatoFecha = textInicio.getDate();
            long fecha = formatoFecha.getTime();
            java.sql.Date fechaSQL = new java.sql.Date(fecha);
            cliente.setInicioActividad(fechaSQL);
            if(!"".equals(textCuit.getText()) || !"".equals(textRazon.getText()) || !"".equals(textEmail.getText()) || !"".equals(textDireccion.getText())){
                try {
                    clienteDAO.modificarCliente(cliente);
                    limpiarTabla();
                    limpiarClientes();
                    listarClientes();
                } catch (ClassNotFoundException ex) {
                    System.getLogger(VistaPrincipal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Complete los campos vacios");
            }
        }
    }//GEN-LAST:event_BotonEditarClienteActionPerformed

    private void BotonEjecucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEjecucionActionPerformed
       try {
            notificacionDAO.buscarClientesPorVencimiento(fechaSimulacion.getDate());
            
            JOptionPane.showMessageDialog(null, "Ejecucion con exito, verifique su casilla de email");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese una casilla de email");
        }         
    }//GEN-LAST:event_BotonEjecucionActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VistaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonAgregarCliente;
    private javax.swing.JButton BotonEditarCliente;
    private javax.swing.JButton BotonEditarObligacion;
    private javax.swing.JButton BotonEjecucion;
    private javax.swing.JButton BotonEliminarCliente;
    private javax.swing.JButton BotonEliminarObligacion;
    private javax.swing.JButton BotonLimpiarCliente;
    private javax.swing.JTable TableClientes;
    private javax.swing.JTable TableControl;
    private javax.swing.JTable TableObligacion;
    private javax.swing.JTable TablePeriodos;
    public javax.swing.JButton btnClientes;
    public javax.swing.JButton btnNotificacion;
    public javax.swing.JButton btnObligaciones;
    public javax.swing.JButton btnVencimientos;
    public javax.swing.JButton btnVencimientos1;
    public javax.swing.JComboBox<String> comboContribuyente;
    private com.toedter.calendar.JDateChooser fechaSimulacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextField textCuit;
    public javax.swing.JTextField textDireccion;
    public javax.swing.JTextField textEmail;
    public com.toedter.calendar.JDateChooser textInicio;
    public javax.swing.JTextField textRazon;
    // End of variables declaration//GEN-END:variables
    private void limpiarClientes(){
        textCuit.setText("");
        textRazon.setText("");
        textInicio.setDate(new java.util.Date());
        textDireccion.setText("");
        textEmail.setText("");
    }
}
