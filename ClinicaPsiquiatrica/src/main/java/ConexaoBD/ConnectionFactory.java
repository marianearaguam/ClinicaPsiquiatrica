/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexaoBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    // Configurações do banco de dados
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/clinicapsiqui";
    private static final String USUARIO = "root"; // Substitua pelo seu usuário do MySQL
    private static final String SENHA = "9T@ffy2008"; // Substitua pela sua senha do MySQL

    // Método para obter uma conexão com o banco de dados

    /**
     *
     * @return
     */
    public static Connection getConnection() {
        try {
            // Carrega o driver JDBC (não necessário em Java 8+, mas pode ajudar)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Retorna a conexão com o banco de dados
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("❌ Erro ao conectar ao banco: " + e.getMessage(), e);
        }
    }

    // Método para fechar a conexão com o banco de dados
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("❌ Erro ao fechar a conexão: " + e.getMessage(), e);
        }
    }
   
    
}

