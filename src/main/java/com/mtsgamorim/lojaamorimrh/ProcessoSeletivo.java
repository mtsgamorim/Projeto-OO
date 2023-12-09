/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtsgamorim.lojaamorimrh;

import java.io.Serializable;

/**
 *
 * Matheus Amorim Garcia Santos - 201765142AC
 */
public class ProcessoSeletivo implements Serializable {
    private final String cargo;
    private final Loja loja;

    public ProcessoSeletivo(String cargo, Loja loja) {
        this.cargo = cargo;
        this.loja = loja;
    }

    public String getCargo() {
        return cargo;
    }

    public Loja getLoja() {
        return loja;
    }

    @Override
    public String toString() {
        return "ProcessoSeletivo:" +
                "cargo='" + cargo + '\'' +
                ", loja=" + loja;
    }
}