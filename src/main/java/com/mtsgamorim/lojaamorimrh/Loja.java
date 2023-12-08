/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.lojaamorimrh;

import com.mtsgamorim.enderecos.EnderecoFilial;

/**
 *
 * @author Usuario
 */
class Loja {
    // Atributos
    private String nome;
    private EnderecoFilial endereco;

    // Construtor
    public Loja(String nome, EnderecoFilial endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos de acesso (getters e setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnderecoFilial getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoFilial endereco) {
        this.endereco = endereco;
    }

    // Método toString para exibir informações da loja
    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
