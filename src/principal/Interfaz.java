/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author esaar
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    
    int maxCaracteres = 10;
    int maxDecimales = 6;
    int maxTotal;
    boolean  bPunto = false;
    boolean operar = false;
    char  operacion;
    float num1, num2;
    String numero="";
    Operaciones operando =new Operaciones();
    
    public Interfaz() {
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

        txtPalabraResultado = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        btnNum8 = new javax.swing.JButton();
        btnNum7 = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnMultiplicación = new javax.swing.JButton();
        btnNum1 = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPalabraResultado.setText("Resultado:");
        txtPalabraResultado.setEnabled(false);
        txtPalabraResultado.setName(""); // NOI18N

        txtResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResultado.setEnabled(false);

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNumero.setEnabled(false);

        btnNum8.setText("8");
        btnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum8ActionPerformed(evt);
            }
        });

        btnNum7.setText("7");
        btnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum7ActionPerformed(evt);
            }
        });

        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnNum9.setText("9");
        btnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum9ActionPerformed(evt);
            }
        });

        btnNum4.setText("4");
        btnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum4ActionPerformed(evt);
            }
        });

        btnNum5.setText("5");
        btnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum5ActionPerformed(evt);
            }
        });

        btnNum6.setText("6");
        btnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum6ActionPerformed(evt);
            }
        });

        btnMultiplicación.setText("*");
        btnMultiplicación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicaciónActionPerformed(evt);
            }
        });

        btnNum1.setText("1");
        btnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum2.setText("2");
        btnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum2ActionPerformed(evt);
            }
        });

        btnNum3.setText("3");
        btnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum3ActionPerformed(evt);
            }
        });

        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnNum0.setText("0");
        btnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum0ActionPerformed(evt);
            }
        });

        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        btnLimpiar.setText("AC");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBorrar.setText("<-");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtPalabraResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtNumero)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMultiplicación, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPalabraResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicación, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
        
        numero = txtNumero.getText();
        if(numero.equals("0")){
            txtNumero.setText("1");
        }else if(numero.length() < maxCaracteres && !bPunto){
            txtNumero.setText(numero+"1");
        }else if(bPunto && numero.length() < maxTotal){
            txtNumero.setText(numero+"1");
        }else{
            //Podemos poner un mensaje "Exedio maximo de caracteres de ser necesario"
        }
    }//GEN-LAST:event_btnNum1ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        numero = txtNumero.getText();
        if(numero.length() == 0){
            txtNumero.setText("0.");
            numero = txtNumero.getText();
            maxTotal = numero.length()+maxDecimales;
            bPunto = true;
        }else if(numero.length() <= maxCaracteres && !bPunto){
            txtNumero.setText(numero+".");
            numero = txtNumero.getText();
            maxTotal = numero.length()+maxDecimales;
            bPunto = true;
        }else{
            //Podemos poner un mensaje "ya se ha utilizado"
        }
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum2ActionPerformed
        numero = txtNumero.getText();
        if(numero.equals("0")){
            txtNumero.setText("2");
        }else if(numero.length() < maxCaracteres && !bPunto){
            txtNumero.setText(numero+"2");
        }else if(bPunto && numero.length() < maxTotal){
            txtNumero.setText(numero+"2");
        }else{
            //Podemos poner un mensaje "Exedio maximo de caracteres de ser necesario"
        }
    }//GEN-LAST:event_btnNum2ActionPerformed

    private void btnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum3ActionPerformed
        numero = txtNumero.getText();
        if(numero.equals("0")){
            txtNumero.setText("3");
        }else if(numero.length() < maxCaracteres && !bPunto){
            txtNumero.setText(numero+"3");
        }else if(bPunto && numero.length() < maxTotal){
            txtNumero.setText(numero+"3");
        }else{
            //Podemos poner un mensaje "Exedio maximo de caracteres de ser necesario"
        }
    }//GEN-LAST:event_btnNum3ActionPerformed

    private void btnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum4ActionPerformed
        numero = txtNumero.getText();
        if(numero.equals("0")){
            txtNumero.setText("4");
        }else if(numero.length() < maxCaracteres && !bPunto){
            txtNumero.setText(numero+"4");
        }else if(bPunto && numero.length() < maxTotal){
            txtNumero.setText(numero+"4");
        }else{
            //Podemos poner un mensaje "Exedio maximo de caracteres de ser necesario"
        }
    }//GEN-LAST:event_btnNum4ActionPerformed

    private void btnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum5ActionPerformed
        numero = txtNumero.getText();
        if(numero.equals("0")){
            txtNumero.setText("5");
        }else if(numero.length() < maxCaracteres && !bPunto){
            txtNumero.setText(numero+"5");
        }else if(bPunto && numero.length() < maxTotal){
            txtNumero.setText(numero+"5");
        }else{
            //Podemos poner un mensaje "Exedio maximo de caracteres de ser necesario"
        }
    }//GEN-LAST:event_btnNum5ActionPerformed

    private void btnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum6ActionPerformed
        numero = txtNumero.getText();
        if(numero.equals("0")){
            txtNumero.setText("6");
        }else if(numero.length() < maxCaracteres && !bPunto){
            txtNumero.setText(numero+"6");
        }else if(bPunto && numero.length() < maxTotal){
            txtNumero.setText(numero+"6");
        }else{
            //Podemos poner un mensaje "Exedio maximo de caracteres de ser necesario"
        }
    }//GEN-LAST:event_btnNum6ActionPerformed

    private void btnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum7ActionPerformed
        numero = txtNumero.getText();
        if(numero.equals("0")){
            txtNumero.setText("7");
        }else if(numero.length() < maxCaracteres && !bPunto){
            txtNumero.setText(numero+"7");
        }else if(bPunto && numero.length() < maxTotal){
            txtNumero.setText(numero+"7");
        }else{
            //Podemos poner un mensaje "Exedio maximo de caracteres de ser necesario"
        }
    }//GEN-LAST:event_btnNum7ActionPerformed

    private void btnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum8ActionPerformed
        numero = txtNumero.getText();
        if(numero.equals("0")){
            txtNumero.setText("8");
        }else if(numero.length() < maxCaracteres && !bPunto){
            txtNumero.setText(numero+"8");
        }else if(bPunto && numero.length() < maxTotal){
            txtNumero.setText(numero+"8");
        }else{
            //Podemos poner un mensaje "Exedio maximo de caracteres de ser necesario"
        }
    }//GEN-LAST:event_btnNum8ActionPerformed

    private void btnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum9ActionPerformed
        numero = txtNumero.getText();
        if(numero.equals("0")){
            txtNumero.setText("9");
        }else if(numero.length() < maxCaracteres && !bPunto){
            txtNumero.setText(numero+"9");
        }else if(bPunto && numero.length() < maxTotal){
            txtNumero.setText(numero+"9");
        }else{
            //Podemos poner un mensaje "Exedio maximo de caracteres de ser necesario"
        }
    }//GEN-LAST:event_btnNum9ActionPerformed

    private void btnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum0ActionPerformed
        numero = txtNumero.getText();
        if(numero.equals("0")){
            //No poner más ceros
        }else if(numero.length() < maxCaracteres && !bPunto){
            txtNumero.setText(numero+"0");
        }else if(bPunto && numero.length() < maxTotal){
            txtNumero.setText(numero+"0");
        }else{
            //Podemos poner un mensaje "Exedio maximo de caracteres de ser necesario"
        }
    }//GEN-LAST:event_btnNum0ActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        numero = txtNumero.getText();
        if(numero.length()>0){
            if(!operar){
                num1 = Float.parseFloat(numero);
                txtNumero.setText("");
                txtResultado.setText(numero);
                operar = true;
                bPunto = false;
                operacion = '+';
            }else{
                num1 = Float.parseFloat(txtResultado.getText());
                num2 = Float.parseFloat(numero);
                txtNumero.setText("");
                txtResultado.setText(operando.operación(operacion, num1, num2)+"");
                bPunto = false;
                operacion = '+';
            }
        }
        if(operando.error){
            txtNumero.setText("");
            txtResultado.setText("");
            maxCaracteres = 10;
            maxDecimales = 6;
            bPunto = false;
            operar = false;
            numero="";
            operando.error = false;
        }
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        numero = txtNumero.getText();
        if(numero.length()>0){
            if(!operar){
                num1 = Float.parseFloat(numero);
                txtNumero.setText("");
                txtResultado.setText(numero);
                operar = true;
                bPunto = false;
                operacion = '-';
            }else{
                num1 = Float.parseFloat(txtResultado.getText());
                num2 = Float.parseFloat(numero);
                txtNumero.setText("");
                txtResultado.setText(operando.operación(operacion, num1, num2)+"");
                bPunto = false;
                operacion = '-';
            }
        }
        if(operando.error){
            txtNumero.setText("");
            txtResultado.setText("");
            maxCaracteres = 10;
            maxDecimales = 6;
            bPunto = false;
            operar = false;
            numero="";
            operando.error = false;
        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMultiplicaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicaciónActionPerformed
        numero = txtNumero.getText();
        if(numero.length()>0){
            if(!operar){
                num1 = Float.parseFloat(numero);
                txtNumero.setText("");
                txtResultado.setText(numero);
                operar = true;
                bPunto = false;
                operacion = '*';
            }else{
                num1 = Float.parseFloat(txtResultado.getText());
                num2 = Float.parseFloat(numero);
                txtNumero.setText("");
                txtResultado.setText(operando.operación(operacion, num1, num2)+"");
                bPunto = false;
                operacion = '*';
            }
        }
        if(operando.error){
            txtNumero.setText("");
            txtResultado.setText("");
            maxCaracteres = 10;
            maxDecimales = 6;
            bPunto = false;
            operar = false;
            numero="";
            operando.error = false;
        }
    }//GEN-LAST:event_btnMultiplicaciónActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        numero = txtNumero.getText();
        if(numero.length()>0){
            if(!operar){
                num1 = Float.parseFloat(numero);
                txtNumero.setText("");
                txtResultado.setText(numero);
                operar = true;
                bPunto = false;
                operacion = '/';
            }else{
                num1 = Float.parseFloat(txtResultado.getText());
                num2 = Float.parseFloat(numero);
                txtNumero.setText("");
                txtResultado.setText(operando.operación(operacion, num1, num2)+"");
                bPunto = false;
                operacion = '/';
            }
        }
        if(operando.error){
            txtNumero.setText("");
            txtResultado.setText("");
            maxCaracteres = 10;
            maxDecimales = 6;
            bPunto = false;
            operar = false;
            numero="";
            operando.error = false;
        }
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        numero = txtNumero.getText();
        if(numero.length()>0){
            if(!operar){

            }else{
                num1 = Float.parseFloat(txtResultado.getText());
                num2 = Float.parseFloat(numero);
                txtNumero.setText("");
                txtResultado.setText(operando.operación(operacion, num1, num2)+"");
                bPunto = false;
                operar=false;
            }
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNumero.setText("");
        txtResultado.setText("");
        maxCaracteres = 10;
        maxDecimales = 6;
        bPunto = false;
        operar = false;
        numero="";
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        numero = txtNumero.getText();
        if(numero.length() == 0){
            
        }else if(numero.substring(numero.length()-1, numero.length()).equals(".")){
            txtNumero.setText(numero.substring(0,numero.length()-1));
            bPunto =false;
        }else{
            txtNumero.setText(numero.substring(0,numero.length()-1));
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplicación;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum8;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnPunto;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPalabraResultado;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
