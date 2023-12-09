/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.lojaamorimrh;
import com.mtsgamorim.enderecos.EnderecoResidencial;

// Matheus Amorim Garcia Santos - 201765142AC

public class Colaborador extends Pessoa {
    private String cargo;
    private double salario;
    private Loja loja;

    public Colaborador(String nome, int idade, String cpf, String telefone, EnderecoResidencial endereco,
                       String cargo, double salario, Loja loja) {
        super(nome, idade, cpf, endereco, telefone);
        this.cargo = cargo;
        this.salario = salario;
        this.loja = loja;
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

    @Override
    public String toString() {
        return "Colaborador" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", cpf='" + getCpf() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", loja=" + loja;
    }
}
