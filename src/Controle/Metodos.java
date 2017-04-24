package Controle;

import Conexao.Conexao;
import Formulario.FormConexaoInicio;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Metodos {
    
    // <editor-fold desc="Variaveis">
    public static String Servidor;
    public static String Usuario;
    public static String Senha;
    public static String Banco;

    String SisOpe = System.getProperty("os.name");
    // </editor-fold>
    
    // <editor-fold desc="Metodos">
    //Metodo para verificar se tipo de sistema
    public String VerificarSistema() {

        return SisOpe;
    }

    //Metodo de escrever arquivos
    public static void EscreverArquivo(String Servidor, String Usuario, String Senha, String Banco) {
        Metodos metodo = new Metodos();
        String verificando = metodo.VerificarSistema();
    
    // <editor-fold desc="Verificar tipo de sistema">
        

    //Verificando se é linux ou WIndows           
    
    // <editor-fold desc="Linux">    
        if (verificando.equals("Linux")) {

            Properties prop = new Properties();
            try {
     //definir as propriedades e valores
                prop.setProperty("dbservidor", Servidor);
                prop.setProperty("dbuser", Usuario);
                prop.setProperty("dbpassword", Senha);
                prop.setProperty("database", Banco);

                File file = new File("//home//aluno//SystemVeterinaria//config.ini");

                if (file.exists()) {

                    JOptionPane.showMessageDialog(null, "Arquivo atulizado com sucesso!", "System Veterinaria", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    //salvar o arquivo
                    prop.store(new FileOutputStream("//home//aluno//SystemVeterinaria//config.ini"), null);
                    JOptionPane.showMessageDialog(null, "Arquivo Criado com sucesso!", "System Veterinaria", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
    // </editor-fold>
    
    // <editor-fold desc="Windows">
        } else {
            Properties prop = new Properties();
            try {
                //definir as propriedades e valores
                prop.setProperty("dbservidor", Servidor);
                prop.setProperty("dbuser", Usuario);
                prop.setProperty("dbpassword", Senha);
                prop.setProperty("database", Banco);

                File file = new File("C://SystemVeterinaria//config.ini");

                if (file.exists()) {

                    JOptionPane.showMessageDialog(null, "Arquivo atulizado com sucesso!", "System Veterinaria", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    //salvar o arquivo
                    prop.store(new FileOutputStream("C://SystemVeterinaria//config.ini"), null);
                    JOptionPane.showMessageDialog(null, "Arquivo Criado com sucesso!", "System Veterinaria", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    // </editor-fold>
        
    // </editor-fold>

    }

    //Metodo de ler arquivos
    public static void LerArquivo() {
        Metodos metodo = new Metodos();
        String verificando = metodo.VerificarSistema();

        //Verificando se é linux ou WIndows               
        if (verificando.equals("Linux")) {

            Properties prop = new Properties();
            try {
                File file = new File("//home//aluno//SystemVeterinaria//config.ini");

                if (file.exists()) {
        //carrega properties
                    prop.load(new FileInputStream("//home//aluno//SystemVeterinaria//config.ini"));
                    
        //definir as propriedades e valores;
                Servidor = prop.getProperty("dbservidor");
                Usuario = prop.getProperty("dbuser");
                Senha = prop.getProperty("dbpassword");
                Banco = prop.getProperty("database");
                Conexao.setConexao(Servidor, Banco, Usuario, Senha);
                
                
                } else {
                    JOptionPane.showMessageDialog(null, "Arquivo de configuração não existe. " + "\n"
                            + "Por favor faça uma nova configuração ou " + "\n"
                            + "Entre em contato com administrador do seu sistema!", "System Veterinaria", JOptionPane.INFORMATION_MESSAGE);
                    FormConexaoInicio conexao = new FormConexaoInicio();
                    conexao.setVisible(true);
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } else {
            Properties prop = new Properties();
            try {
                File file = new File("C://SystemVeterinaria//config.ini");

                if (file.exists()) {
                    //carrega properties
                    prop.load(new FileInputStream("C://SystemVeterinaria//config.ini"));
                                    //definir as propriedades e valores;
                Servidor = prop.getProperty("dbservidor");
                Usuario = prop.getProperty("dbuser");
                Senha = prop.getProperty("dbpassword");
                Banco = prop.getProperty("database");
                    Conexao.setConexao(Servidor,Banco, Usuario, Senha);
                } else {
                    JOptionPane.showMessageDialog(null, "Arquivo de configuração não existe. " + "\n"
                            + "Por favor faça uma nova configuração ou " + "\n"
                            + "Entre em contato com administrador do seu sistema!", "System Veterinaria", JOptionPane.INFORMATION_MESSAGE);
                    FormConexaoInicio Conexao = new FormConexaoInicio();
                    Conexao.setVisible(true);
                    
                }


            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
    
    //Metodo de ler arquivos
    public static void LerArquivoConfiguracao() {
        Metodos metodo = new Metodos();
        String verificando = metodo.VerificarSistema();

        //Verificando se é linux ou WIndows               
        if (verificando.equals("Linux")) {

            Properties prop = new Properties();
            try {
                File file = new File("//home//aluno//SystemVeterinaria//config.ini");

                if (file.exists()) {
        //carrega properties
                    prop.load(new FileInputStream("//home//aluno//SystemVeterinaria//config.ini"));
                    
        //definir as propriedades e valores;
                Servidor = prop.getProperty("dbservidor");
                Usuario = prop.getProperty("dbuser");
                Senha = prop.getProperty("dbpassword");
                Banco = prop.getProperty("database");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } else {
            Properties prop = new Properties();
            try {
                File file = new File("C://SystemVeterinaria//config.ini");

                if (file.exists()) {
                    //carrega properties
                    prop.load(new FileInputStream("C://SystemVeterinaria//config.ini"));
         //definir as propriedades e valores;
                Servidor = prop.getProperty("dbservidor");
                Usuario = prop.getProperty("dbuser");
                Senha = prop.getProperty("dbpassword");
                Banco = prop.getProperty("database");
                
                }


            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
    
    //Metodo para iniciar o sistema conectado
    public static void Inicio(){
    
        Metodos.LerArquivo();
        String Servidor = Metodos.Servidor;
        String Usuario  = Metodos.Usuario;
        String Senha    = Metodos.Senha;
        String Banco    = Metodos.Banco;
 
        Conexao.setConexao(Servidor, Banco, Usuario, Senha);
        
        Conexao.getConexao();
    }
    
   
    
    // </editor-fold>

}
