package com.mycompany.swing.dominio.entidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Alerta {
    public static void insertAlerta(Connection connection, double minCpu, double maxCpu, double minMemoria, double maxMemoria, int fkEmpresa) throws SQLException {
        String query = "INSERT INTO alerta (minCpu, maxCpu, minMemoria, maxMemoria, fkEmpresa) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDouble(1, minCpu);
            statement.setDouble(2, maxCpu);
            statement.setDouble(3, minMemoria);
            statement.setDouble(4, maxMemoria);
            statement.setInt(5, fkEmpresa);
            statement.executeUpdate();
        }
    }
}