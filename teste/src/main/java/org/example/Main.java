package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://45.224.181.112:8080/esus";
        String username = "postgres";
        String password = "]+5Tw_z87zXyJT@jVb-gJAKB5aO";

        try {
            // Registrar o driver JDBC
            Class.forName("org.postgresql.Driver");

            // Estabelecer a conexão
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Exemplo de consulta
            // Aqui você pode executar suas consultas SQL usando a conexão

            // Fechar a conexão
            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados");
            e.printStackTrace();
        }
    }
}
