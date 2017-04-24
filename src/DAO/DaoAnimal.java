
package DAO;

import Conexao.Conexao;
import Controle.Animal;
import Controle.Metodos;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DaoAnimal {
    
        
    //Instanciando a classe de conexao com o banco de dados
    public DaoAnimal(){
    
        Metodos.LerArquivo();
        Conexao.getConexao();
        
    }
    
    //Metodo para salvar
    public void Salvar(Animal animall){
    
        String con = "INSERT INTO Animal (nome, raca, especie) values (?,?,?)";
        
        
       
        try{
        
            PreparedStatement pst = Conexao.getConexao().prepareCall(con);//Você está preparando para trabalhar com banco de dados
            pst.setString(1, animall.getNome());
            pst.setString(2, animall.getRaca());
            pst.setString(3, animall.getEspecie());
            pst.executeUpdate();
            pst.close();
            JOptionPane.showMessageDialog(null,"Gravado com sucesso!");
                    
        }catch(SQLException ex){
            Logger.getLogger(DaoAnimal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao gravar no banco de dados" + ex);
        
        
        }
        
    
    
    }
    
    //Metodo de listar os animais cadastrados
    public List<Animal> listaAnimais(){
    
        List <Animal> listar = new ArrayList<>();
        //Executa a SQL a captura o resultado da consulta
        String SQL = "select Codigo, Nome, Especie, Raca from Animal";
        
        try {
            PreparedStatement pst = Conexao.getConexao().prepareStatement(SQL);
            ResultSet rs = pst.executeQuery();
            
        //Criar um objeto para armazenar uma linha da consulta
        while (rs.next()){
        
            Animal animal = new Animal();
            animal.setCodigoAnimal(rs.getInt("Codigo"));
            animal.setNome(rs.getString("Nome"));
            animal.setRaca(rs.getString("Raca"));
            animal.setEspecie(rs.getString("Especie"));
        
        //Armazenar a linha lida em uma lista
        listar.add(animal);
        }
        //Fechar a conexão
        pst.close();
        rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoAnimal.class.getName()).log(Level.SEVERE,null,ex);
        }
        return listar;
    }
    
    //Metodo de Excluir os animais selecionados
    public void ExcluirAnimal(Animal animal){
    
        String Sql = "Delete from Animal where Codigo= ?";
        
        try {
            PreparedStatement pst = Conexao.getConexao().prepareStatement(Sql);
            pst.setInt(1, animal.getCodigoAnimal());
            pst.execute();
            
          //  JOptionPane.showMessageDialog(null, "Cadastro excluído com sucesso!");
            
        } catch (SQLException ex) {
            
            Logger.getLogger(DaoAnimal.class.getName()).log(Level.SEVERE, null,ex);
        }
    
    }
    
    //Metodo para atualizar os valores
    public void Atualizar(Animal animal){
    
        String sql = "UPDATE Animal SET Nome=?, Raca=?, Especie=? WHERE Codigo = ?";
        
        try {
            PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);
            pst.setString(1, animal.getNome());
            pst.setString(2, animal.getRaca());
            pst.setString(3, animal.getEspecie());
            pst.setInt(4, animal.getCodigoAnimal());
            
            pst.executeUpdate();
            
            pst.close();
            
            JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(DaoAnimal.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
