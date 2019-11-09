/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.newtonpaiva.centralleitos.ui;

import com.sun.glass.events.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
/**
 *
 * @author Gustavo
 */
public class MenuInicial extends javax.swing.JFrame {

    /**
     * Creates new form MenuInicial
     */
    public MenuInicial() {
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

        LabelImagem = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuInicio = new javax.swing.JMenu();
        MenuCadastro = new javax.swing.JMenu();
        MenuCadastroEspecialidade = new javax.swing.JMenuItem();
        MenuCadastroMedico = new javax.swing.JMenuItem();
        MenuCadastroPaciente = new javax.swing.JMenuItem();
        MenuCadastroProcedimento = new javax.swing.JMenuItem();
        MenuCadastroUsuario = new javax.swing.JMenuItem();
        MenuCadastroUnidade = new javax.swing.JMenuItem();
        MenuRelatorio = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Controle Leito");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        LabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/newtonpaiva/img/equipe.png"))); // NOI18N
        LabelImagem.setAutoscrolls(true);

        MenuInicio.setText("Inicio");
        MenuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuInicioActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuInicio);

        MenuCadastro.setText("Cadastro");

        MenuCadastroEspecialidade.setText("Especialidade");
        MenuCadastroEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroEspecialidadeActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroEspecialidade);

        MenuCadastroMedico.setText("Medico");
        MenuCadastroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroMedicoActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroMedico);

        MenuCadastroPaciente.setText("Paciente");
        MenuCadastro.add(MenuCadastroPaciente);

        MenuCadastroProcedimento.setText("Procedimento");
        MenuCadastroProcedimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroProcedimentoActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroProcedimento);

        MenuCadastroUsuario.setText("Usuário");
        MenuCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroUsuarioActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroUsuario);

        MenuCadastroUnidade.setText("Unidade");
        MenuCadastroUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastroUnidadeActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCadastroUnidade);

        jMenuBar1.add(MenuCadastro);

        MenuRelatorio.setText("Relatório");
        jMenuBar1.add(MenuRelatorio);

        MenuSair.setText("Sair");
        MenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(LabelImagem)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(LabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCadastroMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroMedicoActionPerformed
        // TODO add your handling code here:
        new CadastroMedico().setVisible(true);
    }//GEN-LAST:event_MenuCadastroMedicoActionPerformed

    private void MenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSairMouseClicked
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null, "Sistema Encerrado, Obrigado!","SAIR",JOptionPane.INFORMATION_MESSAGE);
        
        //Fechar Tela
        dispose();
    }//GEN-LAST:event_MenuSairMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void MenuCadastroEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroEspecialidadeActionPerformed
        // TODO add your handling code here:
        new CadastroEspecialidade().setVisible(true);
    }//GEN-LAST:event_MenuCadastroEspecialidadeActionPerformed

    private void MenuCadastroProcedimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroProcedimentoActionPerformed
        // TODO add your handling code here:
        new CadastroProcedimento().setVisible(true);
    }//GEN-LAST:event_MenuCadastroProcedimentoActionPerformed

    private void MenuCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroUsuarioActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_MenuCadastroUsuarioActionPerformed

    private void MenuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuInicioActionPerformed
        // TODO add your handling code here:
        new MenuInicial().setVisible(true);
    }//GEN-LAST:event_MenuInicioActionPerformed

    private void MenuCadastroUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastroUnidadeActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_MenuCadastroUnidadeActionPerformed

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
                  //  javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImagem;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuCadastroEspecialidade;
    private javax.swing.JMenuItem MenuCadastroMedico;
    private javax.swing.JMenuItem MenuCadastroPaciente;
    private javax.swing.JMenuItem MenuCadastroProcedimento;
    private javax.swing.JMenuItem MenuCadastroUnidade;
    private javax.swing.JMenuItem MenuCadastroUsuario;
    private javax.swing.JMenu MenuInicio;
    private javax.swing.JMenu MenuRelatorio;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}