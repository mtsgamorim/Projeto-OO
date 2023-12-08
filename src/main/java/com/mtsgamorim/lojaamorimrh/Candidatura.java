/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.lojaamorimrh;
import com.mtsgamorim.enderecos.EnderecoResidencial;
import java.util.Date;

public class Candidatura extends Pessoa {
     // Atributos adicionais
    private String cargo;
    private Date dataCriacao;
    private String etapaProcesso;

    // Construtor específico para Candidatura
    public Candidatura(String nome, int idade, String cpf, EnderecoResidencial endereco, String cargo, Date dataCriacao, String etapaProcesso) {
        super(nome, idade, cpf, endereco);
        this.cargo = cargo;
        this.dataCriacao = dataCriacao;
        this.etapaProcesso = etapaProcesso;
    }

    // Métodos de acesso (getters e setters) para os novos atributos
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

    // Método toString para exibir informações da candidatura
    @Override
    public String toString() {
        return "Candidatura{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", cpf='" + getCpf() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", cargo='" + cargo + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", etapaProcesso='" + etapaProcesso + '\'' +
                '}';
    }
}
