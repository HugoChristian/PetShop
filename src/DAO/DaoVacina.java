
package DAO;

import Conexao.Conexao;
import Controle.Vacina;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaoVacina {
    
    
    
    //Instanciando a classe de conexao com o banco de dados
    public DaoVacina(){
    
        //Metodos.LerArquivo();
        Conexao.getConexao();
    
    }
    
    
     //Metodo para salvar
    public void Salvar(Vacina vacina){
    
        String con = "INSERT INTO Vacina (Nome, Preco, Fornecedor) values (?,?,?)";
        
       
        try{
        
            PreparedStatement pst = Conexao.getConexao().prepareCall(con); //Você está preparando para trabalhar com banco de dados
            pst.setString(1, vacina.getNome());
            pst.setFloat(2, vacina.getPreco());
            pst.setString(3, vacina.getFornecedor());
            pst.executeUpdate();
            pst.close();
            JOptionPane.showMessageDialog(null,"Gravado com sucesso!");
                    
        }catch(SQLException ex){
            Logger.getLogger(DaoVacina.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao gravar no banco de dados" + ex);
        
        
        }
        
    
    
    }
    
        //Metodo de listar os animais cadastrados

    public List<Vacina> listaVacina(){
    
        List <Vacina> listar = new ArrayList<>();
        //Executa a SQL a captura o resultado da consulta
        String SQL = "select Tipo, Nome, Preco, Fornecedor from Vacina";
        
        try {
            PreparedStatement pst = Conexao.getConexao().prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();
            
        //Criar um objeto para armazenar uma linha da consulta
        while (rs.next()){
        
            Vacina vacina = new Vacina();
            vacina.setCodigoVacina(rs.getInt("Tipo"));
            vacina.setNome(rs.getString("Nome"));
            vacina.setPreco(rs.getFloat("Preco"));
            vacina.setForncedor(rs.getString("Fornecedor"));
        
        //Armazenar a linha lida em uma lista
        listar.add(vacina);
        }
        //Fechar a conexão
        pst.close();
        rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoVacina.class.getName()).log(Level.SEVERE,null,ex);
        }
        return listar;
    }
}
