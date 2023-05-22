package com.mycompany.swing.dominio;

import java.time.LocalDateTime;

public class Leitura {
    final private Integer percentualMemoria;
    final private Integer percentualCPU;
    final private LocalDateTime dataHora;
    private int fkNotebook;
    private int fkUsuario;
    private int fkEmpresa;

    public Leitura(Integer percentualMemoria, Integer percentualCPU, LocalDateTime dataHora, int fkNotebook, int fkUsuario,
                   int fkEmpresa) {
        this.percentualMemoria = percentualMemoria;
        this.percentualCPU = percentualCPU;
        this.dataHora = dataHora;
        this.fkNotebook = fkNotebook;
        this.fkUsuario = fkUsuario;
        this.fkEmpresa = fkEmpresa;
    }

    public void setFkNotebook(int fkNotebook) {
        this.fkNotebook = fkNotebook;
    }

    public void setFkUsuario(int fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public void setFkEmpresa(int fkEmpresa) {
        this.fkEmpresa = fkEmpresa;
    }

    public Integer getPercentualMemoria() {
        return percentualMemoria;
    }

    public Integer getPercentualCPU() {
        return percentualCPU;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public int getFkNotebook() {
        return fkNotebook;
    }

    public int getFkUsuario() {
        return fkUsuario;
    }

    public int getFkEmpresa() {
        return fkEmpresa;
    }
}
