package com.mycompany.swing.repositorio;

import com.mycompany.swing.dominio.Leitura;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

public class LeituraRepositorio {

    final private JdbcTemplate jdbcTemplate;
    final private Connection jdbcTemplateMySQL;

    public LeituraRepositorio(JdbcTemplate jdbcTemplate, Connection jdbcTemplateMySQL) {
        this.jdbcTemplate = jdbcTemplate;
        this.jdbcTemplateMySQL = jdbcTemplateMySQL;
    }

    public void inserir(Leitura leitura) throws Exception {
        jdbcTemplate.update("""
                            INSERT INTO dadosCapturados (porcentagemUsoMemoria, PorcentagemUsoProcessador, dataHora, fkNotebook, fkUsuario, fkEmpresa) VALUES (?, ?, ?, ?, ?, ?)
                        """, leitura.getPercentualMemoria(), leitura.getPercentualCPU(), leitura.getDataHora(), leitura.getFkNotebook(),
                leitura.getFkUsuario(), leitura.getFkEmpresa());

        PreparedStatement stmt = jdbcTemplateMySQL.prepareStatement("INSERT INTO dadosCapturados (porcentagemUsoMemoria, PorcentagemUsoProcessador, dataHora, fkNotebook, fkUsuario, fkEmpresa) VALUES (?, ?, ?, ?, ?, ?)");
        stmt.setInt(1, leitura.getPercentualMemoria());
        stmt.setInt(2, leitura.getPercentualCPU());
        stmt.setTimestamp(3, Timestamp.valueOf(leitura.getDataHora()));
        stmt.setLong(4, leitura.getFkNotebook());
        stmt.setLong(5, leitura.getFkUsuario());
        stmt.setLong(6, leitura.getFkEmpresa());
        stmt.executeUpdate();
    }

}
