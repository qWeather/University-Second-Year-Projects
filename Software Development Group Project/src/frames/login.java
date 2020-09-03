/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import static database.databaseConnection.getConnection;
import static database.databaseConnection.login;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Beatrice Antoniu - w1688177
 */
public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        infoLabel.setVisible(false); //label for when fields are empty
    }
    private static String getDecodedPassword(String password)
    {
        return new String(Base64.getMimeDecoder().decode(password));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        infoLabel = new javax.swing.JLabel();
        recoverLink = new javax.swing.JLabel();
        registerLink = new javax.swing.JLabel();
        loginSubmit = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        loginPanel.setBackground(new java.awt.Color(180, 142, 174));
        loginPanel.setPreferredSize(new java.awt.Dimension(900, 500));

        usernameLabel.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel.setText("Username");
        usernameLabel.setPreferredSize(new java.awt.Dimension(200, 50));

        username.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        username.setPreferredSize(new java.awt.Dimension(300, 50));

        passwordLabel.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password");
        passwordLabel.setPreferredSize(new java.awt.Dimension(200, 50));

        password.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        password.setPreferredSize(new java.awt.Dimension(300, 50));

        infoLabel.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(215, 217, 215));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("Details don't match!");
        infoLabel.setPreferredSize(new java.awt.Dimension(300, 20));

        recoverLink.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        recoverLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recoverLink.setText("Forgot password? Recover account");
        recoverLink.setAlignmentY(0.0F);
        recoverLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recoverLink.setPreferredSize(new java.awt.Dimension(400, 20));
        recoverLink.setRequestFocusEnabled(false);
        recoverLink.setVerifyInputWhenFocusTarget(false);
        recoverLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recoverLinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recoverLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recoverLinkMouseExited(evt);
            }
        });

        registerLink.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        registerLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerLink.setText("Don't have an account? Register here");
        registerLink.setAlignmentY(0.0F);
        registerLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerLink.setPreferredSize(new java.awt.Dimension(400, 20));
        registerLink.setRequestFocusEnabled(false);
        registerLink.setVerifyInputWhenFocusTarget(false);
        registerLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerLinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerLinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerLinkMouseExited(evt);
            }
        });

        loginSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/login.png"))); // NOI18N
        loginSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginSubmitMouseClicked(evt);
            }
        });

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logout.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(201, 197, 203));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(215, 217, 215), 2, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(328, 84));

        title.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(100, 110, 104));
        title.setText("Login");
        title.setPreferredSize(new java.awt.Dimension(200, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(recoverLink, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(258, 349, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registerLink, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(loginSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(141, 141, 141))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recoverLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, 506, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLinkMouseClicked
        this.setVisible(false);
        new register().setVisible(true);
    }//GEN-LAST:event_registerLinkMouseClicked

    private void recoverLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recoverLinkMouseClicked
        this.setVisible(false);
        new recover().setVisible(true);
    }//GEN-LAST:event_recoverLinkMouseClicked

    private void registerLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLinkMouseEntered
        this.registerLink.setForeground(Color.YELLOW);
    }//GEN-LAST:event_registerLinkMouseEntered

    private void registerLinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerLinkMouseExited
        this.registerLink.setForeground(Color.BLACK);
    }//GEN-LAST:event_registerLinkMouseExited

    private void recoverLinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recoverLinkMouseEntered
        this.recoverLink.setForeground(Color.YELLOW);
    }//GEN-LAST:event_recoverLinkMouseEntered

    private void recoverLinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recoverLinkMouseExited
        this.recoverLink.setForeground(Color.BLACK);
    }//GEN-LAST:event_recoverLinkMouseExited

    private void loginSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginSubmitMouseClicked
        if (username.getText().isEmpty() || password.getText().isEmpty()) {
            infoLabel.setVisible(true);
        } else {
            try {
                String ts = new SimpleDateFormat("dd.MM.yyyy - HH.mm.ss").format(System.currentTimeMillis());
                PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM register WHERE email=?"); //query to retrieve all the details belonging to a certain email
                    ps.setString(1, username.getText());
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        String pass = rs.getString("password");
                        String decryptPassword = getDecodedPassword(pass); //decoding the password
                        String getRole = rs.getString("role");
                        String userName = username.getText();
                        if (password.getText().equals(decryptPassword)) {
                            ps.close();
                            rs.close();
                            JOptionPane.showMessageDialog(null, "Login successful!");
                            login(userName, password.getText(), ts); //adds the login details to the database
                            dispose();
                            new home(userName, getRole).setVisible(true); //sends the user to the main dashboard
                        } else {
                            JOptionPane.showMessageDialog(null, "Login failed!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Login failed!");
                    }
                getConnection().close();
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_loginSubmitMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    public static javax.swing.JLabel infoLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginSubmit;
    public static javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel recoverLink;
    private javax.swing.JLabel registerLink;
    private javax.swing.JLabel title;
    public static javax.swing.JTextField username;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
