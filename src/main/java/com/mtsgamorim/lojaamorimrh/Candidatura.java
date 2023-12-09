/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.lojaamorimrh;
import com.mtsgamorim.enderecos.EnderecoResidencial;
import java.util.Date;

// Matheus Amorim Garcia Santos - 201765142AC

public class Candidatura extends Pessoa {
    private String cargo;
    private Date dataCriacao;
    private String etapaProcesso;

    public Candidatura(String nome, int idade, String cpf, EnderecoResidencial endereco, String telefone, String cargo, Date dataCriacao) {
        super(nome, idade, cpf, endereco, telefone);
        this.cargo = cargo;
        this.dataCriacao = dataCriacao;
        this.etapaProcesso = "Entrevista Inicial";
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getEtapaProcesso() {
        return etapaProcesso;
    }

    public void setEtapaProcesso(String etapaProcesso) {
        this.etapaProcesso = etapaProcesso;
    }

    @Override
    public String toString() {
        return "Candidatura:" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", cpf='" + getCpf() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", cargo='" + cargo + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", etapaProcesso='" + etapaProcesso;
    }
}
