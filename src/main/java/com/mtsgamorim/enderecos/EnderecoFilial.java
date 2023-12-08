/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.enderecos;

/**
 *
 * @author Usuario
 */
public class EnderecoFilial extends Endereco {
    
    private final String tipo;

    public EnderecoFilial(String cep, String cidade, String estado) {
        super(cep, cidade, estado);
        this.tipo = "Residencial";
    }

    public String getTipo() {
        return tipo;
    }
}
