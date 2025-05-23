
package HR_vistas;

import HR_gestionbanco.HR_Ahorro;
import HR_gestionbanco.HR_Persona;
import static HR_vistas.HR_Principal.miscuentas;
import java.awt.Color;
//import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author hruiz
 */
public class HR_CuentaAhorro extends javax.swing.JDialog {


    public HR_CuentaAhorro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel4 = new javax.swing.JPanel();
        jLabelNuevaCuenta = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelNumCuenta = new javax.swing.JPanel();
        jLabelNumCuenta = new javax.swing.JLabel();
        jTextFieldNumeroCuenta = new javax.swing.JTextField();
        jButtonComprobar = new javax.swing.JButton();
        jPanelDatosPersonales = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelApellidos = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabelFechaNacimiento = new javax.swing.JLabel();
        jDateChooserFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jPanelDatosCuenta = new javax.swing.JPanel();
        jLabelSaldoInicial = new javax.swing.JLabel();
        jTextFieldSaldoInicial = new javax.swing.JTextField();
        jLabelEuro = new javax.swing.JLabel();
        jLabeltipoInteres = new javax.swing.JLabel();
        jTextFieldInteres = new javax.swing.JTextField();
        jLabelPorcentaje = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Cuenta Ahorro");
        setBackground(new java.awt.Color(204, 0, 0));
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(0, 141, 186));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabelNuevaCuenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNuevaCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNuevaCuenta.setText("NUEVA CUENTA AHORRO");

        jLabelLogo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelLogo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/banco2.png"))); // NOI18N

        jPanelNumCuenta.setBackground(new java.awt.Color(0, 141, 186));
        jPanelNumCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "N�MERO DE CUENTA ASIGNADO AL NUEVO CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabelNumCuenta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumCuenta.setText("N�mero de cuenta");

        jTextFieldNumeroCuenta.setToolTipText("N�mero de cuenta");
        jTextFieldNumeroCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroCuentaKeyTyped(evt);
            }
        });

        jButtonComprobar.setText("Comprobar");
        jButtonComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprobarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNumCuentaLayout = new javax.swing.GroupLayout(jPanelNumCuenta);
        jPanelNumCuenta.setLayout(jPanelNumCuentaLayout);
        jPanelNumCuentaLayout.setHorizontalGroup(
            jPanelNumCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNumCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNumCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jButtonComprobar)
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanelNumCuentaLayout.setVerticalGroup(
            jPanelNumCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNumCuentaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelNumCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonComprobar)
                    .addComponent(jTextFieldNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumCuenta))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelDatosPersonales.setBackground(new java.awt.Color(0, 141, 186));
        jPanelDatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS PERSONALES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelDatosPersonales.setToolTipText("Datos del nuevo cliente");

        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");

        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.setToolTipText("Nombre del titular");

        jLabelApellidos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApellidos.setText("Apellidos");

        jTextFieldApellidos.setEditable(false);
        jTextFieldApellidos.setToolTipText("Apellidos del titular");

        jLabelFechaNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFechaNacimiento.setText("Fecha de nacimiento");

        jDateChooserFechaNacimiento.setToolTipText("Fecha de nacimiento del titular");
        jDateChooserFechaNacimiento.setDateFormatString("dd-MM-yyyy");
        jDateChooserFechaNacimiento.setEnabled(false);

        javax.swing.GroupLayout jPanelDatosPersonalesLayout = new javax.swing.GroupLayout(jPanelDatosPersonales);
        jPanelDatosPersonales.setLayout(jPanelDatosPersonalesLayout);
        jPanelDatosPersonalesLayout.setHorizontalGroup(
            jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApellidos)
                            .addComponent(jLabelNombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(jLabelFechaNacimiento)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooserFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(448, Short.MAX_VALUE))
        );
        jPanelDatosPersonalesLayout.setVerticalGroup(
            jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellidos)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFechaNacimiento)
                    .addComponent(jDateChooserFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jPanelDatosCuenta.setBackground(new java.awt.Color(0, 141, 186));
        jPanelDatosCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DE LA NUEVA CUENTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabelSaldoInicial.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSaldoInicial.setText("Saldo inicial");

        jTextFieldSaldoInicial.setEditable(false);
        jTextFieldSaldoInicial.setToolTipText("Saldo Inicial para la nueva cuenta");
        jTextFieldSaldoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldSaldoInicialKeyTyped(evt);
            }
        });

        jLabelEuro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEuro.setText("�");

        jLabeltipoInteres.setForeground(new java.awt.Color(255, 255, 255));
        jLabeltipoInteres.setText("Tipo de inter�s anual");

        jTextFieldInteres.setEditable(false);
        jTextFieldInteres.setToolTipText("Tipo de inter�s anual aplicable");
        jTextFieldInteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldInteresKeyTyped(evt);
            }
        });

        jLabelPorcentaje.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPorcentaje.setText("%");

        javax.swing.GroupLayout jPanelDatosCuentaLayout = new javax.swing.GroupLayout(jPanelDatosCuenta);
        jPanelDatosCuenta.setLayout(jPanelDatosCuentaLayout);
        jPanelDatosCuentaLayout.setHorizontalGroup(
            jPanelDatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeltipoInteres)
                    .addComponent(jLabelSaldoInicial))
                .addGap(6, 6, 6)
                .addGroup(jPanelDatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDatosCuentaLayout.createSequentialGroup()
                        .addComponent(jTextFieldInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(531, Short.MAX_VALUE))
        );
        jPanelDatosCuentaLayout.setVerticalGroup(
            jPanelDatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSaldoInicial)
                    .addComponent(jLabelEuro)
                    .addComponent(jTextFieldSaldoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanelDatosCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltipoInteres)
                    .addComponent(jLabelPorcentaje)
                    .addComponent(jTextFieldInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setText("Registrar datos");
        jButtonRegistrar.setToolTipText("Registrar datos de la nueva cuenta");
        jButtonRegistrar.setEnabled(false);
        jButtonRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalir))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabelNuevaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelLogo)))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelDatosCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(360, 360, 360))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabelNuevaCuenta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelDatosCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jButtonSalir)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("NUEVA CUENTA AHORRO");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprobarActionPerformed
       
        numCuenta =jTextFieldNumeroCuenta.getText().trim().replace("-", "").replace(" ", "");
       
        if (numCuenta.length()!=20) {
                
            JOptionPane.showMessageDialog(null, "Error en el n�mero de cuenta: debe tener viente d�gitos\n"
                        + "Revise el n�mero de cuenta.");
            jTextFieldNumeroCuenta.setForeground(Color.red);
        }
        
        else if (!micuentaAhorro.comprobarDigitosControl(numCuenta)) {
            
            JOptionPane.showMessageDialog(null, "Error en el n�mero de cuenta: "
                    + "los d�gitos de control no se corresponden con el n�mero tecleado\n"
                        + "Revise el n�mero de cuenta.");
            jTextFieldNumeroCuenta.setForeground(Color.red);
            
        }else if (miscuentas.containsKey(numCuenta)){
            
             JOptionPane.showMessageDialog(null, "El n�mero est� asociado a una cuenta existente\n"
                        + "Teclee un nuevo n�mero de cuenta");
             jTextFieldNumeroCuenta.setForeground(Color.red);
             
        } else {
            micuentaAhorro.setNumeroCuenta(numCuenta);
            jTextFieldNumeroCuenta.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(null, "N�mero correcto y diponible para el nuevo cliente");
            jTextFieldSaldoInicial.setEditable(true);
            jTextFieldInteres.setEditable(true);
            jTextFieldNombre.setEditable(true);
            jTextFieldApellidos.setEditable(true);
            jDateChooserFechaNacimiento.setEnabled(true);
            jButtonRegistrar.setEnabled(true);
         //   jTextFieldNumeroCuenta.setEditable(false);
         //   jButtonComprobar.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonComprobarActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        
        if (!comprobarCampos()) {
            JOptionPane.showMessageDialog(null, "Revise los campos del formulario.\n"
                    + "Complete los campos vac�os");
        } else {
            nuevoCliente.setNombre(jTextFieldNombre.getText());
            nuevoCliente.setApellidos(jTextFieldApellidos.getText());
            nuevoCliente.setFechaNacimiento(jDateChooserFechaNacimiento.getDate());
            saldoIn=Float.parseFloat(jTextFieldSaldoInicial.getText());
            interesApli=Float.parseFloat(jTextFieldInteres.getText());

            if (!comprobarPositivo(saldoIn)) {
                jTextFieldSaldoInicial.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "El saldo debe ser positivo.\nTeclee de nuevo el saldo");
                jTextFieldSaldoInicial.setForeground(Color.black);
                jTextFieldSaldoInicial.setText("");
            }else if (!comprobarPositivo (interesApli)) {
                jTextFieldInteres.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "El Inter�s debe ser positivo.\nTeclee de nuevo el saldo");
                jTextFieldInteres.setForeground(Color.black);
                jTextFieldInteres.setText("");
            }else {
                micuentaAhorro.setSaldo(saldoIn);
                micuentaAhorro.setInteresCuentaAhorro(interesApli);

                miscuentas.put(numCuenta, micuentaAhorro);
                JOptionPane.showMessageDialog(null, "Cuenta registrada correctamente");

                jTextFieldNumeroCuenta.setText("");
                jTextFieldNumeroCuenta.setEditable(true);

                jTextFieldNombre.setText("");
                jTextFieldNombre.setEditable(false);
                jTextFieldApellidos.setText("");
                jTextFieldApellidos.setEditable(false);
                jDateChooserFechaNacimiento.setDate(null);
                jDateChooserFechaNacimiento.setEnabled(false);

                jTextFieldSaldoInicial.setText("");
                jTextFieldSaldoInicial.setEditable(false);
                jTextFieldInteres.setText("");
                jTextFieldInteres.setEditable(false);

                jButtonRegistrar.setEnabled(false);
            }            
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed
    
    private void jTextFieldNumeroCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroCuentaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "S�lo se admiten valores num�ricos");
        }
    }//GEN-LAST:event_jTextFieldNumeroCuentaKeyTyped

    private void jTextFieldSaldoInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSaldoInicialKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "S�lo se admiten valores num�ricos");
        }
    }//GEN-LAST:event_jTextFieldSaldoInicialKeyTyped

    private void jTextFieldInteresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldInteresKeyTyped
        
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "S�lo se admiten valores num�ricos");
        }
    }//GEN-LAST:event_jTextFieldInteresKeyTyped

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HR_CuentaAhorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HR_CuentaAhorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HR_CuentaAhorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HR_CuentaAhorro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            HR_CuentaAhorro dialog = new HR_CuentaAhorro(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprobar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
    private com.toedter.calendar.JDateChooser jDateChooserFechaNacimiento;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelEuro;
    private javax.swing.JLabel jLabelFechaNacimiento;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNuevaCuenta;
    private javax.swing.JLabel jLabelNumCuenta;
    private javax.swing.JLabel jLabelPorcentaje;
    private javax.swing.JLabel jLabelSaldoInicial;
    private javax.swing.JLabel jLabeltipoInteres;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelDatosCuenta;
    private javax.swing.JPanel jPanelDatosPersonales;
    private javax.swing.JPanel jPanelNumCuenta;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldInteres;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNumeroCuenta;
    private javax.swing.JTextField jTextFieldSaldoInicial;
    // End of variables declaration//GEN-END:variables

    String numCuenta;
    HR_Persona nuevoCliente = new HR_Persona () {};
    Date fechaNac;
    float saldoIn;
    float interesApli;
    boolean form;

    HR_Ahorro micuentaAhorro = new HR_Ahorro (numCuenta, nuevoCliente, saldoIn, interesApli);

    public boolean comprobarCampos (){
            return !("".equals(jTextFieldNombre.getText()) 
                    ||"".equals(jTextFieldApellidos.getText())
                    || jDateChooserFechaNacimiento.getDate()== null
                    ||"".equals(jTextFieldInteres.getText()));
    }
    
    public boolean comprobarPositivo (double valor) {
        return valor>0;
    }
}
