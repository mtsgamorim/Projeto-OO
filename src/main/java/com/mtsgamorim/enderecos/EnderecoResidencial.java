/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.enderecos;

public class EnderecoResidencial extends Endereco {
    private final String tipo;

    public EnderecoResidencial(String cep, String cidade, String estado) {
        super(cep, cidade, estado);
        this.tipo = "Residencial";
    }

    public String getTipo() {
        return tipo;
    }
}
