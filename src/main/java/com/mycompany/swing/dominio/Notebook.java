package com.mycompany.swing.dominio;

public class Notebook {
    private String marca;
    private String modelo;
    private String capacidadeRam;
    private String velocidadeCpu;
    private String ipNotebook;
    private int fkUsuario;
    private int fkEmpresa;

    public Notebook(String marca, String modelo, String capacidadeRam, String velocidadeCpu, String ipNotebook, int fkUsuario, int fkEmpresa) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeRam = capacidadeRam;
        this.velocidadeCpu = velocidadeCpu;
        this.ipNotebook = ipNotebook;
        this.fkUsuario = fkUsuario;
        this.fkEmpresa = fkEmpresa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidadeRam() {
        return capacidadeRam;
    }

    public void setCapacidadeRam(String capacidadeRam) {
        this.capacidadeRam = capacidadeRam;
    }

    public String getVelocidadeCpu() {
        return velocidadeCpu;
    }

    public void setVelocidadeCpu(String velocidadeCpu) {
        this.velocidadeCpu = velocidadeCpu;
    }

    public String getIpNotebook() {
        return ipNotebook;
    }

    public void setIpNotebook(String ipNotebook) {
        this.ipNotebook = ipNotebook;
    }

    public int getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(int fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public int getFkEmpresa() {
        return fkEmpresa;
    }

    public void setFkEmpresa(int fkEmpresa) {
        this.fkEmpresa = fkEmpresa;
    }
}
