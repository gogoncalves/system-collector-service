package com.mycompany.swing.dominio.entidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Usuario {
    public static void insertUsuario(Connection connection, String nome, String email, String senha, String tipo, int fkEmpresa) throws SQLException {
        String query = "INSERT INTO usuario (nome, email, senha, tipo, fkEmpresa) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nome);
            statement.setString(2, email);
            statement.setString(3, senha);
            statement.setString(4, tipo);
            statement.setInt(5, fkEmpresa);
            statement.executeUpdate();
        }
    }
}
