package com.mycompany.swing.repositorio;

import com.mycompany.swing.dominio.Notebook;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class NotebookRepositorioMYSQL {

    private final Connection connection;

    public NotebookRepositorioMYSQL(Connection connection) {
        this.connection = connection;
    }

    public void inserir(Notebook notebook) throws Exception {
        String query = "INSERT INTO notebook (marca, modelo, capacidadeRam, velocidadeCpu, ipNotebook, fkUsuario, fkEmpresa) " + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, notebook.getMarca());
            statement.setString(2, notebook.getModelo());
            statement.setString(3, notebook.getCapacidadeRam());
            statement.setString(4, notebook.getVelocidadeCpu());
            statement.setString(5, notebook.getIpNotebook());
            statement.setInt(6, notebook.getFkUsuario());
            statement.setInt(7, notebook.getFkEmpresa());
            statement.executeUpdate();
        }
    }
}
