
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Register extends javax.swing.JFrame {

    /**  
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.0
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRATION SECTOR");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 80));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FULLNAME");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EMAIL");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTACT NO.");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADDRESS");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DESIGNATION ");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SERIAL KEY");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("password");

        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("REGISTRATION SECTOR");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel11.setText("HaarangaICT_SriLanka ( C. All Rights Reserved 2022. )");

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField8.setFont(new java.awt.Font("Arial", 0, 14));
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(162, 162, 162)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)
                            .addComponent(jPasswordField1)
                            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                        .addGap(61, 61, 61))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(199, 199, 199))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(113, 113, 113))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 680, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/51364.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 600));

        setSize(new java.awt.Dimension(1063, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if(jTextField3.getText().contains("@") && jTextField3.getText().contains(".")){
            
           // JOptionPane.showMessageDialog(this,"Email is vlid!","Success!",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this,"Email is Invalid!, Please Enter Contain @ & . on your email ","ERROR!",JOptionPane.ERROR_MESSAGE);
            jTextField3.setText(null);
            jTextField3.grabFocus();
        }
        
        String a = jTextField4.getText();
        int b = a.length();
        
        if(b>8 && b<13){
            //JOptionPane.showMessageDialog(this,"Contact No is valid!","Success!",JOptionPane.INFORMATION_MESSAGE);
        }else{
             JOptionPane.showMessageDialog(this,"Contact No is Invalid!, Please Type Only length of 9-12 Digits","ERROR!",JOptionPane.ERROR_MESSAGE);
            jTextField4.setText(null);
            jTextField4.grabFocus();
        }
      
        String un = jTextField8.getText();
        String fn = jTextField2.getText();
        String em = jTextField3.getText();
        String cn = jTextField4.getText();
        String ad = jTextField5.getText();
        String dg = jTextField6.getText();
        String sk = jTextField7.getText();
        String pw = jPasswordField1.getText();   
        
        if(un.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Username! ","ERROR!",JOptionPane.ERROR_MESSAGE);
            jTextField8.setText(null);
            jTextField8.grabFocus();
        }else if(fn.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Full name ! ","ERROR!",JOptionPane.ERROR_MESSAGE);
            jTextField2.setText(null);
            jTextField2.grabFocus();
        }else if(em.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Email! ","ERROR!",JOptionPane.ERROR_MESSAGE);
            jTextField3.setText(null);
            jTextField3.grabFocus();
        }else if(cn.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Contact no! ","ERROR!",JOptionPane.ERROR_MESSAGE);
            jTextField4.setText(null);
            jTextField4.grabFocus();
        }else if(ad.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Address! ","ERROR!",JOptionPane.ERROR_MESSAGE);
            jTextField5.setText(null);
            jTextField5.grabFocus();
        }else if(dg.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Valid Designation! ","ERROR!",JOptionPane.ERROR_MESSAGE);
            jTextField6.setText(null);
            jTextField6.grabFocus();
        }else if(sk.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Enter Valid SERIAL KEY! ","ERROR!",JOptionPane.ERROR_MESSAGE);
            jTextField7.setText(null);
            jTextField7.grabFocus();
        }else if(pw.isEmpty()){
           JOptionPane.showMessageDialog(this, "Please Enter Valid Password! ","ERROR!",JOptionPane.ERROR_MESSAGE);
            jPasswordField1.setText(null);
            jPasswordField1.grabFocus();
        }else{
            try {
                if (sk.equals("0") | sk.equals("1")){
                DBC.iud("INSERT INTO user(`username`,`password`,`serial`)VALUES ('"+un+"','"+pw+"','"+sk+"')");
               JOptionPane.showMessageDialog(this, "New user added Successfully!", "DONE!", JOptionPane.INFORMATION_MESSAGE);
                }else {
                JOptionPane.showMessageDialog(this, "Please Enter Valid SERIAL KEY! ","ERROR!",JOptionPane.ERROR_MESSAGE);
                jPasswordField1.setText(null);
                jPasswordField1.grabFocus();
                } 
                if(sk.equals("0")){
                    DBC.iud("INSERT INTO opera(`username`,`fullname`,`email`,`contact`,`address`,`desig`,`serial`,`password`)VALUES('"+un+"','"+fn+"','"+em+"','"+cn+"','"+ad+"','"+dg+"','"+sk+"','"+pw+"')");
                    JOptionPane.showMessageDialog(this, "New Operater added Successfully!", "DONE!", JOptionPane.INFORMATION_MESSAGE);
                    Login lf = new Login();
                    lf.setVisible(true);
                    this.dispose();
                
                }
                if(sk.equals("1")){
                    DBC.iud("INSERT INTO admin(`username`,`fullname`,`email`,`contact`,`address`,`desig`,`serial`,`password`)VALUES('"+un+"','"+fn+"','"+em+"','"+cn+"','"+ad+"','"+dg+"','"+sk+"','"+pw+"')");
                    JOptionPane.showMessageDialog(this, "New administrators added Successfully!", "DONE!", JOptionPane.INFORMATION_MESSAGE);
                    Login lf = new Login();
                    lf.setVisible(true);
                    this.dispose();
                
                    
                }
                 
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        // TODO add your handling code here:
         char letter = evt.getKeyChar();
        if(Character.isLetter(letter) | evt.getKeyCode()== KeyEvent.VK_SPACE | evt.getKeyCode() == KeyEvent.VK_BACKSPACE | evt.getKeyCode() == KeyEvent.VK_PERIOD | evt.getKeyCode()== KeyEvent.VK_SHIFT | evt.getKeyCode()== KeyEvent.VK_CAPS_LOCK | evt.getKeyCode()== KeyEvent.VK_ENTER | evt.getKeyCode()== KeyEvent.VK_PLUS|evt.getKeyCode() == KeyEvent.VK_CONTROL| evt.getKeyCode() == KeyEvent.VK_V |evt.getKeyCode()==KeyEvent.VK_RIGHT){
            jTextField8.setEditable(true);
             String un = jTextField8.getText();
        }else{
            jTextField8.setEditable(false);
            JOptionPane.showMessageDialog(this,"Please Enter Alphebetic or space, Backspace, Dot only.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            jTextField8.setText(null);
            jTextField8.grabFocus();
        }
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
            char letter = evt.getKeyChar();
        if(Character.isLetter(letter) | evt.getKeyCode()== KeyEvent.VK_SPACE | evt.getKeyCode() == KeyEvent.VK_BACKSPACE | evt.getKeyCode() == KeyEvent.VK_PERIOD | evt.getKeyCode()== KeyEvent.VK_SHIFT | evt.getKeyCode()== KeyEvent.VK_CAPS_LOCK | evt.getKeyCode()== KeyEvent.VK_ENTER | evt.getKeyCode()== KeyEvent.VK_PLUS |evt.getKeyCode() == KeyEvent.VK_CONTROL| evt.getKeyCode() == KeyEvent.VK_V){
            jTextField2.setEditable(true);
             String un = jTextField2.getText();
        }else{
            jTextField2.setEditable(false);
            JOptionPane.showMessageDialog(this,"Please Enter Alphebetic or space, Backspace, Dot only.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            jTextField2.setText(null);
            jTextField2.grabFocus();
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
          char charc = evt.getKeyChar();
        if(Character.isDigit(charc) | Character.isLetter(charc)| Character.isLowerCase(charc) | evt.getKeyCode()== KeyEvent.VK_BACKSPACE | evt.getKeyCode()== KeyEvent.VK_MINUS |evt.getKeyCode()== KeyEvent.VK_SHIFT |evt.getKeyCode()== KeyEvent.VK_2 |evt.getKeyCode()== KeyEvent.VK_PERIOD |evt.getKeyCode()== KeyEvent.VK_SPACE | evt.getKeyCode()== KeyEvent.VK_ENTER|evt.getKeyCode() == KeyEvent.VK_CONTROL| evt.getKeyCode() == KeyEvent.VK_V){ 
            jTextField3.setEditable(true);
        }else{
            jTextField3.setEditable(false);
            JOptionPane.showMessageDialog(this,"PLease Enter Valid Characters only","ERROR",JOptionPane.ERROR_MESSAGE);
            jTextField3.setText(null);
            jTextField3.grabFocus();
            
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
         char number = evt.getKeyChar();
        if(Character.isDigit(number)| evt.getKeyCode()== KeyEvent.VK_SPACE | evt.getKeyCode() == KeyEvent.VK_BACKSPACE | evt.getKeyCode()== KeyEvent.VK_SHIFT | evt.getKeyCode()== KeyEvent.VK_CAPS_LOCK | evt.getKeyCode()== KeyEvent.VK_EQUALS | evt.getKeyCode()== KeyEvent.VK_PLUS | evt.getKeyCode()== KeyEvent.VK_MINUS | evt.getKeyCode()== KeyEvent.VK_ENTER|evt.getKeyCode() == KeyEvent.VK_CONTROL | evt.getKeyCode() == KeyEvent.VK_V)  {
            jTextField4.setEditable(true);
        }else {
            jTextField4.setEditable(false);
            JOptionPane.showMessageDialog(this,"Please Enter Numeric or space, Backspace, minus only.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            jTextField4.setText(null);
            jTextField4.grabFocus();
        }
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
        char charc = evt.getKeyChar();
        if(Character.isDigit(charc) | Character.isLetter(charc)| Character.isLowerCase(charc) | evt.getKeyCode()== KeyEvent.VK_BACKSPACE | evt.getKeyCode()== KeyEvent.VK_MINUS |evt.getKeyCode()== KeyEvent.VK_SHIFT |evt.getKeyCode()== KeyEvent.VK_2 |evt.getKeyCode()== KeyEvent.VK_PERIOD |evt.getKeyCode()== KeyEvent.VK_SPACE | evt.getKeyCode()== KeyEvent.VK_ENTER |evt.getKeyCode() == KeyEvent.VK_CONTROL | evt.getKeyCode() == KeyEvent.VK_V){ 
            jTextField5.setEditable(true);
        }else{
            jTextField5.setEditable(false);
            JOptionPane.showMessageDialog(this,"PLease Enter Valid Characters only","ERROR",JOptionPane.ERROR_MESSAGE);
            jTextField5.setText(null);
            jTextField5.grabFocus();
            
        }
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
                char letter = evt.getKeyChar();
        if(Character.isLetter(letter) | evt.getKeyCode()== KeyEvent.VK_SPACE | evt.getKeyCode() == KeyEvent.VK_BACKSPACE | evt.getKeyCode() == KeyEvent.VK_PERIOD | evt.getKeyCode()== KeyEvent.VK_SHIFT | evt.getKeyCode()== KeyEvent.VK_CAPS_LOCK | evt.getKeyCode()== KeyEvent.VK_ENTER | evt.getKeyCode()== KeyEvent.VK_PLUS |evt.getKeyCode() == KeyEvent.VK_CONTROL| evt.getKeyCode() == KeyEvent.VK_V){
            jTextField6.setEditable(true);
        }else{
            jTextField6.setEditable(false);
            JOptionPane.showMessageDialog(this,"Please Enter Alphebetic or space, Backspace, Dot only.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            jTextField6.setText(null);
            jTextField6.grabFocus();
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        // TODO add your handling code here:
          char number = evt.getKeyChar();
        if(Character.isDigit(number)| evt.getKeyCode()== KeyEvent.VK_SPACE | evt.getKeyCode() == KeyEvent.VK_BACKSPACE | evt.getKeyCode()== KeyEvent.VK_SHIFT | evt.getKeyCode()== KeyEvent.VK_CAPS_LOCK | evt.getKeyCode()== KeyEvent.VK_EQUALS | evt.getKeyCode()== KeyEvent.VK_PLUS | evt.getKeyCode()== KeyEvent.VK_MINUS | evt.getKeyCode()== KeyEvent.VK_ENTER|evt.getKeyCode() == KeyEvent.VK_CONTROL| evt.getKeyCode() == KeyEvent.VK_V)  {
            jTextField7.setEditable(true);
        }else {
            jTextField7.setEditable(false);
            JOptionPane.showMessageDialog(this,"Please Enter Numeric or space, Backspace, minus only.", "ERROR!", JOptionPane.ERROR_MESSAGE);
            jTextField7.setText(null);
            jTextField7.grabFocus();
        }
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
        // TODO add your handling code here:
         char charc = evt.getKeyChar();
        if(Character.isDigit(charc) | Character.isLetter(charc)| evt.getKeyCode()== KeyEvent.VK_BACKSPACE | evt.getKeyCode()== KeyEvent.VK_MINUS |evt.getKeyCode()== KeyEvent.VK_SHIFT |evt.getKeyCode()== KeyEvent.VK_2 |evt.getKeyCode()== KeyEvent.VK_PERIOD |evt.getKeyCode()== KeyEvent.VK_SPACE | evt.getKeyCode()== KeyEvent.VK_ENTER|evt.getKeyCode() == KeyEvent.VK_CONTROL| evt.getKeyCode() == KeyEvent.VK_V){ 
            jPasswordField1.setEditable(true);
        }else{
            jPasswordField1.setEditable(false);
            JOptionPane.showMessageDialog(this,"PLease Enter Valid Characters only","ERROR",JOptionPane.ERROR_MESSAGE);
            jPasswordField1.setText(null);
           jPasswordField1.grabFocus();
            
        }
    }//GEN-LAST:event_jPasswordField1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login log = new Login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
