
package Formulario;

import Controle.Metodos;
import DAO.DaoConexao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;


public class FormBanco extends javax.swing.JFrame {


    public FormBanco() {
        initComponents();
        CriarIcone();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttCriaBanco = new javax.swing.JButton();
        bttSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criar Banco de dados");
        setMaximumSize(new java.awt.Dimension(323, 101));
        setMinimumSize(new java.awt.Dimension(323, 101));
        setName("FormBanco"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        bttCriaBanco.setText("Criar Banco de dados");
        bttCriaBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCriaBancoActionPerformed(evt);
            }
        });
        getContentPane().add(bttCriaBanco);
        bttCriaBanco.setBounds(20, 30, 161, 38);

        bttSair.setText("Sair");
        bttSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSairActionPerformed(evt);
            }
        });
        getContentPane().add(bttSair);
        bttSair.setBounds(200, 30, 100, 40);

        setSize(new java.awt.Dimension(339, 139));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bttCriaBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCriaBancoActionPerformed

        DaoConexao.CriarBanco();
        
    }//GEN-LAST:event_bttCriaBancoActionPerformed

    private void bttSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSairActionPerformed

        dispose();
    }//GEN-LAST:event_bttSairActionPerformed

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
            java.util.logging.Logger.getLogger(FormBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBanco().setVisible(true);
            }
        });
    }

        //Metodo para criar o icone
    public void CriarIcone() {
        //Adicionar icone no programa
        URL url = this.getClass().getResource("/Img/favicon.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttCriaBanco;
    private javax.swing.JButton bttSair;
    // End of variables declaration//GEN-END:variables
}