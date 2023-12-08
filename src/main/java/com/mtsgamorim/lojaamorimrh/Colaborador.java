/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.lojaamorimrh;
import com.mtsgamorim.enderecos.EnderecoResidencial;
import java.util.Date;

public class Colaborador extends Pessoa {
    // Atributos adicionais
    private final Date dataIngresso;
    private Date dataSaida;
    private String cargo;
    private double salario;
    private Loja loja;

    // Construtor com data de saída opcional
    public Colaborador(String nome, int idade, String cpf, EnderecoResidencial endereco,
                       Date dataIngresso, String cargo, double salario, Loja loja) {
        super(nome, idade, cpf, endereco);
        this.dataIngresso = dataIngresso;
        this.cargo = cargo;
        this.salario = salario;
        this.loja = loja;
    }

    // Métodos de acesso (getters e setters) para os novos atributos
    public Date getDataIngresso() {
        return dataIngresso;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Loja getLojaAtua() {
        return loja;
    }

    public void setLojaAtua(Loja loja) {
        this.loja = loja;
    }

    // Método toString para exibir informações do colaborador
    @Override
    public String toString() {
        return "Colaborador{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", cpf='" + getCpf() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", dataIngresso=" + dataIngresso +
                ", dataSaida=" + dataSaida +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", loja=" + loja +
                '}';
    }
}
