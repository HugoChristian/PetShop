
package Formulario;

import Controle.Animal;
import Controle.Vacina;
import DAO.DaoAnimal;
import DAO.DaoVacina;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormVacina extends javax.swing.JFrame {

    /**
     * Creates new form VacinaForm
     */
    public FormVacina() {
        initComponents();
        
        preenchertabela();
        
        //Metodo para incluir o icone
        CriarIcone();

        
        //Validações - Desabilitando os botoes e campos de textos
        BloquarCamposIniciar();
        
        //Iniciar o sistema com apenas uma guia
        this.jTabbedPaneVacina.setSelectedIndex(1);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPaneVacina = new javax.swing.JTabbedPane();
        jPanelCadastroVacina = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFornecedor = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jPanelConsultaVacina = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVacina = new javax.swing.JTable();
        bttSair = new javax.swing.JButton();
        bttNovo = new javax.swing.JButton();
        bttEditar = new javax.swing.JButton();
        bttExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(550, 330));
        setMinimumSize(new java.awt.Dimension(550, 330));
        setPreferredSize(new java.awt.Dimension(550, 330));
        setResizable(false);
        getContentPane().setLayout(null);

        jTabbedPaneVacina.setMaximumSize(new java.awt.Dimension(550, 330));
        jTabbedPaneVacina.setMinimumSize(new java.awt.Dimension(550, 330));
        jTabbedPaneVacina.setName("FormVacina"); // NOI18N
        jTabbedPaneVacina.setPreferredSize(new java.awt.Dimension(550, 330));

        jPanelCadastroVacina.setLayout(null);

        jLabel1.setText("Código");
        jPanelCadastroVacina.add(jLabel1);
        jLabel1.setBounds(40, 50, 33, 14);

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanelCadastroVacina.add(txtCodigo);
        txtCodigo.setBounds(40, 70, 80, 25);

        jLabel2.setText("Nome");
        jPanelCadastroVacina.add(jLabel2);
        jLabel2.setBounds(130, 50, 27, 14);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanelCadastroVacina.add(txtNome);
        txtNome.setBounds(130, 70, 380, 25);

        jLabel3.setText("Preço");
        jPanelCadastroVacina.add(jLabel3);
        jLabel3.setBounds(40, 120, 27, 14);
        jPanelCadastroVacina.add(txtPreco);
        txtPreco.setBounds(40, 140, 113, 25);

        jLabel4.setText("Fornecedor");
        jPanelCadastroVacina.add(jLabel4);
        jLabel4.setBounds(160, 120, 55, 14);
        jPanelCadastroVacina.add(txtFornecedor);
        txtFornecedor.setBounds(160, 140, 350, 25);
        txtFornecedor.getAccessibleContext().setAccessibleName("");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanelCadastroVacina.add(btnNovo);
        btnNovo.setBounds(40, 240, 80, 23);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanelCadastroVacina.add(btnSalvar);
        btnSalvar.setBounds(130, 240, 80, 23);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanelCadastroVacina.add(btnCancelar);
        btnCancelar.setBounds(310, 240, 110, 23);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanelCadastroVacina.add(btnSair);
        btnSair.setBounds(430, 240, 80, 23);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanelCadastroVacina.add(btnEditar);
        btnEditar.setBounds(220, 240, 80, 23);

        jTabbedPaneVacina.addTab("Cadastro", jPanelCadastroVacina);

        jPanelConsultaVacina.setLayout(null);

        tbVacina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Preço", "Fornecedor"
            }
        ));
        jScrollPane1.setViewportView(tbVacina);

        jPanelConsultaVacina.add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 480, 110);

        bttSair.setText("Sair");
        jPanelConsultaVacina.add(bttSair);
        bttSair.setBounds(410, 250, 90, 23);

        bttNovo.setText("Novo");
        bttNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNovoActionPerformed(evt);
            }
        });
        jPanelConsultaVacina.add(bttNovo);
        bttNovo.setBounds(140, 250, 80, 23);

        bttEditar.setText("Editar");
        jPanelConsultaVacina.add(bttEditar);
        bttEditar.setBounds(230, 250, 80, 23);

        bttExcluir.setText("Excluir");
        jPanelConsultaVacina.add(bttExcluir);
        bttExcluir.setBounds(320, 250, 80, 23);

        jTabbedPaneVacina.addTab("Consulta", jPanelConsultaVacina);

        getContentPane().add(jTabbedPaneVacina);
        jTabbedPaneVacina.setBounds(0, 0, 530, 350);

        setSize(new java.awt.Dimension(550, 381));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    
    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
          
        //Validações - Desabilitando os botoes e campos de textos
            BloquarCamposCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
           if("".equals(txtNome.getText())){
            
            JOptionPane.showMessageDialog(null,"Por favor prencher o Nome da Vacina!");
            
        }else if("".equals(txtPreco.getText())){
        
            JOptionPane.showMessageDialog(null,"Por favor prencher o Preço da Vacina!");
            
        }else if("".equals(txtFornecedor.getText())){
        
            JOptionPane.showMessageDialog(null,"Por favor prencher o Fornecedor!");
        }
        else{
          
          // Salvar as informações no banco de dados
          preencher();
            
          //Zerar valores contidos na variavel
          LimparCamposVacina();
          
          //Bloquear os campos para salvar
           BloquarCamposCancelar();
          
          //Prencher a tabela ao carregar
          preenchertabela();
             
         this.jTabbedPaneVacina.setSelectedIndex(1);
    }//GEN-LAST:event_btnSalvarActionPerformed
    }
    
    
    private void bttNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNovoActionPerformed
         
        this.jTabbedPaneVacina.setSelectedIndex(0);
        //Validações - Habilitando os botoes e campos de textos
        
        LiberarCamposNovoConsulta();
        
    }//GEN-LAST:event_bttNovoActionPerformed

    
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

            //Validações - Habilitando os botoes e campos de textos
            LiberarCamposNovoCadastro();
    }//GEN-LAST:event_btnNovoActionPerformed

    

    
    // <editor-fold desc="Metodos">
    //Metodo para criar o icone
    public void CriarIcone(){
    //Adicionar icone no programa
        URL url = this.getClass().getResource("/Img/favicon.png");  
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(iconeTitulo);
    
    }
    
    //Metodo de salvar no banco de dados 
    private boolean preencher() {

        //Classe Controlle get e set
        Vacina vacina = new Vacina();
        vacina.setNome(txtNome.getText());
        vacina.setForncedor(txtFornecedor.getText());
        vacina.setPreco(Float.parseFloat(txtPreco.getText()));

        // Classe DAO metodo de salvar
        DaoVacina daoVacina = new DaoVacina();
        daoVacina.Salvar(vacina);
        return true;

    }

    //Metodo de prencher a tabela
    private void preenchertabela() {

        DefaultTableModel modelo = (DefaultTableModel) tbVacina.getModel();
        modelo.setNumRows(0);
        DaoVacina daoVacina = new DaoVacina();
        //Percorre a lista copiando os dados para a tabela
        for(Vacina p : daoVacina.listaVacina()) {

            modelo.addRow(new Object[]{
                p.getCodigoVacina(),
                p.getNome(),
                p.getPreco(),
                p.getFornecedor()
            }
          );
    }
  }
    
    //Metodo para bloquear quando o usuario Iniciar o sistema
    private void BloquarCamposIniciar(){
    
        txtCodigo.setEnabled(false);
        txtFornecedor.setEnabled(false);
        txtNome.setEnabled(false);
        txtPreco.setEnabled(false);
        
        //Tudo que começa com btn é do CADASTRO
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnSalvar.setEnabled(false);
        
    }
    
    //Metodo para bloquear quando o usuario clica em Cancelar
    private void BloquarCamposCancelar(){
    
        txtCodigo.setEnabled(false);
        txtFornecedor.setEnabled(false);
        txtNome.setEnabled(false);
        txtPreco.setEnabled(false);
        
        //Tudo que começa com btn é do CADASTRO
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnNovo.setEnabled(true);
    }
    
    //Metodo para limpar os campos
    public void LimparCamposVacina(){
        txtNome.setText("");
        txtFornecedor.setText("");
        txtPreco.setText("");
    }
   
    //Metodo para liberar os campos
    private void LiberarCamposNovoConsulta(){
        
        //Metodo de liberar o campo
        txtFornecedor.setEnabled(true);
        txtNome.setEnabled(true);
        txtPreco.setEnabled(true);
        bttEditar.setEnabled(true);
        
        //Tudo que começa com btn é do CADASTRO
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnNovo.setEnabled(false);
        //bttEditar.setEnabled(false);
    
    }
   
    //Metodo para liberar os campos
    private void LiberarCamposNovoCadastro(){
        
        //Metodo de liberar o campo
        txtFornecedor.setEnabled(true);
        txtNome.setEnabled(true);
        txtPreco.setEnabled(true);
        
        //Tudo que começa com btn é do CADASTRO
        btnEditar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnNovo.setEnabled(false);
        btnEditar.setEnabled(false);
    
    }
    
   /*  

    

    

    

    
   
    }*/
   // </editor-fold>
        
    
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
            java.util.logging.Logger.getLogger(FormVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVacina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton bttEditar;
    private javax.swing.JButton bttExcluir;
    private javax.swing.JButton bttNovo;
    private javax.swing.JButton bttSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelCadastroVacina;
    private javax.swing.JPanel jPanelConsultaVacina;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPaneVacina;
    private javax.swing.JTable tbVacina;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
