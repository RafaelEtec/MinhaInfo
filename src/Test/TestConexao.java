package Test;

import java.sql.*;

/** 
   por Rafael Ferreira Goulart
**/
public class TestConexao {
    public static Connection abrirConexao() {
        Connection con = null;
        
        try {
            // Instânciando o driver de conexão
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Recebendo as informações para conexão com o banco de dados
            // String url = "jdbc:mysql://127.0.0.1/dbestacionamento?user=root&password=";
            String url = "jdbc:mysql://127.0.0.1/";
            
            // Conectando a url ao Driver e instanciando  a conexão com o Banco de dados
            con = DriverManager.getConnection(url);
            System.out.println("Conexão aberta \n");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
    public static void fecharConexao(Connection con) {
        
        try {
            con.close();
            System.out.println("Conexão Fechada!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
             System.out.println(ex.getMessage());
        }
    }
}