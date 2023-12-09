/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.lojaamorimrh;

import com.mtsgamorim.enderecos.EnderecoFilial;

/**
 *
 *  Matheus Amorim Garcia Santos - 201765142AC
 */
public class Loja {
    private String nome;
    private EnderecoFilial endereco;

    public Loja(String nome, EnderecoFilial endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

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

    @Override
    public String toString() {
        return "Nome: " + nome + " | Endereço: " + endereco.toString();
    }
}
