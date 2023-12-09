/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.lojaamorimrh;

import com.mtsgamorim.enderecos.EnderecoResidencial;
import com.mtsgamorim.validadores.ValidadorPessoa;

// Matheus Amorim Garcia Santos - 201765142AC

abstract class Pessoa {

    private String nome;
    private int idade;
    private String cpf;
    private EnderecoResidencial endereco;
    private String telefone;

    public Pessoa(String nome, int idade, String cpf, EnderecoResidencial endereco, String telefone) {
        
        if (!ValidadorPessoa.validarIdade(idade)) {
            throw new IllegalArgumentException("Idade deve ser maior que 18 e menor que 150.");
        }

        if (!ValidadorPessoa.validarCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido.");
        }

        if (!ValidadorPessoa.validarTelefone(telefone)) {
            throw new IllegalArgumentException("Telefone inválido.");
        }
        
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public EnderecoResidencial getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoResidencial endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa:" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco;
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
    }
}
