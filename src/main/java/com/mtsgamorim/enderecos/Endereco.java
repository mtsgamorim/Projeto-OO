/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.enderecos;

import com.mtsgamorim.validadores.ValidadorEndereco;

// Matheus Amorim Garcia Santos - 201765142AC

abstract class Endereco{
    private String cep;
    private String cidade;
    private String estado;

    public Endereco(String cep, String cidade, String estado) {
        if (!ValidadorEndereco.validarCEP(cep)) {
            throw new IllegalArgumentException("CEP inválido.");
        }
        
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }
     
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CEP: " + getCep() + " | Cidade: " + getCidade() + " | Estado: " + getEstado();
    }
}
