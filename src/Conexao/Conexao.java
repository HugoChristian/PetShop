package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    String Database;
    
    
    //Criado uma variavel tipo statica com o comando Connection
    static Connection connection = null;
    public static String status = "Não está conectado!";
    
    //Metodo construtor de conexao
    public Conexao(){
  
          
    }
  
    //Metodo de Conexao
    public static Connection setConexao(String Servidor, String Database, String Usuario, String Senha){
    
        //Carregando o Driver
        //String driveName  ="com.mysql.jdbc.Driver";
       // Class.forName(driveName);
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://" + Servidor + "/" + Database, Usuario, Senha);
        } catch (SQLException ex) {
            
              throw new RuntimeException(ex);
        }
        
         //Testa sua conexão//  
        if(connection != null) {
 
        status = "STATUS--->Conectado com sucesso!";
 
        } else {
 
        status = ("STATUS--->Não foi possivel realizar conexão");
 
        }
        
        return connection;
        

    }
   
    //Metodo Conectar
    public static Connection getConexao(){
        return connection;
        

    }
    
     //Método que retorna o status da sua conexão//
    public static String statusConection() {
 
        return status;
 
    }
    
     //Método que fecha sua conexão//
    public static boolean FecharConexao() {
         try {
             Conexao.connection.close();
 
            return true;
 
        } catch (SQLException ex) {
 
            return false;
 
        }
 
  
 
    }

    
    
    
}
