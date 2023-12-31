/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.usjt.firebook.firebook;

import javax.swing.JOptionPane;

/**
 *
 * @author Luke
 */
public class CadastroUsuarioTela extends javax.swing.JFrame {
    
    Usuario logado;

    /**
     * Creates new form CadastroUsuarioTela
     */
    public CadastroUsuarioTela() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public CadastroUsuarioTela(Usuario logado) {
        this();
        this.logado = logado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generoPrimarioGroup = new javax.swing.ButtonGroup();
        generoSecundarioGroup = new javax.swing.ButtonGroup();
        loginTextField = new javax.swing.JTextField();
        nomeTextField = new javax.swing.JTextField();
        voltarButton = new javax.swing.JButton();
        senhaPasswordField = new javax.swing.JPasswordField();
        cadastrarButton = new javax.swing.JButton();
        administradorCheckBox = new javax.swing.JCheckBox();
        generoTextField = new javax.swing.JTextField();
        idadeTextField = new javax.swing.JTextField();
        romanceSecundarioRadioButton = new javax.swing.JRadioButton();
        ficcaoSecundarioRadioButton = new javax.swing.JRadioButton();
        tecnicoSecundarioRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        romancePrimarioRadioButton = new javax.swing.JRadioButton();
        ficcaoPrimarioRadioButton = new javax.swing.JRadioButton();
        tecnicoPrimarioRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(389, 500));
        setPreferredSize(new java.awt.Dimension(399, 625));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));
        getContentPane().add(loginTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 310, 41));

        nomeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));
        getContentPane().add(nomeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 310, 41));

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(voltarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 140, 40));

        senhaPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));
        getContentPane().add(senhaPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 310, 40));

        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 140, 40));

        administradorCheckBox.setText("Dar permissões de adminstrador");
        getContentPane().add(administradorCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        generoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Gênero"));
        getContentPane().add(generoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 310, 40));

        idadeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Idade"));
        getContentPane().add(idadeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 310, 40));

        generoSecundarioGroup.add(romanceSecundarioRadioButton);
        romanceSecundarioRadioButton.setText("Romance");
        romanceSecundarioRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanceSecundarioRadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(romanceSecundarioRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        generoSecundarioGroup.add(ficcaoSecundarioRadioButton);
        ficcaoSecundarioRadioButton.setText("Ficção");
        getContentPane().add(ficcaoSecundarioRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        generoSecundarioGroup.add(tecnicoSecundarioRadioButton);
        tecnicoSecundarioRadioButton.setText("Técnico");
        getContentPane().add(tecnicoSecundarioRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        jLabel1.setText("Segundo Gênero Literário Preferido:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 230, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastrar Novo Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 310, 50));

        generoPrimarioGroup.add(romancePrimarioRadioButton);
        romancePrimarioRadioButton.setText("Romance");
        romancePrimarioRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romancePrimarioRadioButtonActionPerformed(evt);
            }
        });
        getContentPane().add(romancePrimarioRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        generoPrimarioGroup.add(ficcaoPrimarioRadioButton);
        ficcaoPrimarioRadioButton.setText("Ficção");
        getContentPane().add(ficcaoPrimarioRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        generoPrimarioGroup.add(tecnicoPrimarioRadioButton);
        tecnicoPrimarioRadioButton.setText("Técnico");
        getContentPane().add(tecnicoPrimarioRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        jLabel3.setText("Gêneros Literários Preferido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 230, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void romanceSecundarioRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanceSecundarioRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_romanceSecundarioRadioButtonActionPerformed
    
    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        var dat = new DashboardAdminTela(logado);
        dat.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        
        //dados do usuario recebidos do formulario
        String nome = nomeTextField.getText();
        String login = loginTextField.getText();
        String senha = new String(senhaPasswordField.getPassword());
        int idade = Integer.parseInt(idadeTextField.getText());
        String genero = generoTextField.getText();
        int tipo = 2;
        if (administradorCheckBox.isSelected()){
            tipo = 1;
        }
        
        //tentando cadastrar o usuario na tabela tb_usuario e receber o id
        try{
            Usuario usuario = new Usuario(nome, login, senha, idade, genero, tipo);
            UsuarioDAO.cadastrar(usuario);
            System.out.println("Usuario cadastrado com sucesso!");
            UsuarioDAO.receberDados(usuario);
            System.out.println("Select realizado com sucesso!");
            
            //tentando cadastrar os generos preferidos do usario na tabela tb_preferidos
            //1 = romance
            //2 = ficção
            //3 = técnico
            
            if (romancePrimarioRadioButton.isSelected()){
                var p = new Preferido(usuario.getIdUsuario(), 1);
                PreferidoDAO.registrar(p);
            }
            if (ficcaoPrimarioRadioButton.isSelected()){
                var p = new Preferido(usuario.getIdUsuario(), 2);
                PreferidoDAO.registrar(p);
            }
            if (tecnicoPrimarioRadioButton.isSelected()){
                var p = new Preferido(usuario.getIdUsuario(), 3);
                PreferidoDAO.registrar(p);
            }
            if (romanceSecundarioRadioButton.isSelected() && !romancePrimarioRadioButton.isSelected()){
                var p = new Preferido(usuario.getIdUsuario(), 1);
                PreferidoDAO.registrar(p);
            }
            if (ficcaoSecundarioRadioButton.isSelected() && !ficcaoPrimarioRadioButton.isSelected()){
                var p = new Preferido(usuario.getIdUsuario(), 2);
                PreferidoDAO.registrar(p);
            }
            if (tecnicoSecundarioRadioButton.isSelected() && !tecnicoPrimarioRadioButton.isSelected()){
                var p = new Preferido(usuario.getIdUsuario(), 3);
                PreferidoDAO.registrar(p);
            }
            
            System.out.println("Preferencias cadastradas com sucesso!");
            
            JOptionPane.showMessageDialog (null, "Usuario cadastrado com sucesso!");
            var dat = new DashboardAdminTela(logado);
            dat.setVisible(true);
            this.dispose();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog (null, "Erro ao cadastrar o usuario");
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void romancePrimarioRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romancePrimarioRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_romancePrimarioRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuarioTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox administradorCheckBox;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JRadioButton ficcaoPrimarioRadioButton;
    private javax.swing.JRadioButton ficcaoSecundarioRadioButton;
    private javax.swing.ButtonGroup generoPrimarioGroup;
    private javax.swing.ButtonGroup generoSecundarioGroup;
    private javax.swing.JTextField generoTextField;
    private javax.swing.JTextField idadeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JRadioButton romancePrimarioRadioButton;
    private javax.swing.JRadioButton romanceSecundarioRadioButton;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JRadioButton tecnicoPrimarioRadioButton;
    private javax.swing.JRadioButton tecnicoSecundarioRadioButton;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
