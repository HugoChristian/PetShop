package Formulario;

import Conexao.Conexao;
import Controle.BancoDeDados;
import Controle.Metodos;
import DAO.DaoConexao;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FormConexao extends javax.swing.JFrame {

    
    public FormConexao() {
        

        
        
        initComponents();
        
        //Metodo de criar icone
        CriarIcone();
        
        //Metodo de criar pasta
        CriarPasta();

        //Metodo de bloquear o botão
        bloquear();
        
        //Metodo de ler o arquivo e liberar o campos        
        InformarCampos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        ComboBancos = new javax.swing.JComboBox<>();
        lblSenha1 = new javax.swing.JLabel();
        bttSair = new javax.swing.JButton();
        bttSalvar = new javax.swing.JButton();
        bttCriarBanco = new javax.swing.JButton();
        lblServidor = new javax.swing.JLabel();
        txtServidor = new javax.swing.JTextField();
        bttConectar = new javax.swing.JButton();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conexão com Banco de dados");
        setMaximumSize(new java.awt.Dimension(380, 283));
        setMinimumSize(new java.awt.Dimension(375, 278));
        setName("FormConexao"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(380, 283));
        getContentPane().setLayout(null);

        lblUsuario.setText("Usuário:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(200, 20, 90, 14);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(200, 40, 140, 30);

        lblSenha.setText("Banco de dados: ");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(40, 140, 150, 14);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(40, 100, 140, 30);

        ComboBancos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar o banco de dados.." }));
        ComboBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBancosActionPerformed(evt);
            }
        });
        ComboBancos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ComboBancosKeyPressed(evt);
            }
        });
        getContentPane().add(ComboBancos);
        ComboBancos.setBounds(40, 160, 300, 30);

        lblSenha1.setText("Senha:");
        getContentPane().add(lblSenha1);
        lblSenha1.setBounds(40, 80, 80, 14);

        bttSair.setText("Sair");
        bttSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSairActionPerformed(evt);
            }
        });
        getContentPane().add(bttSair);
        bttSair.setBounds(250, 220, 90, 30);

        bttSalvar.setText("Salvar");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(bttSalvar);
        bttSalvar.setBounds(40, 220, 80, 30);

        bttCriarBanco.setText("Criar Banco");
        bttCriarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttCriarBancoActionPerformed(evt);
            }
        });
        getContentPane().add(bttCriarBanco);
        bttCriarBanco.setBounds(130, 220, 110, 30);

        lblServidor.setText("Servidor:");
        getContentPane().add(lblServidor);
        lblServidor.setBounds(40, 20, 90, 14);
        getContentPane().add(txtServidor);
        txtServidor.setBounds(40, 40, 140, 30);

        bttConectar.setText("Conectar");
        bttConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttConectarActionPerformed(evt);
            }
        });
        getContentPane().add(bttConectar);
        bttConectar.setBounds(200, 100, 140, 30);

        setSize(new java.awt.Dimension(392, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void bttSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSairActionPerformed

        dispose();
    }//GEN-LAST:event_bttSairActionPerformed

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed

        if (txtServidor.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Por Favor informar o Nome do Servidor", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }else if (txtUsuario.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Por Favor informar o Usuário do Servidor", "Aviso", JOptionPane.INFORMATION_MESSAGE); 
        } else {
            
            Metodos.EscreverArquivo(txtServidor.getText(), txtUsuario.getText(), txtSenha.getText(), ComboBancos.getSelectedItem().toString());

            //JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void ComboBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBancosActionPerformed


    }//GEN-LAST:event_ComboBancosActionPerformed

    private void bttConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttConectarActionPerformed

        Conectar();        
        listarBancos();
        
        
        Liberar();
        
    }//GEN-LAST:event_bttConectarActionPerformed

    private void bttCriarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttCriarBancoActionPerformed

        FormBanco Banco = new FormBanco();
        Banco.setVisible(true);
    }//GEN-LAST:event_bttCriarBancoActionPerformed

    private void ComboBancosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ComboBancosKeyPressed

        Conectar();
        
        listarBancos();
        
        Liberar();
    }//GEN-LAST:event_ComboBancosKeyPressed

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
            java.util.logging.Logger.getLogger(FormConexao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormConexao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormConexao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormConexao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormConexao().setVisible(true);
            }
        });
    }

    // <editor-fold desc="Metodos">
    //Metodo para criar o icone
    public void CriarIcone() {
        //Adicionar icone no programa
        URL url = this.getClass().getResource("/Img/favicon.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
    }

    //Metodo para criar pasta
    public void CriarPasta() {
        Metodos metodo = new Metodos();
        String verificando = metodo.VerificarSistema();

        //Verificando se é linux ou WIndows
        if (verificando.equals("Linux")) {
            //Criando uma pasta no Linux
            File pasta = new File("//home//aluno//SystemVeterinaria//");
            pasta.mkdir();
        }else {
           //Criando uma pasta no Windows
            File pasta = new File("C://SystemVeterinaria//");
            pasta.mkdir();

        }

            
        }
    
    public void Conectar(){
        Conexao.setConexao(txtServidor.getText(), "mysql", txtUsuario.getText(), txtSenha.getText());
        Conexao.getConexao();
  
        
       
    }

    public void listarBancos(){
    
        Vector <BancoDeDados> Conexao;
        
       DaoConexao dc = new DaoConexao();
       
       Conexao = dc.CarregarBancos();
       ComboBancos.setModel(new DefaultComboBoxModel(Conexao));
        
    }
    
    public void bloquear(){
    
        bttCriarBanco.setEnabled(false);
    }
    
    public void Liberar(){
    
        bttCriarBanco.setEnabled(true);
    }
    
    public void InformarCampos(){
       
        
        Metodos.LerArquivoConfiguracao();
        String Servidor = Metodos.Servidor;
        String Usuario  = Metodos.Usuario;
        String Senha    = Metodos.Senha;
        String Banco    = Metodos.Banco;
 
        txtServidor.setText(Servidor);
        txtUsuario.setText(Usuario); 
        txtSenha.setText(Senha);
        ComboBancos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { Banco }));
        
    
    }
    // </editor-fold >

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBancos;
    private javax.swing.JButton bttConectar;
    private javax.swing.JButton bttCriarBanco;
    private javax.swing.JButton bttSair;
    private javax.swing.JButton bttSalvar;
    private java.awt.Label label1;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSenha1;
    private javax.swing.JLabel lblServidor;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtServidor;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
