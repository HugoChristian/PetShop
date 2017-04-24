package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BBConexao {

    //Metodo de conexao ao banco de dados
    public Connection getConnection() {
        //Criando a string de conexao com o banco de dados
        try {
            //Conexão com senha
            //return DriverManager.getConnection("jdbc:mysql://localhost/BDVacinacao","root","");
            //Conexão sem senha
            return DriverManager.getConnection("jdbc:mysql://localhost/BDVacinacao", "root", "root");

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }
    
    public Connection getConnection2(String Databases, String Usuario, String Senha) {
        //Criando a string de conexao com o banco de dados
    
                try {
            //Conexão com senha
            return DriverManager.getConnection("jdbc:mysql://localhost/"+Databases,Usuario,Senha);
            //Conexão sem senha
            //return DriverManager.getConnection("jdbc:mysql://localhost/BDVacinacao", "root", "root");

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    //Em caso de erro retornara ao usuario uma mensagem
    PreparedStatement preparedStatement(String query) {
        throw new UnsupportedOperationException("Erro na conexão com o banco de dados");

    }

    
}
