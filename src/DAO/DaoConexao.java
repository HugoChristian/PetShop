package DAO;

import Conexao.BBConexao;
import Conexao.Conexao;
import Controle.BancoDeDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaoConexao {

    //Instanciando a classe de conexao com o banco de dados
    public DaoConexao() {

        
    }

    //Carregar os bancos de dados na combobox
    public Vector<BancoDeDados> CarregarBancos() {

        Vector<BancoDeDados> dados = new Vector<BancoDeDados>();

        String sql = "show databases";
        try {
            PreparedStatement pst = Conexao.getConexao().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {

                BancoDeDados conexao = new BancoDeDados();
                conexao.setBDatabases(rs.getString("Database"));

                //Armazenar a linha lida em uma lista
                dados.add(conexao);

            }
        } catch (SQLException ex) {
            Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dados;

    }

    //Metodo de criar o banco de dados
    public static void CriarBanco() {

        try {
            String[] Parametros = new String[4] ;
            
            Statement statement = Conexao.getConexao().createStatement();
            
            // <editor-fold desc="Criando Banco de dados">
            Parametros[0] = "CREATE SCHEMA IF NOT EXISTS `BDVacinacao` ";
            
            statement.executeUpdate(Parametros[0]);
            //</editor-fold>
            
            // <editor-fold desc="Criando Tabela Vacina">
            Parametros[1] = "CREATE TABLE IF NOT EXISTS `BDVacinacao`.`Vacina` (\n"
                    + "  `Tipo` INT(11) NOT NULL AUTO_INCREMENT,\n"
                    + "  `Nome` VARCHAR(45) NULL DEFAULT NULL,\n"
                    + "  `Preco` DECIMAL(6) NULL DEFAULT NULL,\n"
                    + "  `Fornecedor` VARCHAR(45) NULL DEFAULT NULL,\n"
                    + "  PRIMARY KEY (`Tipo`))\n"
                    + "ENGINE = InnoDB\n"
                    + "DEFAULT CHARACTER SET = utf8;\n";

            statement.executeUpdate(Parametros[1]);       
            //</editor-fold>
            
            // <editor-fold desc="Criando a tabela Animal">
            Parametros[2] = "CREATE TABLE IF NOT EXISTS `BDVacinacao`.`Animal` (\n"
                    + "  `Codigo` INT(11) NOT NULL AUTO_INCREMENT,\n"
                    + "  `Nome` VARCHAR(45) NULL DEFAULT NULL,\n"
                    + "  `Especie` VARCHAR(45) NULL DEFAULT NULL,\n"
                    + "  `Raca` VARCHAR(45) NULL DEFAULT NULL,\n"
                    + "  PRIMARY KEY (`Codigo`))\n"
                    + "ENGINE = InnoDB\n"
                    + "DEFAULT CHARACTER SET = utf8;\n";
                    
            statement.executeUpdate(Parametros[2]);
            //</editor-fold>
            
            // <editor-fold desc="Criando a Tabela Vacinacao">
            Parametros[3] = "CREATE TABLE IF NOT EXISTS `BDVacinacao`.`Vacinacao` (\n"
                    + "  `Tipo` INT(11) NOT NULL AUTO_INCREMENT,\n"
                    + "  `Vacina_Tipo` INT(11) NOT NULL,\n"
                    + "  `Animal_Codigo` INT(11) NOT NULL,\n"
                    + "  PRIMARY KEY (`Tipo`),\n"
                    + "  INDEX `fk_Vacinacao_Vacina_idx` (`Vacina_Tipo` ASC),\n"
                    + "  INDEX `fk_Vacinacao_Animal1_idx` (`Animal_Codigo` ASC),\n"
                    + "  CONSTRAINT `fk_Vacinacao_Vacina`\n"
                    + "    FOREIGN KEY (`Vacina_Tipo`)\n"
                    + "    REFERENCES `BDVacinacao`.`Vacina` (`Tipo`)\n"
                    + "    ON DELETE NO ACTION\n"
                    + "    ON UPDATE NO ACTION,\n"
                    + "  CONSTRAINT `fk_Vacinacao_Animal1`\n"
                    + "    FOREIGN KEY (`Animal_Codigo`)\n"
                    + "    REFERENCES `BDVacinacao`.`Animal` (`Codigo`)\n"
                    + "    ON DELETE NO ACTION\n"
                    + "    ON UPDATE NO ACTION)\n"
                    + "ENGINE = InnoDB\n"
                    + "DEFAULT CHARACTER SET = utf8;";
                       
            statement.executeUpdate(Parametros[3]);
            //</editor-fold>
            
            statement.close();
            JOptionPane.showMessageDialog(null, "Banco de dados Criado com sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(BBConexao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao criar banco de dados" + ex);
        }

    }
    
}
