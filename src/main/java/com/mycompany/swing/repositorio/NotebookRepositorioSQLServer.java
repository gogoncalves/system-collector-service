package com.mycompany.swing.repositorio;

import com.mycompany.swing.dominio.Notebook;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;

public class NotebookRepositorioSQLServer {

    private final JdbcTemplate jdbcTemplate;

    public NotebookRepositorioSQLServer(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void inserir(Notebook notebook) {
        jdbcTemplate.update("INSERT INTO notebook (marca, modelo, capacidadeRam, velocidadeCpu, ipNotebook, fkUsuario, fkEmpresa) " + "VALUES (?, ?, ?, ?, ?, ?, ?)",
                notebook.getMarca(), notebook.getModelo(), notebook.getCapacidadeRam(), notebook.getVelocidadeCpu(), notebook.getIpNotebook(), notebook.getFkUsuario(), notebook.getFkEmpresa());
    }
}
